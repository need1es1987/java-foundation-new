package threads.lecture1;

public class RunnablePrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable");
    }

}
