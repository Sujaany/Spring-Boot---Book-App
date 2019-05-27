package com.example.bookApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders="*")
@RestController
//@RequestMapping
public class BookController {
	
	@Autowired
	BookService bookService;
	
	  @GetMapping("/book")
	  public List<Book> getBook() {
	    return bookService.viewAllBook();      
	  }
	  
	  @PostMapping("/book")
	  public ResponseEntity<String> addBook(@RequestBody Book book) {
		  String msg=null;
		if(bookService.addBook(book)) {
			msg="CREATED";
		}else {
		msg= "NOT CREATED";
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
	  }
	  
//	  @PostMapping("/book")
//	  public void addBook(@RequestBody Book book) {
//	  bookService.addBook(book);
//	  }
	  
	  @PutMapping("/book/{id}")
	  public void updateBook(@RequestBody Book book,@PathVariable Integer id) {
	  bookService.updateBook(id, book);
	  }
	  @DeleteMapping("/book/{id}")
	  public void deleteBook(@PathVariable Integer id) {
	  bookService.deleteBook(id);
	  }
}
