import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int crashIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 437) {
                crashIndex = i + 1;
                break;
            }
        }

        if (crashIndex == -1) {
            System.out.println("No crash");
        } else {
            System.out.println("Crash " + crashIndex);
        }
    }
}
