package SingletonClass;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonClass {
    private static SingletonClass instance=null;

    private SingletonClass() {}
     static Lock lock = new ReentrantLock();

    public static SingletonClass getInstance() {
        if (instance == null) {
            //double lock mechanism to ensure thread safety
            lock.lock();
            if (instance == null) {
                instance = new SingletonClass();
            }
            lock.unlock();
        }
        return instance;
    }
}
