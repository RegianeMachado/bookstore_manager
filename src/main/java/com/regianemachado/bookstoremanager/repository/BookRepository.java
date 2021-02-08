package com.regianemachado.bookstoremanager.repository;

import com.regianemachado.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
