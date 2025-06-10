package com.project.bookManagement.Controller;

import com.project.bookManagement.Entity.Book;
import com.project.bookManagement.Repository.BookRepository;
import com.project.bookManagement.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @PutMapping("/books/{id}")
    public Book updateBooks(@PathVariable int id,@RequestBody Book book){
        return bookService.updateBook(id,book);
    }
    @DeleteMapping("/books/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable int id){
        return bookService.deleteBook(id);
    }
    @GetMapping("/books/{id}")
    public Book findBookById(@PathVariable int id){
        return bookService.findBookById(id);
    }

}
