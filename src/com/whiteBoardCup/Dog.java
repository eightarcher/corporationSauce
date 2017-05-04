package com.whiteBoardCup;

/**
 * Created by mikeschaff on 5/4/17.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//
//    }
    public Dog(String name, int size, int weight, int eyes,
               int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        //remove brain and body from the constructor and set
        //the default brain and body to 1 in the super.
        //that way the programmer of the Dog class doesn't have to set those
        //values - all dogs have one brain and one body.
        //however, we will add the Dog specific parameters to the constructor.

        this.eyes = eyes;
        this.tail = tail;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
        //this is a private method specific to a dog.
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
//        super.move(10); it is better to call the move() method rather than
        // overriding it
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
