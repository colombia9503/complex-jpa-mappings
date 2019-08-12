package dev.sumana.cmappings.utils;

import dev.sumana.cmappings.model.dto.CommentDTO;
import dev.sumana.cmappings.model.entity.Author;
import dev.sumana.cmappings.model.entity.Comment;
import dev.sumana.cmappings.model.entity.Post;

public class CommentConverter {
    public static Comment commentDtoToEntity(CommentDTO commentDTO) throws InstantiationException, IllegalAccessException {
        Comment comment = GenericConverter.convertTo(commentDTO, Comment.class);
        Author author = new Author();
        author.setEmail(commentDTO.getAuthorEmail());

        Post post = new Post();
        post.setId(commentDTO.getPostId());

        comment.setAuthor(author);
        comment.setPost(post);

        return comment;
    }
}
