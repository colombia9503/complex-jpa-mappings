package dev.sumana.cmappings.service;

import dev.sumana.cmappings.model.dto.CommentDTO;

public interface CommentService {
    CommentDTO addComment(CommentDTO commentDTO) throws IllegalAccessException, InstantiationException;
}
