package com.satinfo.demo.controller;

import com.satinfo.demo.entity.Post;
import com.satinfo.demo.service.PostServiceImplementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private final PostServiceImplementations postServiceImplementations;

    @Autowired
    public PostController(PostServiceImplementations postServiceImplementations) {
        this.postServiceImplementations = postServiceImplementations;
    }


    @GetMapping
    public List<Post> getAllPosts() {
        return postServiceImplementations.getAllPosts();
    }


    @GetMapping("/{postId}")
    public Post getPostById(@PathVariable("postId") Long id) {
        return postServiceImplementations.getPostById(id);
    }

    @PostMapping
    public void insertPost(@RequestBody Post post) {
        post.setId(0L);
        post.setPostDate(Date.valueOf(LocalDate.now()));
        postServiceImplementations.insertPost(post);
    }

    @PutMapping
    public void updatePost(@RequestBody Post post) {
        post.setPostDate(Date.valueOf(LocalDate.now()));
        postServiceImplementations.updatePost(post);
    }

    @DeleteMapping("/{postId}")
    public void deletePost(@PathVariable("postId") Long id) {
        postServiceImplementations.deletePost(id);
    }
}
