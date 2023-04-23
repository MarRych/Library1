package com.example.demo.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<BookData, Long> {



    BookData findBookByBookTitleAndBookStatus(final String bookTitle, final boolean bookStatus);
}
