package com.bokie.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;
    public void addAuthor(Author author){
        repository.addAuthor(author);
    }
    public void addBook(Book book){
        repository.addBook(book);
    }
    public String getBookName(){
        return repository.getBookName();
    }
    public void updatePage(String bookname,int pages ){
    repository.updatePage(bookname,pages);
    }
    public int totalBook(@RequestParam double rating){
        return repository.totalBook(rating);
    }
}
