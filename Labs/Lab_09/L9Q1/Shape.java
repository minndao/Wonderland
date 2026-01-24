package L9Q1;

public class Shape {
    private String name;
    private double perimeter;
    private double area;

    Shape(String name, double perimeter, double area) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    public void display() {
        System.out.println("Name of the shape: " + this.name);
        System.out.printf("Perimeter: %.2f\nArea: %.2f",perimeter,area);
    }
}