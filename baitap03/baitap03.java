package baitap03;

public class baitap03 {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(3,4);
        Square square = new Square(5);

        circle.setColor("red");
        rectangle.setColor("blue");
        square.setColor("green");

        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Square color: " + square.getColor());
    }
}
