package iostreams;

import java.io.*;

public class IOStreamsRunner {

    public static void main(String[] args) {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            String input = bufferedReader.readLine();
//            System.out.println("input = " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file = new File("src\\main\\resources\\file.txt");

        // try with resources
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("String 1");
            printWriter.println("String 2");
            printWriter.println("String 3");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            //System.out.println("fileReader.readLine() = " + fileReader.readLine());

            String input;
            while ((input = fileReader.readLine()) != null) {
                System.out.println("input = " + input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
