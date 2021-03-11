import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание ArrayList-а
        ArrayList<String> myList = new ArrayList<>();

        // Вывод размера ArrayList-a
        System.out.println("MyList's size = " + myList.size());

        // Добавление элементов в ArrayList
        // Каждый новый элемент добавляется в конец
        myList.add("Veronika");
        myList.add("Handor");
        myList.add("Kanzhar");
        myList.add("Dinara");
        myList.add("Nurbek");
        myList.add("Ruslan");
        myList.add("Nurzhan");
        myList.add("Daulet");
        myList.add("Abylai");

        System.out.println("\nMyList's size = " + myList.size() + "\n");

//        myList.clear();
        int aLSize = myList.size();
        for (int i = 0; i < aLSize; i++) {
            myList.remove(0);
        }

        System.out.println("\nMyList's size = " + myList.size() + "\n");
    }
}
