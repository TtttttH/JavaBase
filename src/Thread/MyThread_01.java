package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread_01 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("create a new Thread!");
            }
        });

        service.shutdown();
    }
}
