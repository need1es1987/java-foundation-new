package interfaces.inheritance.interfaces;

public abstract class Mother implements GrandFather {

    @Override
    public void giveLove() {

        System.out.println("Big love from mother");
    }

    public abstract void kiss();
}
