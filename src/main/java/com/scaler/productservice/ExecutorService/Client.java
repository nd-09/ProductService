package com.scaler.productservice.ExecutorService;



import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v=new Value();
        Adder add=new Adder(v);
        Subtractor sub=new Subtractor(v);
        ExecutorService es= Executors.newCachedThreadPool();
        es.submit(add);
        es.submit(sub);
        Future<Void> f1=es.submit(add);
        Future<Void> f2=es.submit(sub);
         f1.get();
         f2.get();
         System.out.println(v.val);
    }


}
