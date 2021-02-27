import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean ans = false;
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= 0 && arr[i + 1] >= 0 || arr[i] < 0 && arr[i + 1] < 0) {
                ans = true;
                break;
            }
        }

        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
