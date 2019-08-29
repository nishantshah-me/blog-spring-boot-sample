package com.nishant.blog.presenter.bootstrap;

import com.nishant.blog.data.jpa.entity.AuthorData;
import com.nishant.blog.data.jpa.entity.PostData;
import com.nishant.blog.data.jpa.repo.JpaAuthorRepository;
import com.nishant.blog.data.jpa.repo.JpaPostRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private JpaAuthorRepository authorRepository;
    private JpaPostRepository jpaPostRepository;

    public DevBootstrap(JpaAuthorRepository authorRepository, JpaPostRepository jpaPostRepository) {
        this.authorRepository = authorRepository;
        this.jpaPostRepository = jpaPostRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {

        AuthorData a1 = new AuthorData();
        a1.setFirstName("Nishant");
        a1.setLastName("Shah");
        AuthorData savedAuthorData = authorRepository.save(a1);



        PostData postData = new PostData();
        postData.setAuthorData(savedAuthorData);
        postData.setDescription("Post1 is something new. ");
        postData.setTitle("Post1");


        PostData p2 = new PostData();
        p2.setAuthorData(savedAuthorData);
        p2.setDescription("Post2 is something old ");
        p2.setTitle("Post2");


        jpaPostRepository.save(postData);
        jpaPostRepository.save(p2);

        savedAuthorData.getPostData().add(postData);
        savedAuthorData.getPostData().add(p2);


    }
}
