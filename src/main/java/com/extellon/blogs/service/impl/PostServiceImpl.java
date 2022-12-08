package com.extellon.blogs.service.impl;

import com.extellon.blogs.dto.PostDto;
import com.extellon.blogs.entity.Post;
import com.extellon.blogs.mapper.PostMapper;
import com.extellon.blogs.repository.PostRepository;
import com.extellon.blogs.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Override
    public List<PostDto> findAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream().map(PostMapper::mapToPostDto)
                .collect(Collectors.toList());
    }

    @Override
    public void createPost(PostDto postDto) {
        Post post = PostMapper.mapToPost(postDto);
        postRepository.save(post);
    }
}
