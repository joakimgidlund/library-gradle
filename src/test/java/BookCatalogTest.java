import se.yrgo.library.models.Book;
import se.yrgo.library.models.BookCatalog;
import se.yrgo.library.models.BookNotFoundException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
		Book[] testArray = bc.getBookArray();

		assertNotNull(testArray[0], "Checking if the book was properly added in constructor.");
		assertEquals(book1, testArray[0], "The book can be found in the catalogue.");
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		assertEquals(book1, bc.findBook(book1.getTitle()), "Testing book search.");
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
		assertEquals(book1, bc.findBook("LEarnInG JaVA"),
					"Making sure lowercase and uppercase doesn't matter in titles.");
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		assertEquals(book1, bc.findBook("    Learning Java     "),
					"Testing trimming of book titles.");
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() {
		assertThrows(BookNotFoundException.class, () ->
					bc.findBook("Test exception"),
					"Making sure we throw the right exception.");
	}

}
