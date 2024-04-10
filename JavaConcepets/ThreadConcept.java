package JavaConcepets;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadConcept implements Runnable{
    ReentrantLock lock = new ReentrantLock();
    volatile int j = 1;
    @Override
    public void run() {

        for(int i = 1; i <= 50; i++){
           // lock.lock();
            System.out.println("thread name " + Thread.currentThread().getName() + " Number is : " + j++);
            //lock.unlock();
            }

        String t = "abcde";

        System.out.println(t.substring(1));
    }

    public static void main(String[] args) {

        ThreadConcept tr = new ThreadConcept();
        Thread t1 = new Thread(tr);
        t1.start();
        Thread t2 = new Thread(tr);
        t2.start();

    }


}
