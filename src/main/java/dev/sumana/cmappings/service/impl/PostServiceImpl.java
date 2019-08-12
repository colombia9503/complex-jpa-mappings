package dev.sumana.cmappings.service.impl;

import dev.sumana.cmappings.model.dto.PostDTO;
import dev.sumana.cmappings.model.entity.Post;
import dev.sumana.cmappings.repository.PostRepository;
import dev.sumana.cmappings.service.PostService;
import dev.sumana.cmappings.utils.GenericConverter;
import dev.sumana.cmappings.utils.PostConverter;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDTO createPost(PostDTO postDTO) throws IllegalAccessException, InstantiationException {
        Post post = postRepository.save(PostConverter.postDtoToEntity(postDTO));
        return GenericConverter.convertTo(post, PostDTO.class);
    }
}
