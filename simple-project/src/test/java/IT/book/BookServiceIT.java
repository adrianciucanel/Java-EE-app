package IT.book;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Assert;
import org.junit.Test;

import com.adrian.experiments.simple.bussiness.book.BookService;
import com.adrian.experiments.simple.model.Book;

/**
 * Integration test for book service.
 * @author aciucanel
 *
 */
public class BookServiceIT {
	
	@Test
	public void shouldCheckNumberIsMOCK () {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		
		BookService bookService = container.instance().select(BookService.class).get();
		Book book = bookService.createBook("title", 19.99F, "best book");
		
		Assert.assertTrue(book.getNumber().startsWith("Mock"));
	}
}
