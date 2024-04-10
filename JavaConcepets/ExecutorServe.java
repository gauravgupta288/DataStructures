package JavaConcepets;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutorServe {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ReentrantLock lock = new ReentrantLock();
        for(int i = 1; i <= 100; i++){
            NumberPrinter np = new NumberPrinter(i,  lock);
            executorService.submit(np);
        }
        executorService.shutdown();
    }
}

    class NumberPrinter implements Runnable {
    volatile int i;
    final ReentrantLock lock;

    NumberPrinter(int i, ReentrantLock lock ){
        this.i = i;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.println("Number : "+i + " " + Thread.currentThread().getName());
        lock.unlock();
    }
}
