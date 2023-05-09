package com.satinfo.demo.service;

import com.satinfo.demo.entity.Post;
import com.satinfo.demo.persistance.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImplementations implements PostServiceDeclarations {
    private final PostRepository postRepository;

    @Autowired
    public PostServiceImplementations(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    @Transactional
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    @Transactional
    public Post getPostById(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void insertPost(Post post) {
        postRepository.save(post);
    }

    @Override
    @Transactional
    public void updatePost(Post post) {
        postRepository.save(post);
    }

    @Override
    @Transactional
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
