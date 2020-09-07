package threads.lecture1;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException{

//        for (int i = 0; i < 10; i++) {
//
//            for (int j = 0; j < 1000_000_000L ; j++) {
//
//            }
//
//            System.out.print("A ");
//        }

//        for (int i = 0; i < 5 ; i++) {
//          Thread.sleep(2000L);
//            System.out.print("A ");
//        }
//
//        for (int i = 0; i < 5 ; i++) {
//            Thread.sleep(3000L);
//            System.out.print("B ");
//        }

        Thread threadA = new Printer("A", 2000L);
        Thread threadB = new Printer("B", 3000L);


        System.out.println("START");
        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
        System.out.println("END");

        RunnablePrinter runnablePrinter = new RunnablePrinter();
        Thread threadFromRunnable = new Thread(runnablePrinter);
        threadFromRunnable.start();
    }
}
