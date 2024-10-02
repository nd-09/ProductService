package com.scaler.productservice.ExecutorService;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Value v;
    public Adder(Value v) {
        this.v = v;
    }


    @Override
    public Void call() throws Exception {
        for(int i=1;i<=1000000;i++){
        v.val+=1;
        }

//        System.out.println(v);
        return null;
    }
}
