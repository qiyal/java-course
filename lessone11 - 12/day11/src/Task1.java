import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[][] = new char[4][4];

        for (int i = 0; i < 4; i++) {
            String s = sc.next();
            for (int j = 0; j < 4; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        String ans = "Yes";
        boolean stop = false;
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int k = 1;

                if (j + 1 < 4) {
                    if (arr[i][j] == arr[i][j + 1]) {
                        k++;
                    }
                }

                if (i + 1 < 4) {
                    if (arr[i][j] == arr[i + 1][j]) {
                        k++;
                    }
                }

                if (i + 1 < 4 && j + 1 < 4) {
                    if (arr[i][j] == arr[i + 1][j + 1]) {
                        k++;
                    }
                }

                if (k == 4) {
                    ans = "No";
                    stop = true;
                    break;
                }
            }

            if (stop == true) {
                break;
            }
        }

        System.out.println(ans);
    }
}
