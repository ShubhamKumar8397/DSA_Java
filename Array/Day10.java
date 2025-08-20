// Lecture 23
package Array;

import java.util.Scanner;

// Calculate the no of elements in the rectangle coordinates
// find sum of rectangle of two coordinates

public class Day10 {
    // helper function to print a 2D Array

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // the four index of rectangle given :::

    static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // calculate the prefix sum row wise in 2D array
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] = matrix[i][j] + matrix[i][j - 1];
            }
        }

        // traverse vertically to calcultae column wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; j < r; i++) {
                matrix[i][j] = matrix[i][j] + matrix[i - 1][j];
            }
        }
    }

    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    static int findSumOfRectangleApproach2(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        findPrefixSumMatrix(matrix);
        printMatrix(matrix);

        for (int i = l1; i <= l2; i++) {
            // r1 to r2 sum for row 1
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                // if r1 is 0 then we to give the value direct because 0 to r2
                sum += matrix[i][r2];
            }
        }
        return sum;
    }

    static int findSumofRectangleApproach3(int[][] matrix, int l1, int r1, int l2, int r2) {
        // mast tarika phle 2d array ke rows ka prefix sum nikal le badhwe
        // then each column ka prefix sum nikal le
        // agar l1 , r1 , l2, r2 any things become zero then code have many edge cases

        // original array   after row prefix    find then find column prfix
        // 1 1 1               1 2 3                1 2 3
        // 1 1 1               1 2 3                2 4 6
        // 1 1 1               1 2 3                3 6 9

        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
        findPrefixSumMatrix(matrix);

        sum = matrix[l2][r2];
        if (r1 >= 1)
            left = matrix[l2][r1 - 1];
        if (l1 >= 1)
            up = matrix[l1 - 1][r2];
        if (l1 >= 1 && r1 >= 1)
            leftUp = matrix[l1 - 1][r1 - 1];

        ans = sum - up - left + leftUp;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter The number of Columns : ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter " + r * c + "Elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Rectangle Boundaries l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Sum of Total coordinated :: " + findSum(matrix, l1, r1, l2, r2));
        System.out.println("Sum is Equal to ::" + findSumOfRectangleApproach2(matrix, l1, r1, l2, r2));
    }
}
