package lesson5;

import java.util.Random;

public class JavaRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 100;
        int min = 50;
        // 50 <= x <= 100

        for (int i = 0; i < 10; i++) {
            //                 random.nextInt(max - min + 1) + min
            System.out.print(random.nextInt(max - min + 1) + 50 + " ");
        }

        //                 random.nextInt(max) -> 0 <= max - 1  < max
        System.out.println();
        for (int i = 0; i < 10; i++) {
            // 0 <= x < 10
            // max(x) = 9
            System.out.print(random.nextInt(10 + 1) + " ");
        }

    }
}
