package com.springbootpostgresqlsample1.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootpostgresqlsample1.domain.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
