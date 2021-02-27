import java.util.ArrayList;
import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String s = "qwerty";

        // variant - 1, қалай String s-ты char array ға айналдырсақ болады
        // String s-та қанша әріп бар сонша размер береміз. Ол s.length()-қа тен
        char [] charArrayVar1 = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            charArrayVar1[i] = s.charAt(i);
        }
        System.out.println(Arrays.toString(charArrayVar1));



        // variant - 2, қалай String s-ты char array ға айналдырсақ болады
        // ол үшін String-тағы toCharArray() методты қолданамыз
        char [] charArrayVar2 = s.toCharArray();
        System.out.println(Arrays.toString(charArrayVar2));
    }
}
