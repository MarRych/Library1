package com.example.demo.Book.BookService;

import com.example.demo.Book.BookData;
import com.example.demo.Book.BookDto;
import com.example.demo.Book.BookRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.awt.print.Book;


@Getter
@Setter
@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;


    public BookDto findBookByTitleAndStatus(final String bookTitle, boolean bookStatus) {
        final BookData bookByTitle = bookRepository.findBookByBookTitleAndBookStatus(bookTitle, bookStatus);
        return new BookDto(bookByTitle.getBookTitle(), bookByTitle.isBookStatus());
    }


    public void save(Book book) {
    }

    public void deleteBookByTitle(String bookTitle) {
    }
}
