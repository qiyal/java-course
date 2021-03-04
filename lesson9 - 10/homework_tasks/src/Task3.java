import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sumA = 0;
        int sumB = 0;
        for (int i =0; i < n; i++) {
            if (arr[i] == 0) {
                sumA++;
            } else {
                sumB++;
            }
        }

        if (sumA > sumB) {
            System.out.println(sumB);
        } else if (sumA < sumB) {
            System.out.println(sumA);
        } else {
            System.out.println(sumA);
        }
    }
}
