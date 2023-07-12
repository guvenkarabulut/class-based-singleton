package com.guvenakrabulut.singleton;

public class Singleton {
    private static Singleton instance = null;
    private int count=0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void increaseCount() {
        this.count++;
    }

    public void writeCount() {
        System.out.println(this.count);
    }
}