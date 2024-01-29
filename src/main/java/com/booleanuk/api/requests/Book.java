package com.booleanuk.api.requests;

public class Book {
    private static int nextBookId = 0;
    private int bookId;
    private String title;
    private int numPages;
    private String author;
    private String genre;


    public Book(String title, int numPages, String author, String genre) {
        this.bookId = nextBookId++;
        this.title = title;
        this.numPages = numPages;
        this.author = author;
        this.genre = genre;

    }

    public int getBookId() {
        return bookId;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}