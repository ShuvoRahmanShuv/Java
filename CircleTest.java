class Circle {
    private double radius;
    private final double PI = 3.1416;

    public Circle(double r) {
        setRadius(r);
    }

    public void setRadius(double r) {
        if (r > 0) {
            radius = r;
        } else {
            System.out.println("Radius should be greater than zero.");
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Name: MD. Mamunur Rahman Shuvo");
        System.out.println("ID: 250121055\n");

        Circle c1 = new Circle(3.0);
        Circle c2 = new Circle(20.0);

        System.out.println("Details of Circle 1:");
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());
        System.out.println();

        System.out.println("Details of Circle 2:");
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.getArea());
        System.out.println("Circumference: " + c2.getCircumference());
    }
}
