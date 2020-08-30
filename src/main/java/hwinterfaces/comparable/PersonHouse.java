package hwinterfaces.comparable;

import java.util.Arrays;

public class PersonHouse{
    public static void main(String[] args) throws CloneNotSupportedException {
        Person andrew = new Person("Andrew", "Mikhailov", 32);
        Person tanya = new Person("Tanya","Kotelevich", 31);
        Person dima = new Person("Dima", "Butirkin", 22);
        Person vasya = new Person("Vasya", "Mikhailov", 75);
        Person andrew1 = new Person("Andrew", "Kozhenov", 32);
        Person ivan = new Person("Ivan", "Nilov", 33);
        Person galina = new Person("Galina", "Butirkina", 55);
        Person igor = new Person("Igor", "Butirkin", 52);
        Person andrew2 = new Person("Andrew", "Mikhailov", 32);
        Person tanya2 = new Person("Tanya","Kotelevich", 31);

        Person[] persons = {andrew,tanya,dima,vasya,andrew1,andrew2,ivan,galina,igor,tanya2};
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        Person andrew3 = (Person) andrew.clone();
        System.out.println("andrew3 = " + andrew3);
    }


}
