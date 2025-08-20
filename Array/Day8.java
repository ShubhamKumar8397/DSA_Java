package Array;

public class Day8 {

    static void printTwoDArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeArray() {
        // original matrix is - 2 * 3 then tranpose matrix is 3 * 2

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }};
        int[][] newArr = new int[arr[1].length][arr.length];

        System.out.println("Before Transpose of The Matrix : ");
        printTwoDArray(arr);

        // tranpose an matrix
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                newArr[i][j] = arr[j][i];
            }
        }

        System.out.println("AfterTranpose of The Array");
        printTwoDArray(newArr);

    }

    public static void main(String[] args) {
        transposeArray();
    }
}