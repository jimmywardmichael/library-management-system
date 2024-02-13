package com.application.courselibrary.repository;

import com.application.courselibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Book, Long> {
}
