package com.example.bookApp;

import java.util.List;

public interface BookService {
	boolean addBook(Book book);
	List<Book> viewAllBook();
	boolean deleteBook(Integer id);
	boolean updateBook(Integer id,Book book);
	
}
