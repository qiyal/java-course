package leetcode;

import java.util.Scanner;

public class LengStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();

//        for(int i = 0; i < n; i++) {
//            String s = sc.next();
//
//            if (s.length() > 10) {
//                char chL = s.charAt(0);
//                int length = s.length() - 2;
//                char chR = s.charAt(s.length() - 1);
//
//                System.out.println(chL + "" + length + "" + chR);
//            } else {
//                System.out.println(s);
//            }
//        }

        String s = "qwerty";
        String str = "abc";

        // q - 1, index = 0;
        // w - 2, index = 1;
        // e - 3, index = 2;
        // r - 4, index = 3;
        // t - 5, index = 4;
        // y - 6, index = 5;

        System.out.println("s length: " + s.length());
        System.out.println("s char 1: " + s.charAt(0));
        System.out.println("s char 2: " + s.charAt(1));
        System.out.println("s char last(6): " + s.charAt(s.length() - 1));
        System.out.println("s char last(6): " + s.charAt(5));

    }
}
