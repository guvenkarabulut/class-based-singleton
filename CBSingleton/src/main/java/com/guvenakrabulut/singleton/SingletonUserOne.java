package com.guvenakrabulut.singleton;

public class SingletonUserOne {
    Singleton singleton = Singleton.getInstance();
    public void doSomething(){
        singleton.increaseCount();
        singleton.increaseCount();
        singleton.writeCount();
    }
}
