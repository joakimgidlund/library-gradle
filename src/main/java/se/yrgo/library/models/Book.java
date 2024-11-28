package se.yrgo.library.models;

/**
 * <p>Book class.</p>
 *
 * @author jocke
 */
public class Book extends Material {

	private String author;
	private String isbn;
	private int noOfPages;
	
	/**
	 * <p>Constructor for Book.</p>
	 *
	 * @param id a int
	 * @param title a {@link String} object
	 * @param author a {@link String} object
	 * @param isbn a {@link String} object
	 * @param branch a {@link String} object
	 * @param noOfpages a int
	 */
	public Book(int id, String title, String author, String isbn, String branch, int noOfpages) 
	{
		super(id,title,branch);
		this.author = author;
		this.isbn = isbn;
		this.noOfPages= noOfpages;
	}
	
	/**
	 * <p>Getter for the field <code>author</code>.</p>
	 *
	 * @return a {@link String} object
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <p>Getter for the field <code>isbn</code>.</p>
	 *
	 * @return a {@link String} object
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * <p>sendForRepair.</p>
	 */
	public void sendForRepair() {
		System.out.println("Book has been sent for repair");
	}
	
	/**
	 * <p>getLoanPeriod.</p>
	 *
	 * @return a int
	 */
	public int getLoanPeriod() {
		return 21;
	}
	
}
