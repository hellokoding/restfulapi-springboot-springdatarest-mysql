package com.hellokoding.restfulapi.repository;

import com.hellokoding.restfulapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Integer>{
}
