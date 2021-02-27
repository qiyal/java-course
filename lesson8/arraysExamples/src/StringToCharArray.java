public class StringToCharArray {
    public static void main(String[] args) {
        String s = "qwerty";

        char [] arrayChars = s.toCharArray();

        for (int i = 0; i < arrayChars.length; i++) {
            System.out.println("index i: " + i + "\t" + "value: " + arrayChars[i]);
        }
    }
}
