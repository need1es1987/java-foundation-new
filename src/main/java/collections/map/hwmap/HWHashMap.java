package collections.map.hwmap;

import collections.map.Man;
import collections.set.hwset.Fruit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HWHashMap {

    public static void main(String[] args) {

        Map<Man, Fruit> manFruitMap = new HashMap<>();

        Man sidorov = new Man("Сидр");
        Man ivanov = new Man("Иванов");
        Man ivanov1 = new Man("Иванов");
        Man afanasiev1 = new Man("Афанасьев");
        Man afanasiev = new Man("Афанасьев");
        Man petrov = new Man("Петров");
        Man popov = new Man("Попов");
        Man artemiev = new Man("Артемьев");
        Man alekseev = new Man("Алексеев");

        Fruit apple = new Fruit("Яблоко", 0.1);
        Fruit apple1 = new Fruit("ЯБлоко", 0.1);
        Fruit apple2 = new Fruit("ЯблокО", 0.1);
        Fruit pineapple = new Fruit("Ананас", 0.5);
        Fruit orange = new Fruit("Апельсин", 0.2);
        Fruit pear = new Fruit("Груша", 0.1);
        Fruit banana = new Fruit("Банан", 0.4);

        manFruitMap.put(popov, orange);
        manFruitMap.put(alekseev, banana);
        manFruitMap.put(sidorov, apple);
        manFruitMap.put(artemiev, pineapple);
        ;
        manFruitMap.put(ivanov, apple);
        manFruitMap.put(petrov, apple);
        manFruitMap.put(afanasiev, pear);
        manFruitMap.put(ivanov1, apple1);
        manFruitMap.put(afanasiev1, apple2);


        manFruitMap.remove(sidorov, apple);
        manFruitMap.put(sidorov, apple);

        System.out.println("Проверяем что Иванов выбрал Ананас -> " + manFruitMap.get(ivanov));
        System.out.println();
        System.out.println("Проверяем что Петров выбрал Грушу -> " + manFruitMap.get(petrov));
        System.out.println();

        for (Man key : manFruitMap.keySet()) {
            System.out.print("Ключ :" + key + ", ");
        }
        System.out.println();
        System.out.println();

        for (Fruit values : manFruitMap.values()) {
            System.out.print("Значение : " + values + ", ");
        }
        System.out.println();
        System.out.println();

        for (Map.Entry<Man, Fruit> pair : manFruitMap.entrySet()) {
            System.out.println("Man: " + pair.getKey() + "<-> item: " + pair.getValue());
        }
        System.out.println();

        int count = 0;
        for (Map.Entry<Man, Fruit> pair : manFruitMap.entrySet()) {
            if (pair.getKey().getName().length() > 5) {
                count++;
            }
        }
        System.out.println("Количество элементов, длина имени которых больше 5 символов -> " + count);
        System.out.println();

        int appleCount = 0;
        for (Map.Entry<Man, Fruit> pair : manFruitMap.entrySet()) {
            if (pair.getValue().getName().equals(apple.getName())) {
                appleCount++;
            }
        }
        System.out.println("Количество человек, выбравших яблоко -> " + appleCount);
        System.out.println();

        System.out.println("Пропускаем 2 элемента, значения которых Яблоко, все остальные выводим");
        int count1 = 0; //
        for (Map.Entry<Man, Fruit> pair : manFruitMap.entrySet()) {
            if (pair.getValue().getName().equals(apple.getName())) {
                count1++;
                if (count1 > 2) {
                    System.out.println("Man: " + pair.getKey() + "<-> item: " + pair.getValue());
                }
            } else {
                System.out.println("Man: " + pair.getKey() + "<-> item: " + pair.getValue());
            }
        }
        System.out.println();


        System.out.println("Выводим все кроме 2 элементов, ключи которых начинаются на А");
        int count2 = 0; //
        for (Map.Entry<Man, Fruit> pair : manFruitMap.entrySet()) {
            if (pair.getKey().getName().charAt(0) == 'А') {
                count2++;
                if (count2 > 2) {
                    System.out.println("Man: " + pair.getKey() + "<-> item: " + pair.getValue());
                }
            } else {
                System.out.println("Man: " + pair.getKey() + "<-> item: " + pair.getValue());
            }
        }
        System.out.println();

        String str = "яблоко";
        System.out.println("Возвращаем элемент значение которого яблоко или Яблоко или ЯБЛОКо");
        for (Map.Entry<Man, Fruit> pair : manFruitMap.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase(str)) {
                System.out.println("Man: " + pair.getKey() + "<-> item: " + pair.getValue());
            }
        }
        System.out.println();


        System.out.println("Возвращаем все элементы в карту manFruitMap1, которые являются фруктами");
        Map<Man, Fruit> manFruitMap1 = new HashMap<>();
        manFruitMap1.putAll(manFruitMap);
        for (Map.Entry<Man, Fruit> pair : manFruitMap1.entrySet()) {
            System.out.println("Man: " + pair.getKey() + "<-> item: " + pair.getValue());
        }
        System.out.println();

        System.out.println("Находим средний вес всех фруктов");
        double averageWeight = 0;
        int count3 = 0;
        for (Map.Entry<Man, Fruit> pair : manFruitMap.entrySet()) {
            System.out.print(pair.getValue().getWeight() + " + ");
            averageWeight = averageWeight + pair.getValue().getWeight();
            count3++;
        }
        System.out.println(" / Количество фруктов -> " + count3);
        averageWeight = averageWeight / count3;
        System.out.println(averageWeight);


    }
}
