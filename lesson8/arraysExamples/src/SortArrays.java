import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        int [] intArray = {9, 1, 23, 3, 1, 2, 3};

        double [] doubleArray = {3.3, 34.3, 2.3, 3.2, 3, 1.2};

        char [] charArray = {'c', 'd', 'a', 'e', 'A', 'b', 'E', '@', '1', '0'};

        String [] stringArray = {"aaa", "abb", "aba", "cds", "A", "a", "e", "aaaa", "bbbb"};

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));

        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }
}
