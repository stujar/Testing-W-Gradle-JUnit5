package com.nordico;

import org.junit.jupiter.api.*;

/*
    Author: jalnor
    Date: 7/9/2021 9:44 PM
    Project: com.nordico
*/
class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("I am only run once before all other methods...");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Jarrod"));
    }

    @Test
    void testHelloWorld2() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("I only run once after all other methods...");
    }
}