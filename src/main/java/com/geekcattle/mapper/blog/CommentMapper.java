package com.geekcattle.mapper.blog;

import com.geekcattle.model.blog.Comment;
import com.geekcattle.util.CustomerMapper;
import org.springframework.stereotype.Service;

@Service
public interface CommentMapper extends CustomerMapper<Comment> {

}
