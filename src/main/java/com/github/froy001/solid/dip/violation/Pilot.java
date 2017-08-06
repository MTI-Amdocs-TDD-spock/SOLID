package com.github.froy001.solid.dip.violation;


import com.github.froy001.solid.dip.solution.RacingCar;

/**
 * Created by bsferreira on 17-04-2016.
 */
public class Pilot {

    private RacingCar vehicle;

    public Pilot(){
        this.vehicle = new RacingCar(100);
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}
