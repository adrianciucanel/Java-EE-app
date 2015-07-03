package com.adrian.experiments.simple.bussiness.book;

/**
 * Defines what a book number generator means. 
 * @author aciucanel
 *
 */
public interface NumberGenerator {

	/**
	 * Generates book number.
	 * 
	 * @return the number as string.
	 */
	String generateNumber();
}
