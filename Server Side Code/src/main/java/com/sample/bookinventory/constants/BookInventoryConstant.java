package com.sample.bookinventory.constants;

public interface BookInventoryConstant {

	/**
	 * Success message on book addition
	 */
	String ADD_BOOK_SUCCESS = "book added successfully!";

	/**
	 * Fail message on book addition
	 */
	String ADD_BOOK_FAIL = "Failed to add book!";

	/**
	 * Key for barcode hashmap
	 */
	String BARCODE_KEY = "barcode";

	/**
	 * Key not found
	 */
	String BARCODE_NOT_FOUND_KEY = "barcode not found in request!";

	/**
	 * Book Deleted successfully
	 */
	String BOOK_DELETED_SUCCESS = "Book deleted!";

	/**
	 * Book Deletion fail
	 */
	String BOOK_DELETED_FAIL = "Book doesn't exists in database !";
}
