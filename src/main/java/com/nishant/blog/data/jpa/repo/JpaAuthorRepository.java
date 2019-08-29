package com.nishant.blog.data.jpa.repo;

import com.nishant.blog.data.jpa.entity.AuthorData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaAuthorRepository extends JpaRepository<AuthorData,Long> {
}
