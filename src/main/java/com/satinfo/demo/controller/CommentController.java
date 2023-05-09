package com.satinfo.demo.controller;

import com.satinfo.demo.entity.Comment;
import com.satinfo.demo.service.CommentServiceImplementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private final CommentServiceImplementations commentServiceImplementations;

    @Autowired
    public CommentController(CommentServiceImplementations commentServiceImplementations) {
        this.commentServiceImplementations = commentServiceImplementations;
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return commentServiceImplementations.getAllComments();
    }

    @GetMapping("/{commentId}")
    public Comment getCommentById(@PathVariable("commentId") Long id) {
        return commentServiceImplementations.getCommentById(id);
    }

    @GetMapping("/posts/{postId}")
    public List<Comment> getAllCommentsByPostId(@PathVariable("postId") Long id) {
        return commentServiceImplementations.getCommentsByPostId(id);
    }

    @PostMapping
    public void insertComment(@RequestBody Comment comment) {
        comment.setId(0L);
        commentServiceImplementations.insertComment(comment);
    }


    @PutMapping
    public void updateComment(@RequestBody Comment comment) {
        commentServiceImplementations.updateComment(comment);
    }

    @DeleteMapping("/{commentId}")
    public void deleteComment(@PathVariable("commentId") Long id) {
        commentServiceImplementations.deleteComment(id);
    }
}
