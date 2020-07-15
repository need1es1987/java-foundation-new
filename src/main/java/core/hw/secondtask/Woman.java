package core.hw.secondtask;

public class Woman extends Person{

    public Woman(String name, double age) {
        super(false, "Maria",18);
    }

    @Override
    public void printAge() {
        System.out.println("Девушкам всегда 18");
    }

}

