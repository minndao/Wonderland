package L9Q1;

import java.util.Scanner;

public class Circle extends Shape {
    private double diameter;

    Circle() {
        super("Circle");
    }

    public void inputDiameter() {
        Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the diameter: ");
      this.diameter = input.nextDouble();

       input.close();
    }

    public void computePerimeter() {
        setPerimeter(Math.PI * diameter); 
    }

    public void computeArea() {
        setArea(Math.PI * Math.pow(diameter/2, 2));
    }

}
