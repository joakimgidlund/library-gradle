import org.junit.jupiter.api.Test;
import se.yrgo.library.models.Book;
import se.yrgo.library.models.Customer;
import se.yrgo.library.models.Loan;
import se.yrgo.library.utilities.GenderType;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LoanTest {

    //VG
    @Test
    public void testDueDate() {
        Book book1 = new Book(
                1,
                "Lord of the Rings",
                "J.R.R Tolkien",
                "978-0544003415",
                "",
                1216);
        Customer customer = new Customer("",
                "Joakim",
                "Gidlund",
                "Gyllenstensgatan 26",
                "073 069 14 11",
                "jockegidlund@gmail.com",
                93,
                GenderType.MALE);
        Loan loan = new Loan(1, customer, book1);

        assertNotNull(loan.getDueDate(), "Date is assigned on loan construction.");
        assertTrue(LocalDate.now().isBefore(loan.getDueDate()),
                    "Added date is after today.");
    }
}