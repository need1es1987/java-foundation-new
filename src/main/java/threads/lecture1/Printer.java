package threads.lecture1;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class Printer extends Thread{
    private final String message;
    private final long sleepMls;

    @SneakyThrows
    @Override
    public void run() {

        for (int i = 0; i < 5 ; i++) {
            Thread.sleep(sleepMls);
            System.out.print(message + " ");
        }

    }
}
