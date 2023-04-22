package com.example.demo.Book;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UserData")
public class BookData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUserData;

    @Column(name = "Book ID", nullable = false)
    private int bookId;

    @Column(name = "Tile", nullable = false)
    private String title;

    @Column(name = "Author", nullable = false)
    private String author;
}

