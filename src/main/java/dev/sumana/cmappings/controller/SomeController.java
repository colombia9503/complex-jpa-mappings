package dev.sumana.cmappings.controller;

import dev.sumana.cmappings.model.dto.AuthorDTO;
import dev.sumana.cmappings.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.Callable;

@RestController
@RequestMapping("/")
public class SomeController {

    private AuthorService authorService;

    public SomeController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    @RequestMapping("authors")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Callable<Object> createAuthor(@RequestBody AuthorDTO authorDTO) {
        return () -> authorService.createAuthor(authorDTO);
    }

    @PostMapping
    @RequestMapping("posts")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Callable<Object> createPost() {
        return () -> null;
    }

    @PostMapping
    @RequestMapping("comment")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Callable<Object> addComment() {
        return () -> null;
    }


}
