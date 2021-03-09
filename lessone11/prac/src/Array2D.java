
public class Array2D {
    public static void main(String [] args) {
        //index         0  1  3  4
        int [] arr1D = {1, 2, 3, 4};

        int [][] arr = {{}, {}, {}};

        // 2d array is array which contains arrays
        int [][] arr2D = {
                //0  1  2
                 {1, 2, 3},    //index - 0

                //0  1  2  3
                 {4, 5, 6, 7}, // index - 1

                //0  1   2  4
                 {8, 9 , 0, 1}  // index - 2
        };

        System.out.println(arr2D.length);
        System.out.println(arr2D[1].length);

    }
}
