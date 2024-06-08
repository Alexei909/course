package lesson7;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import lesson7.entities.Buyer;
import lesson7.utils.Randomaizer;

public class Main {

    private static final Long WORK_TIME = 120000L;

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(() -> {
            long currTime = System.currentTimeMillis();
            ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
            Runnable task = () -> {
                int countBuyers = Randomaizer.getRandomValue(0, 2);

                for (int i = 0; i < countBuyers; i++) {
                    Thread thread = new Thread(new Buyer("Buyer %s"
                            .formatted(Randomaizer.getRandomValue(0, 10000))));
                            
                    thread.start();
                }
            };

            service.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);

            while (!service.isShutdown()) {
                if (System.currentTimeMillis() - currTime >= WORK_TIME) {
                    service.shutdown();
                }
            }
        });

        myThread.start();
    }
}
