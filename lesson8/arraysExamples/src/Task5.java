import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array [] = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // index 0  1  2  3  4
        // arr={ 1, 2, 3, 1, 1}
        // ans = 0

        // i = 0
        // j = 0
        // j < i -- false
        // ans = 1

        // i = 1
        // j = 0
        // 2 == 1 ---> false
        // j = 1
        // j < i --> false
        // ans = 2

        // i = 2
        // j = 0
        // 3 == 1 false
        // j = 1
        // 3 == 2 --> false
        // j = 2
        // j < i --> false
        // ans = 3

        // 0 1 2 3 4 5
        // 1 2 3 1 4 2
        // i = 3
        for (int i = 0; i < array.length; i++) {
            boolean addStatus = true;

            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    addStatus = false;
                    break;
                }
            }

            if (addStatus == true) {
               ans++;
            }
        }

        System.out.println(ans);
    }
}
