package com.sample.bookinventory.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sample.bookinventory.persistence.domain.BookMaster;
import com.sample.bookinventory.persistence.repository.BookMasterRepository;

/**
 * This Class Provides interaction with Repositories
 * 
 * @author Ankush
 * 
 */
@Component
public class BookInventoryDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookInventoryDao.class);

	@PersistenceContext(name = "bookinventory-dao")
	private EntityManager em;

	@Autowired
	private BookMasterRepository bookMasterRepository;

	/**
	 * Adds book in database
	 * 
	 * @param bookMaster
	 * @return
	 */
	@Transactional
	public boolean addBook(BookMaster bookMaster) {
		LOGGER.debug("Storing book in database");
		BookMaster book = bookMasterRepository.save(bookMaster);
		if (book != null)
			return true;
		else
			return false;
	}

	/**
	 * Get book from database
	 * 
	 * @param barcode
	 * @return
	 */
	@Transactional
	public BookMaster getBook(String barcode) {
		LOGGER.debug("Get book from database for barcode - " + barcode);
		return bookMasterRepository.findOne(barcode);
	}

	/**
	 * delete book from database
	 * 
	 * @param barcode
	 * @return
	 */
	@Transactional
	public boolean deleteBook(String barcode) {
		LOGGER.debug("Deleting book from database for barcode - " + barcode);
		if (bookMasterRepository.findOne(barcode) == null)
			return false;
		else {
			bookMasterRepository.delete(barcode);
			return true;
		}
	}

}
