package com.whiteBoardCup;

/**
 * Created by mikeschaff on 5/4/17.
 */
public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;


    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        //all animals eat
        //this is a public method specific to all animals.
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        //all animals move
        System.out.println("Animal.move() called, Animal is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
