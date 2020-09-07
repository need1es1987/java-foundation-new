package interfaces.inheritance.interfaces;

public interface Father extends GrandFather{
    default void giveLove(){
        System.out.println("Default realisation from Father");
    }
}
