
import java.util.Scanner;

public class CircleArea {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        CircleArea ca = new CircleArea();
        ca.setRadius(radius);

        double area = ca.Area();
        System.out.println("The area of the circle is: " + area);
    }
}

