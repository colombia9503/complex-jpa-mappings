package dev.sumana.cmappings.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
@RequestMapping("/")
public class SomeController {

    @PostMapping
    @RequestMapping("authors")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Callable<Object> createAuthor() {
        return () -> null;
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
