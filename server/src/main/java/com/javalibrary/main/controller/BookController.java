package com.javalibrary.main.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javalibrary.main.model.*;
import com.javalibrary.main.constant.*;

@RestController
public class BookController {

  @GetMapping(ApiConstant.API_URL + "books")
  public List<BookModel> getAllBooks() {
    List<BookModel> books = new ArrayList<>();
    BookModel newBook = new BookModel("My first book", (short) 10);

    books.add(newBook);

    System.out.println(books);
    System.out.println(ApiConstant.API_URL);

    return books;
  }
}