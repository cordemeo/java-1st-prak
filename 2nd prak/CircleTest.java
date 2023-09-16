public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.5);

        System.out.println("Circle 1: Radius = " + circle1.getRadius());
        System.out.println("Circle 1: Area = " + circle1.calculateArea());
        System.out.println("Circle 1: Circumference = " + circle1.calculateCircumference());

        System.out.println("Circle 2: Radius = " + circle2.getRadius());
        System.out.println("Circle 2: Area = " + circle2.calculateArea());
        System.out.println("Circle 2: Circumference = " + circle2.calculateCircumference());

        System.out.println("Are the circles equal? " + circle1.equals(circle2));
    }
}