/**
 *
 */
package com.sample.bookinventory.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class BookMaster
 * 
 * @author Ankush
 * 
 */
@Entity
@Table(name = "book_master", schema = "book_inventory")
public class BookMaster {

	@Id
	@Column(name = "barcode")
	private String barcode;

	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "no_of_pages")
	private int noOfPages;

	@Column(name = "is_read")
	private boolean isRead;

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
	 * @return the noOfPages
	 */
	public int getNoOfPages() {
		return noOfPages;
	}

	/**
	 * @param noOfPages
	 *            the noOfPages to set
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
