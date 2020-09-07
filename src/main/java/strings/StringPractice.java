package strings;

public class StringPractice {
    public static void main(String[] args) {
        String str = " Я супер-строка!";
        System.out.println("str = " + str);
        str = str.trim(); // immutable
        System.out.println("str = " + str);

        String name  = "Vitaly";
        String nameCopy  = "Vitaly";
        String constName = new String("Vitaly");

        System.out.println(name == nameCopy);

        System.out.println(name == constName);

        constName = constName.intern();
        System.out.println(name == constName);

//        String str2 = "Hola!";
//
//        System.out.println(str2);
//
//        for (int i = 0; i < 10_000 ; i++) {
//            str2 = str2 + "!";
//        }
//
//        System.out.println(str2);

        StringBuilder stringBuilder = new StringBuilder("Hola!");

        System.out.println(stringBuilder.toString());

        for (int i = 0; i < 10_000 ; i++) {
            stringBuilder.append("!");
        }

        System.out.println(stringBuilder.toString());


    }
}
