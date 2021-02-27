import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] ansArr = new int[n];
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            ansArr[i + 1] = arr[i];
        }
        ansArr[0] = arr[arr.length - 1];

        for (int a : ansArr) {
            System.out.print(a + " ");
        }
    }
}
