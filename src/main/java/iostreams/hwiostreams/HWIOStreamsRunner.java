package iostreams.hwiostreams;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class HWIOStreamsRunner {


    public static List<String> list1 = new ArrayList<>();
    public static List<String> list2 = new ArrayList<>();


    public static void main(String[] args) {


        File file1 = new File("src/main/resources/file1.txt"); //создаем file1
        File file2 = new File("src/main/resources/file2.txt"); //создаем file2

        fileWriter(file1);
        fileWriter(file2);
        fileReader(file1, list1);
        fileReader(file2, list2);
        fileWriterFromList(file1, list2);
        fileWriterFromList(file2, list1);
        fileReaderNewText(file1);
        fileReaderNewText(file2);


    }

    public static void fileWriter(File file) {
        try (PrintWriter printWriter = new PrintWriter(file)) { // записываем текст в file
            printWriter.println("Текст файла " + file.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void fileReader(File file, List list) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = fileReader.readLine()) != null) {
                System.out.println("Текст файла " + file.getName() + " - " + input);
                list.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileWriterFromList(File file, List list) {

        try (PrintWriter printWriter = new PrintWriter(file)) { // записываем новый текст в file1
            printWriter.println(list.get(0));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void fileReaderNewText(File file) {

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = fileReader.readLine()) != null) {
                System.out.println("Новый текст файла " + file.getName() + " - " + input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
