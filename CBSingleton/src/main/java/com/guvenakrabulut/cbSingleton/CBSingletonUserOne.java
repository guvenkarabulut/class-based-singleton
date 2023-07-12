package com.guvenakrabulut.cbSingleton;

public class CBSingletonUserOne {
    CBSingleton sample = CBSingleton.getInstance(CBSingletonUserOne.class);
    CBSingleton sampleOne= CBSingleton.getInstance(CBSingletonUserOne.class);
    public void doSomething() {
        sample.increaseCount();
        sample.increaseCount();
        sample.increaseCount();
        sampleOne.increaseCount();
        sampleOne.increaseCount();
        sampleOne.increaseCount();
        sample.writeCount();

    }
}
