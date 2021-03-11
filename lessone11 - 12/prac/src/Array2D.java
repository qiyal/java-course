import java.util.Scanner;

public class Array2D {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        //index         0  1  3  4
        int [] arr1D = {1, 2, 3, 4};

        int [][] arr = {
            //row=0
            {1, 2, 3, 4}, 

            //row=1
            {5, 6, 7, 8, 5}, // col = 0 <= 4 // arr[1][4] = 5// arr[1][0] = 5
            
            //row=2
            {9, 10, 11, 12}
        };
        // row = 0 <= 2
        // col = 0 <= 3

        // 2d array is array which contains arrays
        int [][] arr2D = {
                //0  1  2 (col)
                 {1, 2, 3},    //index - 0 (row)

                //0  1  2  3 (col)
                 {4, 5, 6, 7}, // index - 1 (row)

                //0  1   2  4 (col)
                 {8, 9 , 0, 1}  // index - 2 (row)
        };

        System.out.println(arr2D.length); // rowMax = 3
        System.out.println(arr2D[0].length); // 3
        System.out.println(arr2D[1].length); // 4

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] chArr = new int [n][m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                chArr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(chArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
