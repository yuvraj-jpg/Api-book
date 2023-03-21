package com.bokie.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@org.springframework.stereotype.Repository
public class Repository {
    private HashMap<String , Author> authorrecord ;
    private HashMap<String , Book> bookrecord ;
    public Repository() {
        this.authorrecord = new HashMap<>();
        this.bookrecord = new HashMap<>();
    }
    public void addAuthor(Author author){
        authorrecord.put(author.getAuthorName(),author);
    }
    public void addBook(Book book){
        bookrecord.put(book.getBookName(),book);
    }
    public String getBookName(){
        int c =0;
        String ans = "";
        for(String x : bookrecord.keySet()){
            if(bookrecord.get(x).getPages()>c){
                c=bookrecord.get(x).getPages();
                ans = x;
            }
        }
        return ans;
    }
    public void updatePage(String bookname,int pages ){
     for(String x : bookrecord.keySet()){
         if(x.equals(bookname)){
             bookrecord.get(x).setPages(pages);
         }
     }
    }
    public int totalBook(@RequestParam double rating){
        int c =0;
        for(String author : authorrecord.keySet()){
            if(authorrecord.get(author).getRating() > rating){
                c++;
            }
        }
        return c;
    }
}
