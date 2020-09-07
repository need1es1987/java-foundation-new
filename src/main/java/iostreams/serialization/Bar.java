package iostreams.serialization;

import java.io.*;

public class Bar {

    public static void main(String[] args) {
        Person vitaliy = new Person("Vitaliy", 29);
        Person vitya = new Person("Vitya", 33);

//        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/vitaliy.txt"))) {
//            outputStream.writeObject(vitaliy);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/vitaliy_class.txt"))) {
            outputStream.writeObject(Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/main/resources/vitaliy.txt"))) {
//            Person vitaliyFromFile = (Person) inputStream.readObject();
//            System.out.println("vitaliyFromFile = " + vitaliyFromFile);
//        } catch (IOException | ClassNotFoundException exception) {
//            exception.printStackTrace();
//        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/main/resources/vitaliy_class.txt"))) {
            Class<Person> vitaliyFromFile = (Class<Person>) inputStream.readObject();
            System.out.println("vitaliyFromFile = " + vitaliyFromFile);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
