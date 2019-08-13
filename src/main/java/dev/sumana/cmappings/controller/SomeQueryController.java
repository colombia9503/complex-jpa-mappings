package dev.sumana.cmappings.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.Callable;

@RestController
@RequestMapping("/query")
public class SomeQueryController {

    @GetMapping(value = "posts", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Callable<Object> getPostsByFilters(@RequestParam(name = "queryParams", required = false) String queryParams) {
        return () -> {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(queryParams, ObjectNode.class).put("status", "OK").toString();
        };
    }
}
