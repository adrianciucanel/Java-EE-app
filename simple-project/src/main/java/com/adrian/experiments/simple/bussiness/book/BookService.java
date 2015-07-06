package com.adrian.experiments.simple.bussiness.book;

import javax.inject.Inject;

/**
 * Handle CRUD operations regarding books.
 * @author aciucanel
 *
 */
public class BookService {

	/** Number generator for books. */
	@Inject
	private NumberGenerator numberGenerator;

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
