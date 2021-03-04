import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char chArr[] = s.toCharArray();

        int ansMax = 0;
        int k = 0;
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == '0') {
                k++;
            } else {
                ansMax = Math.max(ansMax,k);
                k = 0;
            }
        }

        ansMax = Math.max(ansMax, k);

        System.out.println(ansMax);
    }
}
