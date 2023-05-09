package com.satinfo.demo.service;

import com.satinfo.demo.entity.Comment;
import com.satinfo.demo.persistance.CommentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImplementations implements CommentServiceDeclarations {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImplementations(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    @Transactional
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    @Transactional
    public Comment getCommentById(Long id) {
        return commentRepository.findById(id).get();
    }

    @Override
    @Transactional
    public List<Comment> getCommentsByPostId(Long postId) {
        return commentRepository.findAllByPostId(postId);
    }

    @Override
    @Transactional
    public void insertComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    @Transactional
    public void updateComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    @Transactional
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}
