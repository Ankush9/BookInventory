package com.sample.bookinventory.utilities;

import com.sample.bookinventory.dto.BookDTO;
import com.sample.bookinventory.persistence.domain.BookMaster;
import com.sample.inventorybook.model.Book;

/**
 * Converts DTO and Entity
 * 
 * @author Ankush
 *
 */
public class EntityConverter {

	/**
	 * Converts bookDTO into BookMaster
	 * 
	 * @param bookDTO
	 * @return
	 */
	public static BookMaster convertBookDtoIntoEntity(BookDTO bookDTO) {
		BookMaster bookMaster = new BookMaster();
		bookMaster.setAuthor(bookDTO.getAuthor());
		bookMaster.setBarcode(bookDTO.getBarcode());
		bookMaster.setNoOfPages(bookDTO.getNoOfPages());
		bookMaster.setTitle(bookDTO.getTitle());
		bookMaster.setRead(bookDTO.isRead());
		return bookMaster;
	}

	/**
	 * Converts bookDTO into BookMaster
	 * 
	 * @param bookDTO
	 * @return
	 */
	public static BookDTO convertEntityIntoDto(BookMaster bookMaster) {
		BookDTO bookDTO = new BookDTO();
		bookDTO.setAuthor(bookMaster.getAuthor());
		bookDTO.setBarcode(bookMaster.getBarcode());
		bookDTO.setNoOfPages(bookMaster.getNoOfPages());
		bookDTO.setTitle(bookMaster.getTitle());
		bookDTO.setRead(bookMaster.isRead());
		return bookDTO;
	}

	/**
	 * Converts bookDTO into BookMaster
	 * 
	 * @param bookDTO
	 * @return
	 */
	public static Book convertEntityIntoBookModel(BookMaster bookMaster) {
		Book book = new Book();
		book.setAuthor(bookMaster.getAuthor());
		book.setBarcode(bookMaster.getBarcode());
		book.setNoOfPages(bookMaster.getNoOfPages());
		book.setTitle(bookMaster.getTitle());
		book.setIsRead(bookMaster.isRead());
		return book;
	}

}
