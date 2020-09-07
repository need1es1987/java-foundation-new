package interfaces;

public class WorkWithInterfaces {

    public static void main(String[] args) {

        Creatable gin = new Gin();
        gin.createWish();

        Creatable hottabich = new Hottabich();
        hottabich.createWish();

        Immortable gin2  = new Gin();
        gin2.jumpFrom16Flor();



    }
}
