package structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private VehicleFactory(){}

    private static Map<Color, Vehicle> vehicleCache = new HashMap<Color, Vehicle>();

    public static Vehicle createVehicle(Color color){
        Vehicle newVehicle = vehicleCache.computeIfAbsent(color, newColor->{
            Engine newEngine = new Engine();
            return new Car(newEngine, newColor);
        });
        return newVehicle;

    }
}
