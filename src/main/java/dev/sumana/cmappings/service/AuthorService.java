package dev.sumana.cmappings.service;

import dev.sumana.cmappings.model.entity.Author;
import dev.sumana.cmappings.model.dto.AuthorDTO;


public interface AuthorService {
    AuthorDTO createAuthor(AuthorDTO author) throws InstantiationException, IllegalAccessException;
}
