package com.topwise.myappc02;

/**
 * @author mojialiang
 */
public class HelloWorld {

    static {
        System.loadLibrary("HelloWorld");
    }

    public native String sayHello ();
}
