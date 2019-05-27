package com.example.bookApp;

import java.util.ArrayList;
import java.util.List;

public class BookDTOToBook {
	
	public static Book mapBookToBookDto(BookDTO bookDTO) {
	    Book book = new Book();
	    if (bookDTO != null) {
	    	bookDTO.setId(bookDTO.getId());
	    	bookDTO.setTitle(bookDTO.getTitle());
	    	bookDTO.setRating(bookDTO.getRating());
	    }
	    return book;
	  }

	  public static List<Book> mapToBookList(
	      List<BookDTO> bookDTOList) {
	    List<Book> bookList = new ArrayList<Book>();

	    if (bookDTOList != null) {
	      for (BookDTO leaveAllocationData : bookDTOList) {
	    	  bookList.add(mapBookToBookDto(leaveAllocationData));
	      }
	    }
	    return bookList;
	  }
	}

