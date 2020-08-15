package collections.lists.hwlistpractice;

import java.util.ArrayList;
import java.util.List;

public class HWListPractice {

    public static void main(String[] args) {
        List numbers = new ArrayList();   // Создаем пустой список
        List<Film> films1 = new ArrayList<>(20); // Создаем список из 20 элементов
        List<Film> films2 = new ArrayList<>(20);


        Film piratesOfTheCaribbean1 = new Film("The Curse of the Black Perl", "Johny Depp", 143);
        Film piratesOfTheCaribbean2 = new Film("Dead Man's Chest", "Johny Depp", 151);
        Film piratesOfTheCaribbean3 = new Film("At World's End", "Johny Depp", 169);
        Film piratesOfTheCaribbean4 = new Film("On Stranger Tides", "Johny Depp", 136);
        Film piratesOfTheCaribbean5 = new Film("Dead Men Tell No Tales", "Johny Depp", 129);

        films1.add(piratesOfTheCaribbean1);
        films1.add(piratesOfTheCaribbean2);
        films1.add(piratesOfTheCaribbean3);
        films1.add(piratesOfTheCaribbean4);
        films1.add(piratesOfTheCaribbean5);

        System.out.println("Первый элемент списка = " + films1.get(0));
        int lastElement = films1.size() - 1;
        System.out.println("Последний элемент списка = " + films1.get(lastElement));

        films1.clear();

        for (int i = 0; i < 5; i++) {
            films1.add(piratesOfTheCaribbean1);
            System.out.println("Добавление 5 элементов подряд " + films1.get(i));
        }

        films1.add(2, piratesOfTheCaribbean1); // Добавляем 6 элемент в 3 позицию
        films1.add(0, piratesOfTheCaribbean2); // Добавляем 7 элемент в 1 позицию


        for (int i = 0; i < films1.size() - 1; i++) {
            System.out.println(films1.get(i));
        }

        films2.addAll(films1); // Записали в новый список все элементы предыдущего списка

        for (int i = 0; i < films2.size() - 1; i++) {
            System.out.println(films2.get(i));
        }

        films1.remove(piratesOfTheCaribbean1); // Удаление элемента по значению
        films1.remove(1); // Удаление элемента по индексу

        for (int i = 0; i < films1.size() - 1; i++) {  // Вывод списка на экран в формате {"First", "Second"}
            System.out.print(films1.get(i) + ", ");
        }


        boolean containsFilm = films1.contains(piratesOfTheCaribbean3); // Проверка наличия элемента
        System.out.println("Есть ли в списке 3-я часть Пиратов кабибского моря = " + containsFilm);

        System.out.println("Каждый третий элемент списка : "); // Вывод элементов списка с индексом кратным 3
        for (int i = 0; i < films1.size() - 1; i++) {
            if (i % 3 == 0) {
                System.out.println(films1.get(i) + ", ");
            }
        }

        System.out.println("Выводим все элементы списка равные piratesOfTheCaribbean1 : ");
        for (int i = 0; i < films2.size(); i++) {
            if (films2.get(i).equals(piratesOfTheCaribbean1) == true) {
                System.out.println(films2.get(i));
            }
        }

        for (int i = 2; i < films1.size() - 1; i++) { // пропускаем первые три элемента списка
            System.out.println(films1.get(i));
        }


        films1.clear();
        films1.add(piratesOfTheCaribbean3);
        films1.add(piratesOfTheCaribbean1);
        films1.add(piratesOfTheCaribbean2);
        films1.add(piratesOfTheCaribbean1);
        films1.add(piratesOfTheCaribbean2);
        films1.add(piratesOfTheCaribbean1);
        films1.add(piratesOfTheCaribbean2);


        int count = 0;   // Возвращаем первые 2 элемента равные ***
        for (int i = 0; i < films1.size(); i++) {
            if (films1.get(i).equals(piratesOfTheCaribbean1) == true) {
                count++;
                if (count < 3) {
                    films1.remove(i);
                }
            }
            System.out.println(films1.get(i));
        }


        numbers.add(23);
        numbers.add(2);
        numbers.add(231);
        numbers.add(27);
        numbers.add(63);

        for (int i = 0; i < numbers.size(); i++) {  //Возвращаем первое число делящееся на 3
            if ((int) numbers.get(i) % 3 == 0) {
                System.out.println(numbers.get(i));
                break;
            }
        }

        for (int i = 0; i < numbers.size(); i++) { //Возвращаем все элементы делящиеся на 3
            if ((int) numbers.get(i) % 3 == 0) {
                System.out.println(numbers.get(i));
            }
        }

        List<Person> mans = new ArrayList<>();

        Person henry = new Person("Henry", 25, true);
        Person andrew = new Person("Andrew", 32, true);
        Person anya = new Person("Anya", 28, false);
        Person petr = new Person("Petr", 17, true);
        Person olya = new Person("Olya", 27, false);
        Person hil = new Person("Hil", 18, true);
        Person max = new Person("Max", 65, true);
        Person tanya = new Person("Tanya", 31, false);
        Person vasya = new Person("Vasya", 27, true);
        Person vitya = new Person("Vitya", 15, true);

        mans.add(henry);
        mans.add(andrew);
        mans.add(anya);
        mans.add(petr);
        mans.add(olya);
        mans.add(hil);
        mans.add(max);
        mans.add(tanya);
        mans.add(vasya);
        mans.add(vitya);


        char h = 'H'; // Выводим всех мужчин призывного возраста от 18 до 27, у кого имя начинается на H
        for (Person person : mans) {
            char firstChar = person.getName().charAt(0);
            if ((person.isMale() == true) && (person.getAge() >= 18) && (person.getAge() <= 27) && (firstChar == h)) {
                System.out.println("Мужчина годный к службе: " + person);
            }
        }

        double countFemale = 0; //Выводим срелдний возраст всех женщин
        double sum = 0;
        double averageAge = 0;
        for (Person person : mans) { // Нахождение среднего возраста всех женщин
            if (person.isMale() == false) {
                sum += person.getAge();
                countFemale++;
            }
        }
        averageAge = sum / countFemale;
        System.out.println("Средний возраст всех женщин: " + averageAge);


    }
}
