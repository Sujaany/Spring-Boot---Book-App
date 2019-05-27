package com.example.bookApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;

	@Override
	public boolean addBook(Book book) {
		if (book != null) {
			bookRepository.save(book);
			return true;
		}
		return false;
	}

	
	@Override
	public List<Book> viewAllBook() {
		return bookRepository.findAll();
	}

	@Override
	public boolean deleteBook(Integer id) {
		if (bookRepository.getOne(id)!= null) {
			bookRepository.deleteById(id);
			return true;
		}
		return false;
	}


	@Override
	public boolean updateBook(Integer id, Book book) {
		Book existBook = bookRepository.getOne(id);
		if(existBook.getId()!=null) {

		book.setId(id);
		bookRepository.save(book);
		}
		return true;
		
		}
	
	

//	@Override
//	public List<Book> getAllBook() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
