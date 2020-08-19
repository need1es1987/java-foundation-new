package collections.set.hwset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HWHashSet {
    public static void main(String[] args) {
        Set<Fruit> fruits = new HashSet<>();

        Fruit apple = new Fruit("Apple", 0.1);
        Fruit pineapple = new Fruit("Pineapple", 0.5);
        Fruit orange = new Fruit("Orange", 0.2);
        Fruit pear = new Fruit("Pear", 0.1);

        fruits.add(apple);
        fruits.add(pineapple);
        fruits.add(orange);
        fruits.add(pear);
        fruits.remove(apple);

        System.out.println("fruits.contains(apple) = " + fruits.contains(apple));


        Iterator<Fruit> fruit = fruits.iterator();
        System.out.println("Выводим список фруктов: ");
        while (fruit.hasNext()) {
            System.out.println(fruit.next());
        }


    }
}
