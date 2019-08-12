package dev.sumana.cmappings.service.impl;

import dev.sumana.cmappings.model.dto.AuthorDTO;
import dev.sumana.cmappings.model.entity.Author;
import dev.sumana.cmappings.repository.AuthorRepository;
import dev.sumana.cmappings.service.AuthorService;
import dev.sumana.cmappings.utils.GenericConverter;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorDTO createAuthor(AuthorDTO authorDTO) throws InstantiationException, IllegalAccessException {
        Author author = authorRepository.save(GenericConverter.convertTo(authorDTO, Author.class));
        return GenericConverter.convertTo(author, AuthorDTO.class);
    }
}
