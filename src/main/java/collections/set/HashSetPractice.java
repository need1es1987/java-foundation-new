package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Andrew");
        names.add("Sergey");

        names.add("Sergey");

        System.out.println("names.size() = " + names.size());

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

    }
}
