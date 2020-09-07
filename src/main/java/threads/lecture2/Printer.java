package threads.lecture2;

import lombok.AllArgsConstructor;
import threads.lecture1.ThreadPractice;

@AllArgsConstructor
public class Printer extends Thread {

    private int num;
    private ThreadPractice2 threadPractice2;

    @Override
    public void run() {
//        synchronized (threadPractice2) {
            threadPractice2.print(num);
//        }
    }
}
