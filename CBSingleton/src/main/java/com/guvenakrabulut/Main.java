package com.guvenakrabulut;

import com.guvenakrabulut.cbSingleton.CBSingletonUserOne;
import com.guvenakrabulut.cbSingleton.CBSingletonUserTwo;
import com.guvenakrabulut.singleton.SingletonUserOne;
import com.guvenakrabulut.singleton.SingletonUserTwo;

public class Main {
    public static void main(String[] args) {
        SingletonUserOne singletonUserOne = new SingletonUserOne();
        SingletonUserTwo singletonUserTwo= new SingletonUserTwo();
        singletonUserOne.doSomething();
        singletonUserTwo.doSomething();

        CBSingletonUserOne sampleUserOne = new CBSingletonUserOne();
        CBSingletonUserTwo sampleUserTwo = new CBSingletonUserTwo();
        sampleUserOne.doSomething();
        sampleUserTwo.doSomething();

    }
}