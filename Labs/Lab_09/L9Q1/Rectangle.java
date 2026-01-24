package L9Q1;
import java.util.*;

public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle() {
        super("Rectangle");
    }

    public void acceptInput(Scanner input) {
       
       System.out.println("Enter the width: ");
       double width = input.nextDouble();

       System.out.println("Enter the length: ");
       double length = input.nextDouble();

       this.width = width;
       this.length = length;
       
       computeArea();
       computePerimeter();
    }

    public void computePerimeter() {
        setPerimeter(width * 2 + length * 2); 
    }

    public void computeArea() {
        setArea(width*length);
    }
}
