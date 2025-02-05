package com.mywebapp.LambdaExpression;

public class LambdasDemo {

    public  static void show(){
        great(message-> System.out.println(message));
    }

    public static void great(Printer printer){
        printer.print("Hello world");
    }
}
