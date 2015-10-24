/**
 *
 */
package com.sample.bookinventory.service.activator;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.bookinventory.constants.BookInventoryConstant;
import com.sample.bookinventory.dto.BookDTO;
import com.sample.bookinventory.service.implement.BookInventoryServiceImpl;

/**
 * @author Ankush
 * 
 */
@Component
public class BookInventoryServiceActivator implements IServiceActivator {

	@Autowired
	BookInventoryServiceImpl bookInventoryServiceImpl;

	private static final Logger LOGGER = LoggerFactory.getLogger(BookInventoryServiceActivator.class);

	/**
	 * Adds book activator
	 * 
	 * @param book
	 * @return
	 */
	public String addBook(BookDTO book) {
		LOGGER.info("Add Book activator start ---->");
		return bookInventoryServiceImpl.addBook(book);
	}

	/**
	 * Return book with given barcode activator
	 * 
	 * @param map
	 * @return
	 */
	public BookDTO getBook(HashMap<String, String> map) {
		LOGGER.info("Get Book Info activator start ---->");
		String barcode = map.get(BookInventoryConstant.BARCODE_KEY);
		if (barcode == null)
			return null;
		else
			return bookInventoryServiceImpl.getBook(barcode);
	}
	
	/**
	 * Get book activator XML response
	 * 
	 * @param map
	 * @return
	 */
	public String getBookXml(HashMap<String, String> map) {
		LOGGER.info("Get Book Info activator start ---->");
		String barcode = map.get(BookInventoryConstant.BARCODE_KEY);
		if (barcode == null)
			return null;
		else
			return bookInventoryServiceImpl.getBookXml(barcode);
	}

	/**
	 * Deletes book from inventory
	 * 
	 * @param map
	 * @return
	 */
	public String deleteBook(HashMap<String, String> map) {
		LOGGER.info("Delete Book activator start ---->");
		String barcode = map.get(BookInventoryConstant.BARCODE_KEY);
		if (barcode == null)
			return BookInventoryConstant.BARCODE_NOT_FOUND_KEY;
		else
			return bookInventoryServiceImpl.deleteBook(barcode);
	}
}
