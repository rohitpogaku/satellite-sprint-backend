package com.satinfo.demo.service;

import com.satinfo.demo.entity.Post;

import java.util.List;

public interface PostServiceDeclarations {
    List<Post> getAllPosts();

    Post getPostById(Long id);

    void insertPost(Post post);

    void updatePost(Post post);

    void deletePost(Long id);
}
