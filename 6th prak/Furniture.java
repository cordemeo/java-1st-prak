public abstract class Furniture {
    private String name;
    private String color;
    public String getName() { return name; }
    public String getColor() { return color; }
    public Furniture(String name, String color){
        this.name=name;
        this.color=color;
    }
    public abstract void displayInfo();
    public abstract String toString();
}
class Chair extends Furniture {
    private String color1;

    public Chair(String name, String color) {
        super(name, color);
        this.color1 = color;
    }

    public void displayInfo() {

        System.out.println("Название: " + super.getName() + " цвета: " + color1);
    }
    public String toString() {
        return "Название: " + this.getName() + ",  Цвет: " + this.color1;
    }

}
class Sofa extends Furniture {
    private String color1;

    public Sofa(String name, String color) {
        super(name, color);
        this.color1 = color;
    }

    public void displayInfo() {

        System.out.println("Название: " + super.getName() + " цвета: " + color1);
    }
    public String toString() {
        return "Название: " + this.getName() + ",  Цвет: " + this.color1;
    }

}
class FurnitureShop extends Furniture{
    private String cost;

    public FurnitureShop(String name, String cost) {
        super(name, cost);
        this.cost = cost;
    }

    public void displayInfo() {

        System.out.println("Название: " + super.getName() + " цена: " + cost);
    }
    public String toString() {
        return "Название: " + this.getName() + ",  Цена: " + this.cost;
    }

}
