package threads.lecture2;

import lombok.SneakyThrows;
import threads.lecture1.RunnablePrinter;
import threads.lecture1.ThreadPractice;

public class ThreadPractice2 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

//        Thread.currentThread().join();

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };

//        Runnable runnable = () -> {
//            System.out.println("Yo");
//        };
//
//        runnable.run();
//
//        new Thread(()->System.out.println("Yoyo")).start();

//        new Object().wait();

//        Object obj = new Object();
//        synchronized (obj){
//            obj.notifyAll();
//        }

        ThreadPractice2 threadPractice2 = new ThreadPractice2();

        Thread t1 = new Printer(1, threadPractice2);
        Thread t2 = new Printer(2, threadPractice2);
        Thread t3 = new Printer(3, threadPractice2);
        Thread t4 = new Printer(4, threadPractice2);

//        t2.setPriority(Thread.MAX_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);
//        t4.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

    @SneakyThrows
    public synchronized void print(int num) {

        System.out.println("Start thread " + num);

        System.out.println("Wait Begin... ");
        if (num == 2) {
            this.notifyAll();
        } else {
            this.wait();
        }
        System.out.println("Wait End... ");

        System.out.println("End thread " + num);


    }
}
