package com.adrian.experiments.simple.model;

/**
 * 
 * @author aciucanel.
 *
 * Describes a book.
 */
public class Book {

	/** The title for the book */
	private String title;
	
	/** The price. */
	private Float price;
	
	/** The description. */
	private String description;
	
	/** The number. */
	private  String number;
	
	public Book(final String title, final Float price, final String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
}
