package exceptions;

import lombok.SneakyThrows;

public class ExceptionPractice {

    public static void main(String[] args) {

        // throw new IndexOutOfBoundsException();

        try {
            throw new Exception();
        } catch (Exception exc) {
            System.err.println("Поймали ошибку");
        }

        try {
            // exceptionMethod();
            throw new Exception();
        } catch (CloneNotSupportedException e) {
            System.err.println("Ошибка клонирования");
        } catch (Exception e) {
            System.err.println("Просто ошибка");
        }

        try {
            throw new IndexOutOfBoundsException();
        } catch (RuntimeException runtimeException) {
            System.err.println("runtimeException");
        }

        try {
            exceptionMethod();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            System.err.println("exception");
        } finally {
            System.out.println("Finally");
        }

        throw new MyFavoriteException("Супер ошибка");
    }

    // @SneakyThrows
    public static void exceptionMethod() throws CloneNotSupportedException {
        //   throw new CloneNotSupportedException();
    }
}
