package dev.sumana.cmappings.utils;

import dev.sumana.cmappings.model.dto.PostDTO;
import dev.sumana.cmappings.model.entity.Author;
import dev.sumana.cmappings.model.entity.Post;

public class PostConverter {
    public static Post postDtoToEntity(PostDTO postDTO) throws InstantiationException, IllegalAccessException {
        Post post = GenericConverter.convertTo(postDTO, Post.class);
        Author author = new Author();
        author.setEmail(postDTO.getAuthorEmail());
        post.setAuthor(author);
        return post;
    }
}
