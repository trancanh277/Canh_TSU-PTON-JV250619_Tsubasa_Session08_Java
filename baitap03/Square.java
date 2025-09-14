package baitap03;

import java.awt.*;

public class Square implements Colorable {
    private String color;
    private double side;
    public Square( double side) {
        this.color = color;
        this.side = side;

    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getSide() {
        return side;
    }
}
