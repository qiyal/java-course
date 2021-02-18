public class ChangeSizeOfDataVariable {
    public static void main(String[] args) {
        System.out.println("Int MAX VAL: " + Integer.MIN_VALUE);
        System.out.println("Long MAX VAl: " + Long.MIN_VALUE);

//        int a = ; // 4 byte
        long l = Integer.MAX_VALUE;                 // 8 byte

        int b = (int)l;

//        int d = -21474836;
//        long l2 = d + 1;

        double d = 934.32;
        float f = (float) d;
        char ch = 'd';

        String s2 = "str" + (l + 1) + "\t" + d + ch;

        System.out.println(l);
        System.out.println(b);
        System.out.println(s2);
    }
}
