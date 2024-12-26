package SingletonClass;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
//       SingletonClass db_connection = SingletonClass.getInstance();
//       System.out.println("Your hash for obj 1 ==  "+db_connection.hashCode());
//       SingletonClass db_connection2 = SingletonClass.getInstance();
//       System.out.println("Your hash for obj 2 ==  "+db_connection2.hashCode());
//       if (db_connection == db_connection2) {
//           System.out.println("Your hash for obj 1 and obj 2 are EQUAL");
//       }

        ExecutorService es= Executors.newFixedThreadPool(10);
//        es.submit(new MultipleThreadSafe_Singleton());
        for(int i=0;i<1000;i++){
            es.submit(new MultipleThreadSafe_Singleton());
        }
//        Future<SingletonClass> f1 =  es.submit(new MultipleThreadSafe_Singleton());
//        Future<SingletonClass> f2 =  es.submit(new MultipleThreadSafe_Singleton());
//        try{
//            System.out.println(f1.get());
//            System.out.println(f2.get());
//        }catch(Exception e){
//            System.out.println("ERROR?..."+e);
//        }

    }
}
