package com.geekcattle.controller.blog;

import com.geekcattle.mapper.blog.LifeShareMapper;
import com.geekcattle.model.blog.LifeShare;
import com.geekcattle.util.ReturnUtil;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/artilce")
public class articleController {
    @Resource
    private LifeShareMapper lifeShareMapper;
    //todo 获取文章标题数据
    @RequestMapping(value = "/aitletitle", method = RequestMethod.GET)
    public ModelMap getAlitleDta(HttpServletRequest request) {
        try {
            List<LifeShare> lifeShareList = lifeShareMapper.selectAllData();
            return ReturnUtil.Success(null, lifeShareList.size(), null);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error(null, null, null);
        }
    }

    //todo 获取文章标题数据
    @RequestMapping(value = "/getPagingAllData", method = RequestMethod.GET)
    public ModelMap getPagingAllData(HttpServletRequest request) {
        try {
            int currPage = Integer.parseInt(request.getParameter("startPage")); //从第几个数据开始
            int pageSize = Integer.parseInt(request.getParameter("endPade")); //查询多少个数据

            Map<String, Object> data = new HashedMap();
            data.put("currIndex", (currPage-1)*pageSize);
            data.put("pageSize", pageSize);
            List<LifeShare> lifeShareList = lifeShareMapper.selectPagingAllData(data);
            return ReturnUtil.Success(null, lifeShareList, null);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error(null, null, null);
        }
    }


    //todo 获取文章标题数据
    @RequestMapping(value = "/aitlecontent", method = RequestMethod.GET)
    public ModelMap getAitlecontent(HttpServletRequest request) {
        try {
            String id = request.getParameter("id");
            LifeShare lifeShare = lifeShareMapper.selectAllDataById(id);
            return ReturnUtil.Success(null, lifeShare.getContent(), null);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error(null, null, null);
        }
    }
}
