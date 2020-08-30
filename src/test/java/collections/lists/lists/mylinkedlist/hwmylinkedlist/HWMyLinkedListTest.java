package collections.lists.lists.mylinkedlist.hwmylinkedlist;


import collections.lists.mylinkedlist.hwmylinkedlist.HWMyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс HWMyLinkedList: ")
public class HWMyLinkedListTest {
    private final static String ELEMENT = "Element";
    private final static String ELEMENT1 = "Element1";
    private final static String ELEMENT2 = "Element2";

    @Test
    @DisplayName("корректно выводит пустой список")
    public void shouldCorrectIsEmpty() {
        HWMyLinkedList list = new HWMyLinkedList();

        Assertions.assertTrue(list.isEmpty());

        list.add(ELEMENT);

        Assertions.assertFalse(list.isEmpty());
    }

    @Test
    @DisplayName("корректно выводит содержится ли в списке элемент")
    public void shouldCorrectContainsElement() {
        HWMyLinkedList list = new HWMyLinkedList();

        Assertions.assertFalse(list.contains(ELEMENT));

        list.add(ELEMENT);

        Assertions.assertTrue(list.contains(ELEMENT));
    }

    @Test
    @DisplayName("корректно добавляет элемент в список")
    public void shouldCorrectAddElement() {
        HWMyLinkedList list = new HWMyLinkedList();
        list.add(ELEMENT);

        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(ELEMENT, list.get(0));
    }

    @Test
    @DisplayName("корректно удаляет элемент из списка")
    public void shouldCorrectRemoveElement() {
        HWMyLinkedList list = new HWMyLinkedList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.remove(ELEMENT);

        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(ELEMENT1, list.get(0));
    }

    @Test
    @DisplayName("корректно удаляет все элементы из списка")
    public void shouldCorrectRemoveAllElements() {
        HWMyLinkedList list = new HWMyLinkedList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.add(ELEMENT2);

        Assertions.assertEquals(3, list.size());

        list.clear();

        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    @DisplayName("корректно добавляет в список элемент по индексу")
    public void shouldCorrectAddByIndexElement() {
        HWMyLinkedList list = new HWMyLinkedList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.add(0, ELEMENT2);

        Assertions.assertEquals(3, list.size());
        Assertions.assertEquals(ELEMENT2, list.get(0));
        Assertions.assertEquals(ELEMENT, list.get(1));
        Assertions.assertEquals(ELEMENT1, list.get(2));
    }

    @Test
    @DisplayName("корректно удаляет элемент из списка по индексу")
    public void shouldCorrectRemoveByIndexElement() {
        HWMyLinkedList list = new HWMyLinkedList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.add(ELEMENT2);

        list.remove(1);

        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals(ELEMENT2, list.get(1));
    }

    @Test
    @DisplayName("корректно перезаписывает элемент в список по индексу")
    public void shouldCorrectSetByIndexElement() {
        HWMyLinkedList list = new HWMyLinkedList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.set(0, ELEMENT2);

        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals(ELEMENT2, list.get(0));
        Assertions.assertEquals(ELEMENT1, list.get(1));
    }

    @Test
    @DisplayName("корректно выводит индекс первого найденного элемента по значению")
    public void shouldCorrectOutputIndexOfElement() {
        HWMyLinkedList list = new HWMyLinkedList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.add(ELEMENT2);
        list.add(ELEMENT);

        Assertions.assertEquals(0, list.indexOf(ELEMENT));
        Assertions.assertEquals(1, list.indexOf(ELEMENT1));
        Assertions.assertEquals(2, list.indexOf(ELEMENT2));
    }

    @Test
    @DisplayName("корректно выводит индекс последнего найденного элемента по значению")
    public void shouldCorrectOutputIndexOfLastElement() {
        HWMyLinkedList list = new HWMyLinkedList();
        list.add(ELEMENT1);
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.add(ELEMENT2);
        list.add(ELEMENT);
        list.add(ELEMENT2);

        Assertions.assertEquals(4, list.lastIndexOf(ELEMENT));
        Assertions.assertEquals(2, list.lastIndexOf(ELEMENT1));
        Assertions.assertEquals(5, list.lastIndexOf(ELEMENT2));
    }

    @Test
    @DisplayName("корректно выводит надись на экран метод toString")
    public void shouldCorrectOutputToString() {
        HWMyLinkedList list = new HWMyLinkedList();
        list.add(ELEMENT1);
        list.add(ELEMENT);

        Assertions.assertEquals("HWMyLinkedList{ Element1,Element }", list.toString());
    }
}
