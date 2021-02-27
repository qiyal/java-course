public class NestetLoop {
    public static void main(String[] args) {

        int n = 3;
        int k = 1;

        // 1 <= k <= n * n;

//        for (int i = 0; i < n; i++) {
//            // 0, 1, 2, 3
//
//          for (int j = 0; j < n; j++) {
//              // 0, 1, 2, 3
//              System.out.print(k + " ");
//              k++;
//          }
//          System.out.println();
//        }

        for (int i = 0, j = 0; i < n; i++) {

            while (j < n) {
                // j = 0, 1, 2, 3
                System.out.print(k + " ");
                k++;
                j++;
            }
//            j = 0;
            System.out.println();
        }

        /*

        i = 0,  j=0,1,2,3
        1 2 3

        i = 1, j = 0-3
        4 5 6

        i = 2, j = 0 -3
        7 8 9

        i = 3 - stop

         */
    }
}
