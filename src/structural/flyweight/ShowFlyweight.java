package structural.flyweight;

import java.awt.*;

public class ShowFlyweight {

    public static void main(String[] args) {
        Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
        Vehicle redVehicle = VehicleFactory.createVehicle(Color.RED);
        System.out.println(blackVehicle.hashCode());
        System.out.println(redVehicle.hashCode());
    }
}
