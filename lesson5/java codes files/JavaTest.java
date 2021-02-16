public class JavaTest {
    public static void main(String[] args) {
        String s = "asdsad7 5 6 4 3 5 5 5 J** 7 5";
        //               7 + 5 + 6 + .... + 7 + 5 = 52
        int ansSumDigit = 0;
        for (int i = 0; i < s.length(); i++) {
            // '0' <= s.charAt(i) <= '9'
            // 48 <= s.charAt(i) <= 57
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ansSumDigit += s.charAt(i) - '0';
//                ansSumDigit += s.charAt(i);
                System.out.println((int) s.charAt(i) + " - " + (int)'0');
//                System.out.println(s.charAt(i) - '0');
            }
        }
        System.out.println("sum of digit on string: " + ansSumDigit);
    }
}