package com.whiteBoardCup;

/**
 * Created by mikeschaff on 5/4/17.
 */
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",
                1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2,
                4, 1, 20, "long silky");
        dog.eat();
        dog.run();
//        dog.walk();

    }
}