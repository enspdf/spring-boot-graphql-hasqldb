package me.shackox.graphql.springbootgraphqlexample.service.datafetcher;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import me.shackox.graphql.springbootgraphqlexample.model.Book;
import me.shackox.graphql.springbootgraphqlexample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDataFetcher implements DataFetcher<Book>{

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book get(DataFetchingEnvironment dataFetchingEnvironment) {

        String isn = dataFetchingEnvironment.getArgument("id");

        return bookRepository.findOne(isn);
    }
}
