package com.nishant.blog.data.repository;

import com.nishant.blog.data.jpa.repo.JpaAuthorRepository;
import com.nishant.blog.data.mapper.AuthorDataMapper;
import com.nishant.blog.domain.Author;
import com.nishant.blog.domain.Identity;
import com.nishant.blog.domain.repository.AuthorRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {

    private JpaAuthorRepository jpaAuthorRepository;
    private AuthorDataMapper authorDataMapper;

    public AuthorRepositoryImpl(JpaAuthorRepository jpaAuthorRepository) {
        this.jpaAuthorRepository = jpaAuthorRepository;
        this.authorDataMapper = new AuthorDataMapper();
    }

    @Override
    public Optional<Author> findById(Identity id) {
        return Optional.empty();
    }

    @Override
    public Author save(Author author) {
        return null;
    }

    @Override
    public boolean delete(Author author) {
        return false;
    }

    @Override
    public boolean delete(Identity id) {
        return false;
    }

    @Override
    public List<Author> findAll() {
        return jpaAuthorRepository.findAll()
                .parallelStream()
                .map(authorData -> authorDataMapper.from(authorData))
                .collect(Collectors.toList());
    }

    @Override
    public List<Author> findAll(int page) {
        return null;
    }
}
