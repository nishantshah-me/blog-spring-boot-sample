package com.nishant.blog.data.jpa.repo;

import com.nishant.blog.data.jpa.entity.PostData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPostRepository extends JpaRepository<PostData,Long> {
}
