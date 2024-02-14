package com.application.courselibrary.service;

import com.application.courselibrary.entity.Author;
import com.application.courselibrary.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    //Method gets book by id endpoint
    public Author findAuthorById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Author not found"));
        return author;
    }

    public void createAuthor(Author author) {
        authorRepository.save(author);
    }

    public void deleteAuthor(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Author not found"));
        authorRepository.deleteById(author.getId());
    }
}