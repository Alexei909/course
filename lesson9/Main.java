package lesson9;

import java.lang.Thread.UncaughtExceptionHandler;

public class Main {

    private static final String EXCEPTION_MESSAGE_TEMPLATE = "Exception with message %s in thread %s. \n";

    public static void main(String[] args) throws InterruptedException {
        final UncaughtExceptionHandler uncaughtExceptionHandler = (thread, exception) -> 
                System.out.printf(EXCEPTION_MESSAGE_TEMPLATE, exception.getMessage(), thread.getName());

        final Runnable exceptionTask = () -> {
            throw new RuntimeException("Runtime Exception");
        };

        DaemonThreadWithUncaughtExceptionHandlerFactory daemonFactory = new DaemonThreadWithUncaughtExceptionHandlerFactory(
                uncaughtExceptionHandler);
        
        Thread firstThread = daemonFactory.newThread(exceptionTask);
        firstThread.start();
        Thread secondThread = daemonFactory.newThread(exceptionTask);
        secondThread.start();

        firstThread.join();
        secondThread.join();

        final Runnable threadPriorityDisplayTask = () -> {
            System.out.println("Thread - %s has priority = %d"
                    .formatted(Thread.currentThread().getName(), Thread.currentThread().getPriority()));
        };

        ThreadWithArbitraryPriorityFactory maxPriorityFactory = new ThreadWithArbitraryPriorityFactory(Thread.MAX_PRIORITY);

        Thread thirdThread = maxPriorityFactory.newThread(threadPriorityDisplayTask);
        thirdThread.start();
        Thread fourthThread = maxPriorityFactory.newThread(threadPriorityDisplayTask);
        fourthThread.start();

        ThreadWithArbitraryPriorityFactory minPriorityFactory = new ThreadWithArbitraryPriorityFactory(Thread.MIN_PRIORITY);

        Thread fifthThread = minPriorityFactory.newThread(threadPriorityDisplayTask);
        fifthThread.start();
        Thread sixthThread = minPriorityFactory.newThread(threadPriorityDisplayTask);
        sixthThread.start();
    }
}
