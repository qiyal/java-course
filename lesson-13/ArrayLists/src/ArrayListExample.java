import java.util.*;

/**
 * JCF - Java Collection Framework
 *
 * ArrayList - одна из самых популярных коллекций в Java.
 * Принцип такой же как и в массивах, есть элементы, стоящие на своих индексах.
 * 
 *
 * ArrayList автоматизирует многие действия с массивами, т.е.
 * это как бы автоматизированный массив
 *
 * Пока в коде можно посмотреть само использование Array-Листа
 * Wrapper Class - Класс Обёртка - Обёрточный класс
 *
 * int - Integer
 * double - Double
 * char - Character
 * boolean - Boolean
 *
 * int a - defeinition
 * a = 5 - initialization
 *
 * https://habrahabr.ru/post/128269/
 *
 * https://ru.wikipedia.org/wiki/API
 */

public class ArrayListExample {
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

        // Проход по ArrayList с помощью цикла for, проходящего по индексам
        for (int i = 0; i < myList.size(); i++)
            System.out.print(myList.get(i) + " ");

        System.out.println();

        // forEach, iter + tab
        for (String s : myList)
            System.out.print(s + " ");

        // Можно вывести просто через System.out.println()
        // т.е. БЕЗ цикла. В массиве такого делать нельзя.
        System.out.println("\n" + myList + "\n");

        // Встроенный метод для проверки пустоты
        if (myList.isEmpty())
            System.out.println("MyList is empty");
        else
            System.out.println("MyList is not empty");

        // Установка нового значения на определённый индекс
        myList.set(1, "Roman");

        // Смотрим, что получилось
        System.out.println("\n" + myList + "\n");

        // Встроенный метод для проверки, есть ли в ArrayList-е определённый элемент
        if (myList.contains("Kanzhar"))
            System.out.println("Kanzhar is there");
        else
            System.out.println("Kanzhar is not there");

        // Удаление определённого элемента
        // Если таких элементов несколько, то удалит самый первый
        myList.remove("Nurbek");
        System.out.println("\n" + myList);

        // Удаление по определённому индексу
        myList.remove(0);
        System.out.println("\n" + myList);

        // Добавление нового элемента, но только не в конец, а на определённое место
        myList.add(0, "Kirill");
        System.out.println("\n" + myList);

        myList.add(0, "Ruslan");
        System.out.println("\n" + myList + "\n");

        // Встроенный метод для вывода индекса определённого элемента
        // Если элемента такого нет, то вернёт -1
        // Если таких элементов несколько, вернёт индекс первого
        System.out.println(myList.indexOf("Ruslan"));
        System.out.println(myList.indexOf("Akay"));

        // Вывод последнего появление определённого элемента
        System.out.println(myList.lastIndexOf("Ruslan"));

        /* Есть специальный отдельный класс Collections, в котором содержатся
        методы для работы с коллекциями (а ArrayList - Это коллекция).
        В этом классе есть встроенный метод, который автоматически сортирует
        ArrayList
         */
        Collections.sort(myList);
        System.out.println("\n" + myList + "\n");

        // Встроенный в класс Collections метод, который позволяет вернуть количество
        // определённых элементов в ArrayList, т.е. сколько раз определённый элемент
        // встречается в ArrayList
        System.out.println("There are " + Collections.frequency(myList, "Ruslan") + " Ruslans");
        System.out.println("There are " + Collections.frequency(myList, "Nurdaulet") + " Nurdaulets");

        // Встроенный метод, который позволяет поменять между собой местами элементы
        // на разных индексах
        Collections.swap(myList, 1, 3);
        System.out.println("\n" + myList + "\n");

        // Встроенные методы для нахождение минимального и максимального
        // значение ArrayList-а
        System.out.println("Min element = " + Collections.min(myList));
        System.out.println("Max element = " + Collections.max(myList));

        // Пример работы с ArrayList-ом, содержащим целые числа
        // Создание ArrayList-а с целыми числами
        List<Integer> myIntList = new ArrayList<>();

        // Просится кол-во элементов, сколько пользователь хотел бы ввести
        System.out.print("\nEnter the number of elements you want to add: ");
        int n = scanner.nextInt();

        // Вводится n элементов
        System.out.println("\nEnter " + n + " elements!");
        for(int i = 0; i < n; i++) // i играет роль счётчика
            myIntList.add(scanner.nextInt());

        System.out.println("\n" + myIntList);
    }
}
