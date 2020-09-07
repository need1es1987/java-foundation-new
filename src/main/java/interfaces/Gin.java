package interfaces;

public class Gin implements Creatable, Immortable {

    @Override
    public void createWish() {

        System.out.println("Слушаюсь и повинуюсь");
    }

    @Override
    public void jumpFrom16Flor() {
        System.out.println("Я не боюсь прыгнуть с 16 этажа");
    }
}
