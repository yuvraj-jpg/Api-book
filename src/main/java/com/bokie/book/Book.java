package com.bokie.book;

public class Book {
    private String bookName;
    private int pages;
    private String authorName;
    private double rating;

    public Book() {
    }

    public Book(String bookName, int pages, String authorName, double rating) {
        this.bookName = bookName;
        this.pages = pages;
        this.authorName = authorName;
        this.rating = rating;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
