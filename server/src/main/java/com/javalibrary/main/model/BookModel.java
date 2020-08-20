package com.javalibrary.main.model;

public class BookModel {
  private String title;
  private short numberOfPages;

  public BookModel(String title, short numberOfPages) {
    this.title = title;
    this.numberOfPages = numberOfPages;
  }

  public String getTitle() {
    return this.title;
  }

  public short getNumberOfPages() {
    return this.numberOfPages;
  }
}