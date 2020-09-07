package collections.lists.lists.mylinkedlist;

import collections.lists.mylinkedlist.MyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс MyLinkedList :")
public class MyLinkedListTest {
    private final static String ELEMENT = "Element";

    @Test
    @DisplayName("корректно добавляет элемент")
    public void shouldCorrectAddElements() {
        MyLinkedList list = new MyLinkedList();
        list.add(ELEMENT);

        Assertions.assertEquals(1,list.size());
        Assertions.assertEquals(ELEMENT, list.get(0));
    }
}
