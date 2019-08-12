package dev.sumana.cmappings.service.impl;

import dev.sumana.cmappings.model.dto.CommentDTO;
import dev.sumana.cmappings.model.entity.Comment;
import dev.sumana.cmappings.repository.CommentRepository;
import dev.sumana.cmappings.service.CommentService;
import dev.sumana.cmappings.utils.CommentConverter;
import dev.sumana.cmappings.utils.GenericConverter;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentDTO addComment(CommentDTO commentDTO) throws IllegalAccessException, InstantiationException {
        Comment comment = commentRepository.save(CommentConverter.commentDtoToEntity(commentDTO));
        return GenericConverter.convertTo(comment, CommentDTO.class);
    }
}
