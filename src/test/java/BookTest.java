import org.junit.jupiter.api.Test;
import se.yrgo.library.models.Book;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(
				1,
				"Lord of the Rings",
				"J.R.R Tolkien",
				"978-0544003415",
				"",
				1216);
		Book book2 = new Book(
				1,
				"Lord of the Rings",
				"J.R.R Tolkien",
				"978-0544003415",
				"",
				1216);

		assertEquals(book1, book2, "Two equal books in different variables are the same.");
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(
				1,
				"Lord of the Rings",
				"J.R.R Tolkien",
				"978-0544003415",
				"",
				1216);
		Book book2 = new Book(
				2,
				"The HitchHiker's Guide to the Galaxy",
				"Douglas Adams",
				"978-0345391803",
				"",
				226);

		assertNotEquals(book1, book2,
				"Make sure two different books are not the same.");
	}

}
