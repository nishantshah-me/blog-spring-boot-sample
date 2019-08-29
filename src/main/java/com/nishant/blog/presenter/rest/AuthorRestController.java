package com.nishant.blog.presenter.rest;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.nishant.blog.domain.Author;
import com.nishant.blog.domain.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AuthorRestController {

    @Autowired
    private AuthorRepository authorRepository;

    @JsonManagedReference
    @RequestMapping("/authors")
    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }
}
