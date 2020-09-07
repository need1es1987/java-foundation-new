package collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book harryPotter1 = new Book("Philosopher's stone", "J. Rowling", 300);
        Book harryPotter2 = new Book("Secret room", "J. Rowling", 350);
        Book harryPotter3 = new Book("Azkaban prisoner", "J. Rowling", 300);

        //      books.add(new Object());

        books.add(harryPotter1);
        books.add(harryPotter2);
        books.add(harryPotter3);

        for (Book booksElem : books){
            System.out.println(booksElem + " ");
        }
        System.out.println();

        books.remove(0);

        System.out.println(books);

        System.out.println("books.get(0) = " + books.get(0));

        System.out.println("books.isEmpty() = " + books.isEmpty());

//        books.remove(0);
//        books.remove(0);

        System.out.println("books.isEmpty() = " + books.isEmpty());

        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }



    }
}
