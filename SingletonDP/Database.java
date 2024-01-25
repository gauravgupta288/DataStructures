package SingletonDP;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Database {
    private static Database db = null;

    private synchronized Database getInstance(){
        Lock lock = new ReentrantLock();


        if(db == null){
            lock.lock();
            if(db == null){
                db = new Database();
            }
            lock.unlock();
            return db;
        }
        return db;
    }
}
