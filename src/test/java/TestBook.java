import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestBook {
    @Test
    public void TestingTest() {
        Book book = new Book();

        book.setAuthor("Jack London");
        String bookAuthor = book.getAuthor();
        System.out.println(bookAuthor);
        assertThat(bookAuthor).isEqualTo("Jack London");

        book.setName("White Fang");
        String bookName = book.getName();
        System.out.println(bookName);
        assertThat(bookName).isEqualTo("White Fang");

        book.setGenre("Adventure");
        String bookGenre = book.getGenre();
        System.out.println(bookGenre);
        assertThat(bookGenre).isEqualTo("Adventure");

        book.setYear(1906);
        int bookYear = book.getYear();
        System.out.println(bookYear);
        assertThat(bookYear).isEqualTo(1906);

        book.setISBN("Eng- Something-1234567890");
        String bookISBN = book.getISBN();
        System.out.println(bookISBN);
        assertThat(bookISBN).isEqualTo("Eng- Something-1234567890");



    }
}
