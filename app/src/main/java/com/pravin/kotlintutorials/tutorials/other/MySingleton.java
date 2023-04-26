package com.pravin.kotlintutorials.tutorials.other;

public class MySingleton {

    private static MySingleton singletonObject;

    private MySingleton() {

    }

    public static synchronized MySingleton getInstance() {
        if (singletonObject == null) {
            singletonObject = new MySingleton();
        }
        return singletonObject;
    }

    public static void main(String[] args) {
        MySingleton obj = MySingleton.getInstance();
        System.out.println(obj.hashCode());
        MySingleton obj2 = MySingleton.getInstance();
        System.out.println(obj2.hashCode());
    }
}



