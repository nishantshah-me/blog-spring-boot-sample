package com.nishant.blog.data.mapper;

import com.nishant.blog.data.jpa.entity.AuthorData;
import com.nishant.blog.domain.Author;
import com.nishant.blog.domain.Identity;
import com.nishant.blog.domain.Post;
import com.nishant.blog.domain.Status;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


public class AuthorDataMapper {

    public Author from(AuthorData authorData){
        return new Author(new Identity(authorData.getId()),
                Status.ACTIVE,
                authorData.getFirstName()+" "+authorData.getLastName(),
                authorData.getEmail(),
                authorData.getAvatar(),
                authorData.isGender(),
                new ArrayList<Post>(),
                authorData.isActive(),
                authorData.isDeleted(),
                authorData.getCreatedAt(),
                authorData.getUpdatedAt()
                );
    }
}
