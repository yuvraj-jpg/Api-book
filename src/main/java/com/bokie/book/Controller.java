package com.bokie.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    Service service;
    @PostMapping("/addauthor")
    public String addAuthor(@RequestBody Author author){
     service.addAuthor(author);
     return "Add author";
    }
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book){
        service.addBook(book);
        return "add book";
    }
    @GetMapping("/getbookname")
    public String getBookName(){
        return service.getBookName();
    }
    //PUT the (path bookname, updated pages);
    @PutMapping("/updatepage/{bookname}")
    public String updatePage(@PathVariable String bookname,@RequestParam int pages ){
        service.updatePage(bookname,pages);
        return "update";
    }
    //GET:  Find out total no. the books whose authors have rating greater than x
    @GetMapping("/totalbook")
    public int totalBook(@RequestParam double rating ){
        return service.totalBook(rating);
    }

}
