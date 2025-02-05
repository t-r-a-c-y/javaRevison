package com.mywebapp.LambdaExpression;

public interface Printer {
    void print(String message);

    default void doublePrint(String message){
        System.out.println(message);
        System.out.println(message);
    }

}
