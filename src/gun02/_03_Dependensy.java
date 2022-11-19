package gun02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Dependensy {

    @Test
    void startCar(){
        System.out.println("startCar");
       // Assert.fail();
    }
    @Test(dependsOnMethods = {"startCar"})
     void driveCar()
     {

        System.out.println("driveCar");
    }

    @Test(dependsOnMethods = {"startCar","driveCar"})
    void parkCar(){
        System.out.println("parkCar");

    }
    @Test(dependsOnMethods = {"parkCar"})
    void stopCar(){
        System.out.println("stopCar");

    }
}
