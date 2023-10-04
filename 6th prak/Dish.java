public abstract class Dish {
    private String name;
    private String color;
    public String getName() { return name; }
    public String getColor() { return color; }
    public Dish(String name, String color){
        this.name=name;
        this.color=color;
    }
    public abstract void displayInfo();
    public abstract String toString();
}
class Bowl extends Dish {
    private String color1;

    public Bowl(String name, String color) {
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


    class Spoon extends Dish {
        private String color1;

        public Spoon(String name, String color) {
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

