import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        List<Child> list1 = new ArrayList<>();
        list1.add(new Child("Alice", 5));
        list1.add(new Child("Bob", 7));
        list1.add(new Child("Charlie", 3));

        List<Child> list2 = new ArrayList<>();
        list2.add(new Child("David", 4));
        list2.add(new Child("Eve", 6));
        list2.add(new Child("Frank", 2));

        List<Child> mergedList = mergeSort(list1, list2);
        System.out.println(mergedList);
    }

    public static List<Child> mergeSort(List<Child> list1, List<Child> list2) {
        List<Child> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getAge() < list2.get(j).getAge()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}

class Child {
    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

