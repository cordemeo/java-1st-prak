public abstract class Dogs {
    private String name;
    private String size;
    private String noisiness;
    private String friendliness;
    public String getName() { return name; }
    public String getSize() { return size; }
    public String getNoisiness() { return noisiness; }
    public String getFriendliness() { return friendliness; }
    public Dogs(String name, String size, String noisiness, String friendliness){
        this.name=name;
        this.size=size;
        this.noisiness=noisiness;
        this.friendliness=friendliness;
    }
    public abstract void displayInfo();
    public abstract String toString();
}
class Mittelschnauzer extends Dogs {
    private String size1;
    public Mittelschnauzer(String name, String size, String noisiness, String friendliness) {
        super(name, size, noisiness, friendliness);
        this.size1=size;
    }
    public void displayInfo() {

        System.out.println("Название породы: " + super.getName() + " Размер собаки: " + size1 + "Уровень шума собаки: " + super.getNoisiness() + "Дружелюбность: " + getFriendliness());
    }
    public String toString() {
        return "Название породы: " + this.getName() + ",  Размер собаки:  " + this.size1 + "Уровень шума собаки: " + this.getNoisiness() + "Дружелюбность: " + this.getFriendliness();
    }
}
class YorkshireTerrier extends Dogs {
    private String size1;
    public YorkshireTerrier(String name, String size, String noisiness, String friendliness) {
        super(name, size, noisiness, friendliness);
        this.size1=size;
    }
    public void displayInfo() {

        System.out.println("Название породы: " + super.getName() + " Размер собаки: " + size1 + "Уровень шума собаки: " + super.getNoisiness() + "Дружелюбность: " + getFriendliness());
    }
    public String toString() {
        return "Название породы: " + this.getName() + ",  Размер собаки:  " + this.size1 + "Уровень шума собаки: " + this.getNoisiness() + "Дружелюбность: " + this.getFriendliness();
    }
}

