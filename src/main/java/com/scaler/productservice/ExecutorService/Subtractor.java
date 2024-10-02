package com.scaler.productservice.ExecutorService;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    Value v;
    Subtractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=1000000;i++){
            v.val-=1;
        }
        return null;
    }
}
