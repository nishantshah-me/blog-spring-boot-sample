package com.nishant.blog.presenter.rest;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.nishant.blog.data.jpa.entity.PostData;
import com.nishant.blog.data.jpa.repo.JpaPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostRestController {

    @Autowired
    private JpaPostRepository jpaPostRepository;

    @JsonManagedReference
    @RequestMapping("/posts")
    public List<PostData> getPost(Model model){
       return jpaPostRepository.findAll();
    }
}
