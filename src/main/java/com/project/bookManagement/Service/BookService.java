package com.project.bookManagement.Service;

import com.project.bookManagement.Entity.Book;
import com.project.bookManagement.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public Book createBook(Book book){
       return bookRepository.save(book);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public Book updateBook(int id,Book book){
        book.setId(id);
        return bookRepository.save(book);
    }
    public ResponseEntity<?> deleteBook(int id){
       bookRepository.deleteById(id);
       return ResponseEntity.ok().build();
    }
    public Book findBookById(int id){
        return bookRepository.findBookById(id);
    }
}
