package dev.sumana.cmappings.service;

import dev.sumana.cmappings.model.dto.PostDTO;

public interface PostService {
    PostDTO createPost(PostDTO postDTO) throws IllegalAccessException, InstantiationException;
}
