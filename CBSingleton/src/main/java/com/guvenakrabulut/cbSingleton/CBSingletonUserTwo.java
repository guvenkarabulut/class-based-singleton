package com.guvenakrabulut.cbSingleton;

public class CBSingletonUserTwo {
    CBSingleton sample = CBSingleton.getInstance(CBSingletonUserTwo.class);
    public void doSomething() {
        sample.increaseCount();
        sample.increaseCount();
        sample.increaseCount();
        sample.writeCount();
    }
}
