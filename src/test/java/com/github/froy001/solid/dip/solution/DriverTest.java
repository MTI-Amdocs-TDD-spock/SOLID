package com.github.froy001.solid.dip.solution;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class DriverTest extends TestSuite{


    @Test
    public void increaseSpeedCallsVehiclleAccelerate(){
        Vehicle vehicle = mock(Vehicle.class);
        Driver driver = new Driver(vehicle);
        driver.increaseSpeed();
        verify(vehicle).accelerate();

    }

}

