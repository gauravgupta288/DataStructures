package JavaConcepets;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockConcept{
    public static void main(String[] args) {

        String ch  = "AbBCab";

        System.out.println(ch.substring(1).indexOf('a'));
        ExecutorService es = Executors.newFixedThreadPool(2);

        List<String> list = new ArrayList<>();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Runnable write = () -> {
            lock.writeLock().lock();
            try{
                list.add("test");
            }  finally {
                lock.writeLock().unlock();
            }
        };

        Runnable read = () -> {
            lock.readLock().lock();
            try{
                System.out.println(list.get(0));
            }finally {
                lock.readLock().unlock();
            }
        };

        es.submit(write);
        es.submit(read);
        es.submit(read);
        es.shutdown();
    }

}
