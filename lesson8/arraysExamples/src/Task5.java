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
