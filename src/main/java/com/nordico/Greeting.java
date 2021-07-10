package com.nordico;

/*
    Author: jalnor
    Date: 7/8/2021 10:23 AM
    Project: com.nordico
*/
public class Greeting {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorld() {
        return HELLO + " " + WORLD;
    }

    public String helloWorld(String name) {
        return HELLO + " " + name;
    }
}
