package com.satinfo.demo.service;

import com.satinfo.demo.entity.Comment;

import java.util.List;

public interface CommentServiceDeclarations {
    List<Comment> getAllComments();

    Comment getCommentById(Long id);

    List<Comment> getCommentsByPostId(Long postId);

    void insertComment(Comment comment);

    void updateComment(Comment comment);

    void deleteComment(Long id);
}
