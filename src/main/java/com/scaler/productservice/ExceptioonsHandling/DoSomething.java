package com.scaler.productservice.ExceptioonsHandling;

public class DoSomething {

       public static int doSomething(int val) {
          try{
              if(val < 10){
                  throw new Exception();
              }else {
                  return val;
              }
          }catch (Exception e){
              System.out.println("Error in doSomething");
          }finally {
              System.out.println("DoSomething finally");
              return 21;
          }
       }
}
