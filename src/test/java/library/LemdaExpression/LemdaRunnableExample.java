package library.LemdaExpression;

/**
 * Created by greycat on 18.03.14.
 */
public class LemdaRunnableExample {

    public static void main(String[] args){

        // Implemented class
        Runnable lemdaImplementRunnable = new ImplementRunnable();
        Thread implementClassThread = new Thread(lemdaImplementRunnable);

        // inner class
        Thread innerClassThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Implementation Inner class");
            }
        });

        // Lemda
        Thread lemdaThread = new Thread(() -> System.out.println("Implementation using Lemda"));

        implementClassThread.run();
        innerClassThread.run();
        lemdaThread.run();
    }
}
