package structural.flyweight;

import javax.print.attribute.standard.MediaSize;
import java.awt.*;

public class Car implements Vehicle {
    private Engine engine;
    private Color color;

    public Car(Engine engine, Color color){
        this.engine = engine;
        this.color = color;
    }
    @Override
    public void start() {
        System.out.println("Car is starting");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
        engine.stop();
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
