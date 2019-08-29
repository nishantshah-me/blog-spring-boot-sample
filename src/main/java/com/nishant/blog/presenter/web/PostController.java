package com.nishant.blog.presenter.web;

import com.nishant.blog.data.jpa.repo.JpaPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    @Autowired
    private JpaPostRepository jpaPostRepository;


    @RequestMapping("/posts")
    public String getPost(Model model){
        model.addAttribute("posts", jpaPostRepository.findAll());
        return "post";
    }
}
