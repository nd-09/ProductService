package SingletonClass;

import java.util.concurrent.Callable;

public  class MultipleThreadSafe_Singleton implements Callable<SingletonClass> {

    @Override
    public SingletonClass call() throws Exception {
        for (int i=0; i<10; i++) {
            SingletonClass singletonClass = SingletonClass.getInstance();
            System.out.println("HASHCODE for every instance ==  "+ singletonClass.hashCode());
            return singletonClass;
        }
        return null;
    }

}
