public class InterfaceTest {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        Car bmw = new Car("BMW", 50000.0);
        Animal cat = new Animal("Cat");

        System.out.println("Planet: " + earth.getName());
        System.out.println("Car: " + bmw.getName() + ", Price: $" + bmw.getPrice());
        System.out.println("Animal: " + cat.getName());
    }
}
