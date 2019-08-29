package com.nishant.blog.domain.repository;

import com.nishant.blog.domain.Author;
import com.nishant.blog.domain.Identity;
import com.nishant.blog.domain.Post;

import java.util.List;
import java.util.Optional;


/**
 * The interface Author repository.
 */
public interface PostRepository {

    /**
     * Find by id optional.
     *
     * @param id the id
     * @return the optional
     */
    Optional<Post> findById(Identity id);

    /**
     * Save/Update Post.
     *
     * @param post the Post
     * @return the Post
     */
    Post save(Post post);

    /**
     * Delete boolean.
     *
     * @param post the Post
     * @return the boolean
     */
    boolean delete(Post post);

    /**
     * Delete boolean.
     *
     * @param id the id
     * @return the boolean
     */
    boolean delete(Identity id);


    /**
     * Find all list.
     *
     * @return the list
     */
    List<Post> findAll();

    /**
     * Find all list.
     *
     * @param page the page-number
     * @param page the page-size
     * @return the list
     */
    List<Post> findAll(int size,int page);

}
