public class Tester {
    public static void main(String[] args) {
        Krug[] krugs = new Krug[5]; // массив объектов Krug
        int count = 0; // количество элементов в массиве

        // Создаем объекты Krug и добавляем их в массив
        Point center1 = new Point(1, 2);
        Krug krug1 = new Krug(center1, 3);
        krugs[count++] = krug1;

        Point center2 = new Point(4, 5);
        Krug krug2 = new Krug(center2, 6);
        krugs[count++] = krug2;

        // Выводим информацию о каждом объекте Krug в массиве
        for (int i = 0; i < count; i++) {
            Krug krug = krugs[i];
            System.out.println("Krug " + (i + 1) + ":");
            System.out.println("Center: (" + krug.getCenter().getX() + ", " + krug.getCenter().getY() + ")");
            System.out.println("Radius: " + krug.getRadius());
            System.out.println();
        }
    }
}
