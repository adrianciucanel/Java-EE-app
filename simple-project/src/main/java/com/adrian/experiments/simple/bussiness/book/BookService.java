package com.adrian.experiments.simple.bussiness.book;

import javax.inject.Inject;

import com.adrian.experiments.simple.infrastructure.logging.Loggable;
import com.adrian.experiments.simple.model.Book;

/**
 * Handle CRUD operations regarding books.
 * @author aciucanel
 *
 */
@Loggable
public class BookService {

	/** Number generator for books. */
	@Inject @ThirteenDigits
	private NumberGenerator numberGenerator;

	public Book createBook(final String title, final Float price, final String description) {
		final Book book = new Book(title, price, description);
		book.setNumber(numberGenerator.generateNumber());
		return book;
	}
	
	/**
	 * Get the number generator.
	 * @return the number generator for books.
	 */
	public NumberGenerator getNumberGenerator() {
		return numberGenerator;
	}

	/**
	 * Set the number generator.
	 * @param numberGenerator the number generator for books to set.
	 */
	public void setNumberGenerator(NumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
	}
	
}
