package baitap03;

import java.awt.*;

public class Circle implements Colorable{
    private double radius;
    private String color;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void setColor(String color) {
        this.color = color;

    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
