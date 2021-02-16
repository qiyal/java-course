public class AsciiCode {
    public static void main(String[] args) {
        // b1 = 53 - 48 = 5
        int b1 = '5' - '0';

        // b2 = 53;
        int b2 = (int)'5';

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("b1(char): " + (char)b1);

        //char 0 1 2 ^ a N

        int a = (int) 'A';
        System.out.println("A: " + a);

        String s = "asdsad7 5 6 4 3 5 5 5 J** 7 5";
        //               7 + 5 + 6 + .... + 7 + 5 = 52
        int ansSumDigit = 0;
        for (int i = 0; i < s.length(); i++) {
            // '0' <= s.charAt(i) <= '9'
            // 48 <= s.charAt(i) <= 57
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ansSumDigit += s.charAt(i) - '0';
            }
        }
        System.out.println("sum of digit on string: " + ansSumDigit);
    }
}