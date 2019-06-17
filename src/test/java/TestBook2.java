import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestBook2 {

    Book book = new Book();

    @Before
    public final void setUp() {

        book.setAuthor("Jack London");
        book.setName("White Fang");
        book.setGenre("Adventure");
        book.setYear(1906);
        book.setISBN("Eng- Something-1234567890");
    }

    @Test
    public void TestingTest() {
        assertThat(book.getAuthor()).isEqualTo("Jack London");
        assertThat(book.getName()).isEqualTo("White Fang");
        assertThat(book.getGenre()).isEqualTo("Adventure");
        assertThat(book.getYear()).isEqualTo(1906);
        assertThat(book.getISBN()).isEqualTo("Eng- Something-1234567890");
    }

    @After
    public final void tearDown() {book = null; }
}
