package com.solid.o.Good;

public class AnotherGoodClient implements Client_I {
    @Override
    public void doSomething() {
        System.out.println("I am doing something else");
    }
}
