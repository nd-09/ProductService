package Decorator;

import Decorator.Addons.*;
import Decorator.Breads.Bread;
import Decorator.Breads.ParmesianOreganoBread;
import Decorator.Breads.PlainBread;

public class Client {
    public static void main(String[] args) {
        Bread b = new ParmesianOreganoBread();
        System.out.println(b.getDescription());
        b= new Cheese(b);
        b=new MozerelaCheese(b);
        b=new Salads(b);
        b=new Cookie(b);
        b=new ColdDrink(b);
        System.out.println(b.getDescription());
        System.out.println("Total Cost: " + b.getCost());
    }
}
