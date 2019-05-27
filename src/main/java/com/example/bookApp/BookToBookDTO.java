package com.example.bookApp;

import java.util.ArrayList;
import java.util.List;


public class BookToBookDTO {
	
	  public static BookDTO mapBookDtoToBook(Book book) {
		  BookDTO bookDTO = new BookDTO();
		    if (book != null) {
		    	bookDTO.setId(book.getId());
		    	bookDTO.setTitle(book.getTitle());
		    	bookDTO.setRating(book.getRating());
		    }
		    return bookDTO;
		  }

		  public static List<BookDTO> mapToBookDTOList(
		      List<Book> bookList) {
		    List<BookDTO> bookDTOList = new ArrayList<BookDTO>();

		    if (bookList != null) {
		      for (Book book : bookList) {
		        bookDTOList.add(mapBookDtoToBook(book));
		      }
		    }
		    return bookDTOList;
		  }
		}
