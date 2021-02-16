import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int a = scanner.nextInt();
//        long b = scanner.nextLong();

        int a2 = 1;
//        double s2 = 1.0;
        float f2 = 1.9f;

        long l = 1;
        char ch = 'a';

        String s = "string";
        String s2 = s;
        System.out.println(s);
        System.out.println(s2);

        s2 = "other value";

        System.out.println(s);
        System.out.println(s2);



        StringBuilder sb1 = new StringBuilder("bilder str");
        StringBuilder sb2 = sb1;

        System.out.println(sb1);
        System.out.println(sb2);

        sb2.append("plus str");
        sb1.append("plus 2");

        System.out.println(sb1);
        System.out.println(sb2);


        int int1 = 1;
        int int2 = int1;
        System.out.println(int1);
        System.out.println(int2);

        int1 = 2;

        System.out.println(int1);
        System.out.println(int2);
    }
}
