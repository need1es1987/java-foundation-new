package collections.lists.lists;

import collections.lists.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("В классе Book должен:")
public class BookTest {

    @Test
    @DisplayName(" корректно работать конструктор")
    public void shouldHasGotCorrectConstructor(){
        Book actualBook = new Book("The Lord of the Rings", "Tolken", 700);

        assertEquals("The Lord of the Rings", actualBook.getName());
        assertEquals("Tolken", actualBook.getAuthor());
        assertEquals(700, actualBook.getPagesCount());
    }

    @Test
    @DisplayName(" корректно работать сеттер для количества страниц")
    public void shouldHasGotCorrectSetterForPagesCount(){
        Book actualBook1 = new Book("The Lord of the Rings", "Tolken", 700);
        actualBook1.setPagesCount(800);

        assertEquals(800, actualBook1.getPagesCount());
    }
}
