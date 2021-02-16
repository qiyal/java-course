import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 500;

        while (i < 15)
            System.out.print(i++ + " ");

        // --------------------------------

        System.out.println("\n");
        i = 500;
        do {
            System.out.print(i++ + " ");
        } while (i < 15);

    }
}
