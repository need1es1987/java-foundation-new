package collections.lists.lists.myarraylist;

import collections.lists.hwmyarraylist.MyArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyArrayListTest {

    private final static String ELEMENT = "Element";
    private final static String ELEMENT1 = "Element1";

    @Test
    @DisplayName("корректно добавляет элемент")
    public void shouldCorrectAddElements() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);

        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(ELEMENT, list.get(0));
    }

    @Test
    @DisplayName("корректно выводит элемент по индексу")
    public void shouldCorrectOutputElementsByIndex() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.get(1);

        Assertions.assertEquals(ELEMENT1, list.get(1));
    }

    @Test
    @DisplayName("корректно удаляет элемент")
    public void shouldCorrectRemoveElements() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.remove(ELEMENT);

        Assertions.assertEquals(ELEMENT1, list.get(0));
        Assertions.assertEquals(1, list.size());
    }

    @Test
    @DisplayName("корректно очищает список элементов")
    public void shouldCorrectClearElements() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.clear();

        Assertions.assertEquals(0, list.size());
    }

    @Test
    @DisplayName("корректно заменяет элемент по индексу")
    public void shouldCorrectSetElementsByIndex() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.set(0, ELEMENT1);

        Assertions.assertEquals(ELEMENT1, list.get(0));
    }

    @Test
    @DisplayName("корректно добавляет элемент по индексу")
    public void shouldCorrectAddElementsByIndex() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.add(1, ELEMENT);

        Assertions.assertEquals(ELEMENT, list.get(1));
        Assertions.assertEquals(3, list.size());
    }

    @Test
    @DisplayName("корректно удаляет элемент по индексу")
    public void shouldCorrectRemoveElementsByIndex() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.remove(0);

        Assertions.assertEquals(ELEMENT1, list.get(0));
        Assertions.assertEquals(1, list.size());
    }

    @Test
    @DisplayName("корректно выводить индекс первого совпавшего элемента")
    public void shouldCorrectOutputIndexOfFirstMatchedElement() {
        MyArrayList list = new MyArrayList();
        list.add(ELEMENT);
        list.add(ELEMENT1);
        list.add(ELEMENT1);
        list.add(ELEMENT);

        list.indexOf(ELEMENT);
        list.indexOf(ELEMENT1);

        Assertions.assertEquals(0, list.indexOf(ELEMENT));
        Assertions.assertEquals(1, list.indexOf(ELEMENT1));
    }
}
