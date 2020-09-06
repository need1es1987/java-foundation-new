package iostreams.hwiostreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HWFileStringMemory {

    public static List<String> list1 = new ArrayList<>();

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        bufferedReader(bufferedReader, list1);


    }

    public static void bufferedReader(BufferedReader bufferedReader, List list) {


        try {
            System.out.print("Введите имя файла - ");
            String fileName = bufferedReader.readLine();
            System.out.println("Имя файла " + fileName + ".txt");
            System.out.print("Введите путь к файлу - ");
            String filePath = bufferedReader.readLine();
            String myFile = filePath + "/" + fileName + ".txt";
            File fileCreatable = new File(myFile);

            if (!fileCreatable.exists()) {
                System.out.print("Введите текст не более 10 предложений - ");
                String fileText = bufferedReader.readLine();
                int proposal = 0;
                int textLength = fileText.length();
                String foundSymbols = "[.!?]\\s[A-Za-z]";
                for (int i = 0; i < textLength; i++) {
                    if (foundSymbols.indexOf(fileText.charAt(i)) != -1) {
                        proposal++;
                    }
                }
                System.out.println("Количество предложений " + proposal);

                if (proposal <= 10) {
                    try (PrintWriter printWriter = new PrintWriter(fileCreatable)) {
                        printWriter.println(fileText);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    try (BufferedReader fileReader = new BufferedReader(new FileReader(fileCreatable))) {
                        String input;
                        while ((input = fileReader.readLine()) != null) {
                            System.out.println(fileCreatable.getName() + " содержит текст - " + input);
                            list.add(input);
                            break;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("Данный файл уже существует, начните заново");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
