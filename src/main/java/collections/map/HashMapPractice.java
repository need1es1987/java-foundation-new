package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {

        Map<Man, String> map = new HashMap<>();

        Man sidorov = new Man("Сидоров");
        Man ivanov = new Man("Иванов");

        map.put(sidorov, "Свитшот");
        map.put(ivanov, "Юбку");

        System.out.println("map.get(sidorov) = " + map.get(sidorov));
        System.out.println("map.get(ivanov) = " + map.get(ivanov));

//        sidorov = new Man("Джавов");
//
//        System.out.println("map.get(sidorov) = " + map.get(sidorov));

        for(Man key : map.keySet()) {
            System.out.println("man: " + key + "<-> item:" + map.get(key) + " ");
        }
        System.out.println();

        map.remove(sidorov);

        for ( Map.Entry<Man, String> pair : map.entrySet()) {
            System.out.println("man: " + pair.getKey() + "<-> item: " + pair.getValue() + " ");
        }
        System.out.println();

        System.out.println("map.size() = " + map.size());


    }
}
