// Lecture 22 completed 2 Questions

package Array;
import java.util.Scanner;

public class Day9 {
    // helper function to print a 2D Array
    
    static void printMatrix(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix, int r , int c){
        int topRow = 0, bottomRow = r -1 , leftCol = 0, rightCol = c-1;
        int totalElements = 0;

        while(totalElements < r * c){

            // totalElements < r * c   we do check this condition in the all loop
            // when elements is last 25 element you enter in the loop but inside 
            // loops run this create repetition of element


            // topRow -> left column to rightColumn
            for(int j = leftCol ; j <= rightCol  && totalElements < r * c ; j++){                                                                           
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;  // for not repetition of end elements in the end 
            }
            topRow++;  

            //  rightColumn ->  top Row to bottom Rouw
            for(int i = topRow; i <= bottomRow && totalElements < r * c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;  
            }
            rightCol--;

            // bottom Row -> rightColumn to leftColumn
            for(int z = rightCol ; z >= leftCol && totalElements < r * c ; z--){
                System.out.print(matrix[bottomRow][z] + " ");
                totalElements++;
            }
            bottomRow--;

            // leftColumn -> bottom Row to top row
            for(int m = bottomRow; m >= topRow && totalElements < r * c; m--){
                System.out.print(matrix[m][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }


    static void fill_Elements_InSeries_SpiralOrder(int r, int c){
        int topRow = 0, bottomRow = r -1, leftCol = 0, rightCol = c-1;
        int [][] matrix = new int[r][c];
        int number = 1;

        while(number <= r * c){

        // first TopRow fill -> leftCol to rightCol;
        for(int i = leftCol; i <= rightCol && number <= r * c ; i++ ){
            matrix[leftCol][i] = number;
            number++;
        }
        topRow++;

        // RightCol Fill -> topRow to BottomRow;
        for(int i = topRow; i <= bottomRow && number <= r * c; i++){
            matrix[i][rightCol] = number;
            number++;
        }
        rightCol--;

        // bottomRow Fill -> rightCol to leftCol;
        for(int i = rightCol; i >= leftCol && number <= r * c; i--){
            matrix[bottomRow][i] = number;
            number++;
        }
        bottomRow--;

        // leftCol Fill -> bottomRow to TopRow
        for(int i = bottomRow; i >= topRow && number <= r * c; i--){
            matrix[i][leftCol] = number;
            number++;
        }
        leftCol++;
        }

        printMatrix(matrix);
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int r = sc.nextInt();
        System.out.println("Enter Number of Columns :");
        int c = sc.nextInt();

        // take a input for the matrix
        int [][] matrix = new int[r][c];
        System.out.println("Enter Array Elements : "+ r * c);
        for(int i = 0 ; i < r; i++){
            for(int j = 0; j < c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // for first Question 
        printSpiralOrder(matrix, r, c);

        // for Second Question
        fill_Elements_InSeries_SpiralOrder(r, c);

    }
}                                                                                                                                                                                      
                                                                                                                                                                                                   