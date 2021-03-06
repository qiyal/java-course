import java.util.Scanner;

public class TaskExample1 {
    public static void main(String[] args) {
        // https://acmp.ru/index.asp?main=task&id_task=715
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char [][] chArr1 = new char[n][m];
        char [][] chArr2 = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            chArr1[i] = s.toCharArray();
        }

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            chArr2[i] = s.toCharArray();
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (chArr1[i][j] == chArr2[i][j]) {
                    k++;
                }
            }
        }

        System.out.println(k);
    }
}
