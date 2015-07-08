package com.adrian.experiments.simple.bussiness.book;

import java.util.Random;
import java.util.logging.Logger;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.adrian.experiments.simple.infrastructure.logging.Loggable;

/**
 * Mock class for implementation of number generator.
 * @author aciucanel
 *
 */
@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator {

	@Inject
	private Logger logger;
	
	@Loggable
	public String generateNumber() {
		String number = "MOCK" + Math.abs(new Random().nextInt());
		logger.info("Generate Mock : " + number);
		return number;
	}

	/**
	 * Get the logger.
	 * @return the logger for this class.
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * Set the logger for this class.
	 * @param logger the logger to set
	 */
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
