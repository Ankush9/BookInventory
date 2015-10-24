package com.sample.bookinventory.dto;

import java.io.Serializable;

/**
 * Book DTO
 * 
 * @author Ankush
 *
 */
public class BookDTO implements Serializable {

	private static final long serialVersionUID = -5995843021309754315L;
	private String title;
	private String barcode;
	private String author;
	private int noOfPages;
	private boolean isRead;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the barcode
	 */
	public String getBarcode() {
		return barcode;
	}

	/**
	 * @param barcode
	 *            the barcode to set
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the noOFPages
	 */
	public int getNoOfPages() {
		return noOfPages;
	}

	/**
	 * @param noOFPages
	 *            the noOFPages to set
	 */
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	/**
	 * @return the isRead
	 */
	public boolean isRead() {
		return isRead;
	}

	/**
	 * @param isRead
	 *            the isRead to set
	 */
	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
}
