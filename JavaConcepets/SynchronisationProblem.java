package JavaConcepets;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronisationProblem {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        ReentrantLock lock = new ReentrantLock();
        Map<Integer, Integer> map = new HashMap<>();

        Subratractor sub = new Subratractor(count, lock);
        Adder add = new Adder(count, lock);

        Thread t1 = new Thread(sub);
        Thread t2 = new Thread(add);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(count.val);
    }
}

class Count{
     int val = 0;
}
class Subratractor implements Runnable{
    Count count;
    ReentrantLock lock;

    Subratractor(Count count, ReentrantLock lock){
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i = 0;i< 100000;i++){
            synchronized (count){
                count.val -= i;
            }
        }
        int n;
        if((n = count.val) == 0){

        }
    }
}

class Adder implements Runnable{
    Count count;
    ReentrantLock lock;

    Adder(Count count, ReentrantLock lock){
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i = 0;i< 100000;i++){
            synchronized (count){
                count.val += i;
            }
        }
    }
}
