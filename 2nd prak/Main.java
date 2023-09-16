import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface ComputerManagement {
    void addComputer(Computer computer);
    void removeComputer(Computer computer);
    Computer findComputer(String desiredModel);
}

class Shop implements ComputerManagement {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    @Override
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    @Override
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    @Override
    public Computer findComputer(String desiredModel) {
        for (Computer computer : computers) {
            if (computer.getModel().equals(desiredModel)) {
                return computer;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество компьютеров в магазине: ");
        int numComputers = scanner.nextInt();
        scanner.nextLine(); // Считываем символ новой строки после числа

        for (int i = 0; i < numComputers; i++) {
            System.out.println("Введите данные для компьютера " + (i + 1) + ":");
            System.out.print("Модель: ");
            String model = scanner.nextLine();
            System.out.print("Цена: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Считываем символ новой строки после числа

            Computer computer = new Computer(model, price);
            shop.addComputer(computer);
        }

        System.out.print("Введите модель компьютера для поиска: ");
        String desiredModel = scanner.nextLine();

        Computer foundComputer = shop.findComputer(desiredModel);
        if (foundComputer != null) {
            System.out.println("Компьютер найден: " + foundComputer.getModel() + ", Цена: " + foundComputer.getPrice());
        } else {
            System.out.println("Компьютер не найден.");
        }
    }
}

class Computer {
    private String model;
    private double price;

    public Computer(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
