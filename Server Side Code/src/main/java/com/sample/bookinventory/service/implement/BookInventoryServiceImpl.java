package com.sample.bookinventory.service.implement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.bookinventory.constants.BookInventoryConstant;
import com.sample.bookinventory.dto.BookDTO;
import com.sample.bookinventory.persistence.dao.BookInventoryDao;
import com.sample.bookinventory.persistence.domain.BookMaster;
import com.sample.bookinventory.utilities.EntityConverter;
import com.sample.bookinventory.utilities.JAXBUtils;

/**
 * Book Inventory Services Implementor
 * 
 * @author Ankush
 *
 */
@Component
public class BookInventoryServiceImpl {

	@Autowired
	JAXBUtils jaxbUtils;

	@Autowired
	BookInventoryDao bookInventoryDao;

	private static final Logger LOGGER = LoggerFactory.getLogger(BookInventoryServiceImpl.class);

	/**
	 * Add book in database
	 * 
	 * @param book
	 * @return
	 */
	public String addBook(BookDTO book) {
		LOGGER.debug("Add Book Impl start ---->");
		BookMaster saveBook = EntityConverter.convertBookDtoIntoEntity(book);
		if (bookInventoryDao.addBook(saveBook)) {
			return BookInventoryConstant.ADD_BOOK_SUCCESS;
		} else {
			return BookInventoryConstant.ADD_BOOK_FAIL;
		}

	}

	/**
	 * Return book for given barcode
	 * 
	 * @param barcode
	 * @return
	 */
	public BookDTO getBook(String barcode) {
		LOGGER.debug("Get Book Info Impl start ---->");
		BookMaster book = bookInventoryDao.getBook(barcode);
		if (book != null) {
			return EntityConverter.convertEntityIntoDto(book);
		} else {
			return new BookDTO();
		}
	}

	/**
	 * Delete book from database
	 * 
	 * @param barcode
	 * @return
	 */
	public String deleteBook(String barcode) {
		LOGGER.debug("Delete Book Impl start ---->");
		if (bookInventoryDao.deleteBook(barcode))
			return BookInventoryConstant.BOOK_DELETED_SUCCESS;
		else
			return BookInventoryConstant.BOOK_DELETED_FAIL;

	}

	/**
	 * Returns book in XML form
	 * 
	 * @param barcode
	 * @return
	 */
	public String getBookXml(String barcode) {
		LOGGER.debug("Get Book Impl XML start ---->");
		BookMaster book = bookInventoryDao.getBook(barcode);
		if (book != null) {
			return jaxbUtils.convertBookToXML(EntityConverter.convertEntityIntoBookModel(book));
		} else {
			return null;
		}
	}

}
