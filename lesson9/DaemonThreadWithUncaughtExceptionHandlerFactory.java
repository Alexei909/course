package lesson9;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;

public class DaemonThreadWithUncaughtExceptionHandlerFactory implements ThreadFactory {

    private final UncaughtExceptionHandler uncaughtExceptionHandler;

    public DaemonThreadWithUncaughtExceptionHandlerFactory(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        thread.setDaemon(true);
        return thread;
    }

}
