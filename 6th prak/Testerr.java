public class Testerr {
    public static void main(String[] args) {
        Sofa sofa1 = new Sofa("supersofa", "white");
        Chair chair1 = new Chair("TABURETKA", "brown");
        FurnitureShop item1 = new FurnitureShop("supersofa", "1000");
        FurnitureShop item2 = new FurnitureShop("TABURETKA", "2000");
        System.out.println(sofa1);
        System.out.println(chair1);
        System.out.println(item1);
        System.out.println(item2);
    }
}
