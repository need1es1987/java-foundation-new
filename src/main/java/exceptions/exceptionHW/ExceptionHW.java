package exceptions.exceptionHW;

public class ExceptionHW {

    public static void main(String[] args) {

        try {
            throw new Exception();
        } catch (Exception e) {
            System.err.println("Ошибка");
        } finally {
            System.out.println("Finally");
        }

        try {
            MyException();
        } catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.err.println("Некорректно введен индекс");
        } finally {
            System.out.println("Finally");
        }

        PersonInArmy andrew = new PersonInArmy(27);

        try {
            andrew.birthday();
        } catch (Throwable throwable){
            System.err.println("Поймали ошибку в Main");
        }




    }


    public static void MyException() throws IndexOutOfBoundsException{
        throw new IndexOutOfBoundsException();
    }








}
