package dev.sumana.cmappings.controller;

import dev.sumana.cmappings.model.dto.AuthorDTO;
import dev.sumana.cmappings.model.dto.CommentDTO;
import dev.sumana.cmappings.model.dto.PostDTO;
import dev.sumana.cmappings.service.AuthorService;
import dev.sumana.cmappings.service.CommentService;
import dev.sumana.cmappings.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.Callable;

@RestController
@RequestMapping("/")
public class SomeController {

    private AuthorService authorService;
    private CommentService commentService;
    private PostService postService;

    public SomeController(AuthorService authorService, CommentService commentService, PostService postService) {
        this.authorService = authorService;
        this.commentService = commentService;
        this.postService = postService;
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
    public Callable<Object> createPost(@RequestBody PostDTO postDTO) {
        return () -> postService.createPost(postDTO);
    }

    @PostMapping
    @RequestMapping("comments")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Callable<Object> addComment(@RequestBody CommentDTO commentDTO) {
        return () -> commentService.addComment(commentDTO);
    }


}
