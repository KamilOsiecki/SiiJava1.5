package org.example;

public class Human implements Mobile, Talkable{

    @Override
    public void move() {
        System.out.println("Im human I can run with 13km/h");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello, nice to meet you: " + name);
    }
}
