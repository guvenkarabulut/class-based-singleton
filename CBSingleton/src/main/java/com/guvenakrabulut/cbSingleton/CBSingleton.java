package com.guvenakrabulut.cbSingleton;


import java.util.HashMap;
import java.util.Map;

public class CBSingleton {
    private static final Map<Object, CBSingleton> instanceMap = new HashMap<>();
    private int count=0;

    private CBSingleton() {
    }

    public static synchronized CBSingleton getInstance(Object obj) {
        if (!instanceMap.containsKey(obj)) {
            CBSingleton newInstance = new CBSingleton();
            instanceMap.put(obj, newInstance);
            return newInstance;
        }
        return instanceMap.get(obj);
    }


    public void increaseCount() {
        this.count++;
    }

    public void writeCount() {
        System.out.println(this.count);
    }
}
