package com.extellon.blogs.service;

import com.extellon.blogs.dto.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> findAllPosts();
    void createPost(PostDto postDto);
}
