package testhw;


import object.Pen;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("В классе Pen должен:")
public class TestHW {

    @Test
    @DisplayName(" корректно работать конструктор")
    public void shouldHasGotCorrectConstructor(){
        Pen actualPen = new Pen("Parker", "blue",0.8);

        assertEquals("Parker", actualPen.getFirm());
        assertEquals("blue", actualPen.getColor());
        assertEquals(0.8, actualPen.getDiameter());
    }
    @Test
    @DisplayName(" корректно работать метод toString")
    public void shouldHasGotCorrectToString(){
        Pen actualPen = new Pen("Parker", "blue",0.8);

        assertEquals("Ручка фирмы: 'Parker', цвета: 'blue'", actualPen.toString());

    }

    @Test
    @DisplayName(" корректно работать метод equals")
    public void shouldHasGotCorrectEquals(){
        Pen actualPen = new Pen("Parker", "blue",0.8);
        Pen actualPen1 = new Pen("Parker", "blue",0.8);
        Pen actualPen2 = new Pen("Parkers", "blue",0.8);


        assertTrue(actualPen.equals(actualPen1));
        assertFalse(actualPen.equals(actualPen2));

    }

    @Test
    @DisplayName("Корректно работает метод может писать")
    public void shouldGotCorrectMethodIsWrite() {
        Pen actualPen = new Pen("Parker", "blue",0.8);

        assertTrue(actualPen.isWrite());
    }
}
