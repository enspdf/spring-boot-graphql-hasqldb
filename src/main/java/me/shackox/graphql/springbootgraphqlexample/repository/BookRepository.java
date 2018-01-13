package me.shackox.graphql.springbootgraphqlexample.repository;

import me.shackox.graphql.springbootgraphqlexample.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}