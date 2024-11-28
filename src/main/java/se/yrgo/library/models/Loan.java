package se.yrgo.library.models;


//import java.util.Date;
//import java.util.GregorianCalendar;

import java.time.LocalDate;
import se.yrgo.library.utilities.LoanStatus;

/**
 * <p>Loan class.</p>
 *
 * @author jocke
 */
public class Loan {

private int ID;
private Customer customer;
private Book book;
//private Date startDate;
private LocalDate dueDate;
//private Date returnDate;
private LoanStatus status;
	
/**
 * <p>Constructor for Loan.</p>
 *
 * @param iD a int
 * @param customer a {@link Customer} object
 * @param book a {@link Book} object
 */
public Loan(int iD, Customer customer, Book book) {
  super();
  ID = iD;
  this.customer = customer;
  this.book = book;  
  dueDate = LocalDate.now().plusDays(14);
  status = LoanStatus.CURRENT;
}

/** {@inheritDoc} */
@Override
public String toString() {
  return "Loan [ID=" + ID + ", customer=" + customer.getMailingName() + ", book=" + book.getTitle()
    + "]";
}

/** {@inheritDoc} */
@Override
public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + ID;
  return result;
}

/** {@inheritDoc} */
@Override
public boolean equals(Object obj) {
  if (this == obj)
    return true;
  if (obj == null)
    return false;
  if (getClass() != obj.getClass())
    return false;
  Loan other = (Loan) obj;
  if (ID != other.ID)
    return false;
  return true;
}

/**
 * <p>Getter for the field <code>customer</code>.</p>
 *
 * @return a {@link Customer} object
 */
public Customer getCustomer() {
  return customer;
}

/**
 * <p>Getter for the field <code>book</code>.</p>
 *
 * @return a {@link Book} object
 */
public Book getBook() {
  return book;
}

/**
 * <p>Getter for the field <code>dueDate</code>.</p>
 *
 * @return a {@link LocalDate} object
 */
public LocalDate getDueDate() {
  return dueDate;
}
	
/**
 * <p>Getter for the field <code>status</code>.</p>
 *
 * @return a {@link LoanStatus} object
 */
public LoanStatus getStatus() {
  return status;
}

/**
 * <p>endLoan.</p>
 */
public void endLoan() {
  //returnDate = new Date();
  status = LoanStatus.HISTORIC;
}
	
}
