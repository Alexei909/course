package lesson9;

import java.util.concurrent.ThreadFactory;

public class ThreadWithArbitraryPriorityFactory implements ThreadFactory {

    private final int priority;

    public ThreadWithArbitraryPriorityFactory(int priority) {
        this.priority = priority;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setPriority(priority);
        return thread;
    }

}
