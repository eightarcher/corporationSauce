package com.funeralBarber;

/**
 * Created by mikeschaff on 5/4/17.
 */
public class BMWM3 extends Car {
    private int roadServiceMonths;

    public BMWM3(int roadServiceMonths) {
        super("BMWM3", "GT", 4, 2, 6, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity ==0){
            stop();
        }
        else if(newVelocity >0 && newVelocity <=10){
            changeGear(1);
        }
        else if(newVelocity >10 && newVelocity <=30){
            changeGear(2);
        }

        else if(newVelocity >30 && newVelocity <=60){
            changeGear(3);
        }

        else if(newVelocity >60 && newVelocity <=90){
            changeGear(4);
        }

        else if(newVelocity >90 && newVelocity <=120){
            changeGear(5);
        }

        else {
            changeGear(6);
        }
    }
}
