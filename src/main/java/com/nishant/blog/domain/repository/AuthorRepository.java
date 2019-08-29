package com.nishant.blog.domain.repository;

import com.nishant.blog.domain.Author;
import com.nishant.blog.domain.Identity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;


/**
 * The interface Author repository.
 */
public interface AuthorRepository {

    /**
     * Find by id optional.
     *
     * @param id the id
     * @return the optional
     */
    Optional<Author> findById(Identity id);

    /**
     * Save/Update author.
     *
     * @param author the author
     * @return the author
     */
    Author save(Author author);

    /**
     * Delete boolean.
     *
     * @param author the author
     * @return the boolean
     */
    boolean delete(Author author);

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
    List<Author> findAll();

    /**
     * Find all list.
     *
     * @param page the page
     * @return the list
     */
    List<Author> findAll(int page);

}
