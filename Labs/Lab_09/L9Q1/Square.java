package L9Q1;

import java.util.Scanner;

public class Square extends Shape {
    double sideLength;

    public Square() {
        super("Square");
    }

    public void inputSide(Scanner input) {
       
       System.out.println("Enter the side length: ");
      this.sideLength = input.nextDouble();

      computeArea();
      computePerimeter();

       
    }

    public void computePerimeter() {
        setPerimeter(sideLength * 4);
    }

    public void computeArea() {
        setArea(sideLength * sideLength);
    }
}
