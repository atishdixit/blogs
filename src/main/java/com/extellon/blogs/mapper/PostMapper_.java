package com.extellon.blogs.mapper;

import com.extellon.blogs.dto.PostDto;
import com.extellon.blogs.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface PostMapper_ {

    @Mapping(target = "id", ignore = true)
    Post PostDtoToPostEntity(PostDto postDto);
}
