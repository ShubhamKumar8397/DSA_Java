package Array;

import java.util.Scanner;

class Assignment {
    void printArray(int [] arr){
        for( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +  " ");
        }
        System.out.println();
    }

    void findUniquMNInteger() {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 1, 4, 5, 2, 1, 1, 2, 2, 7 };
        System.out.println("Enter First Number need To find");
        int m = sc.nextInt();

        System.out.println("Enter Second Number Need to find");
        int n = sc.nextInt();

    }

    void findMaxContainer() {
        int[] arr = { 8, 3, 6, 2, 5, 4, 8, 3, 7 };
        // int [] arr = {1, 2, 3};
        int maxValue = 0;

        for (int i = 0; i < arr.length; i++) {
            int value = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    System.out.println("The Areas Areas are : i :" + arr[i] + " j " + Math.abs(i-j));
                    value = arr[i] * Math.abs(i - j);
                }

                if (value > maxValue) {
                    maxValue = value;
                }
            }
        }
        System.out.println(maxValue);
    }

    int findSubArraySumToX(){
        
        int [] arr = {2, 7, 11, 15};
        int result = -1;
        int x = 9;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr.length; j++){
                if(arr[i] + arr[j] == x){
                    System.out.println(i + " " + j);
                    return arr[i];
                }
            }
        }

        return result;
    }

    void sortSquaresOfNumber(){
        int [] arr = {-5, -2, -1, 0 , 4, 6};
        int [] ansArray = new int[arr.length];
        int left = 0;
        int right = arr.length -1 ;
        int idx = 0;

        while(left <= right){
            if(Math.abs(arr[left]) >= Math.abs(arr[right])){
                ansArray[idx++] = arr[left] * arr[left];
                left++;
            }

            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                ansArray[idx++] = arr[right] * arr[right];
                right--;
            }
        }

        printArray(ansArray);
    }

}

class  MultiDimensionalArray{

    void printArray(int [][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    void addTwoMatrices(){
        int [][] matrix1 = {{2,4},{4,5}};
        int [][] matrix2 = {{1,2},{3,4}};

        int [][] ansMatrix = new int [matrix1.length][matrix1[1].length];

        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                ansMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        printArray(ansMatrix);
    }

    void multidimensionalArray(){
        // int [][] arr = {{1, 2, 3}, {3, 4, 5}, {5,6, 7}};
        // printArray(arr);

        // take input for 2d array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows : ");
        int r = sc.nextInt();

        System.out.println("Enter The Number of Columns : ");
        int c = sc.nextInt();

        int [][] arr = new int[r][c];

        System.out.println(" Enter " + r * c + " Elemets : ");
        for(int i = 0;  i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array Formed From Your Input : ");
        printArray(arr);
    }

    void multiplicationOFMatrix(){
        
    }

}

public class Day7 {
    public static void main(String[] args) {

        Assignment obj = new Assignment();
        // obj.findMaxContainer();
        // obj.findSubArraySumToX();
        // obj.sortSquaresOfNumber();

        MultiDimensionalArray obj2 = new MultiDimensionalArray();
        // obj2.multidimensionalArray();
        obj2.addTwoMatrices();

    }
}
