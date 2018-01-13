package me.shackox.graphql.springbootgraphqlexample.service.datafetcher;


import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import me.shackox.graphql.springbootgraphqlexample.model.Book;
import me.shackox.graphql.springbootgraphqlexample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllBooksDataFetcher implements DataFetcher<List<Book>> {
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> get(DataFetchingEnvironment dataFetchingEnvironment) {
        return bookRepository.findAll();
    }
}
