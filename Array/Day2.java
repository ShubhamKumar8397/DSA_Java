package Array;

import java.util.Scanner;

class homeworkAssignment {

    void findPositiveInteges() {
        int[] arr = { 2, 6, -5, 4, -3, 8, 2, 8, 0, -4, -2, 5 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                System.out.println(arr[i]);
            }
        }
    }

    void printOddIndexesValue() {
        String[] arr = { "ab", "bc", "de", "ef", "gh" };

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    void findPeakElement() {
        int[] arr = { 1, 1, 3, 4, 2, 3, 5, 7, 9 };

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("Peak Element Is : " + arr[i]);
            }
        }
    }
}

class ArrayExample {

    int findANumberInArray() {
        int[] arr = { 2, 4, 6, 3, 7, 27, 8, 2, 5, 8, 8, 3 };
        Scanner sc = new Scanner(System.in);

        int index = -1;

        System.out.println("Enter Your Number U Want To Search In Array : ");
        int desiredNumber = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (desiredNumber == arr[i]) {
                System.out.println(arr[i]);
                index = i;
                break;
            }
        }

        return index;
    }

    int maxValueInArray() {
        int[] arr = { 3, 5, 51, 6, 2, 6, 11, 66, 8 };
        int maxValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    int sumOfArrayByTakingInput() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter your " + i + " Number : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;

    }

    void multiDimenArray() {
        int[][] ages = { { 3, 5, 6 }, { 70, 80, 34, 53 }, { 55, 66, 77, 77, 3 }, { 3, 6 } };

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                System.out.println(ages[i][j]);
            }
        }
    }

    void demoArray() {
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = { "Rahul", "raj", "pk" };
        ages[0] = 5;
        ages[1] = 25;
        ages[2] = 95;
        // ages[6] = 88;

        // System.out.println(ages[1]);
        // System.out.println(ages);

        // System.out.println(names[1]);
        // System.out.println(names[2]);

        // System.out.println(names.length);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}

class questionsLecture2{

    int findOccurenceOfANumber(int [] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number You Want To count : ");
        int desiredNumber = sc.nextInt();
        int count = 0;

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] ==  desiredNumber){
                count++;
            }
        }
        return count;

    }

    int findLastOccurenceOFNumber(int [] arr, int x){
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                index = i;
            }
        }
        return index;
    }

    void givenArrayIsSortedOrNot(int [] arr){
        boolean result = true;
        for(int i = 0; i < arr.length - 1; i++){
            if(!(arr[i] <= arr[i + 1])){
                result = false;
                break;
            }
        }
        System.out.println("ARRAY IS SORTED : " +  result);
        
    }

    int [] maxAndMinValueArray(int [] arr){
        int [] newArr = new int[arr.length];

      for(int i = 0; i < arr.length ; i++){
        int value = arr[i];
        for(int j = 0; j < arr.length; j++){
            if(value > arr[j]){
                value = arr[j];
            
            }
        }
        newArr[i] = value;
      }

      for(int i = 0; i< newArr.length; i++){
        System.out.print(newArr[i] + " ");
      }

      newArr[0] = arr[0];
      newArr[1] = arr[arr.length-1];
      System.out.println(newArr[0]);
      System.out.println(newArr[1]);

      return newArr;
    }

}

public class Day2 {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 3, 5, 6, 3, 4 };

        questionsLecture2 obj = new questionsLecture2();
        // System.out.println(obj.findOccurenceOfANumber(arr));

        System.out.println("Enter The Length Of Array");
        int n = sc.nextInt();

        int [] array = new int[n];
        
        System.out.println("Enter Five Elements Of Array");
        for(int i = 0; i < array.length ; i++){
            array[i] = sc.nextInt();
        }

        // System.out.println("Enter the Number That You Want The Last Occurence");
        // int x = sc.nextInt();

        // System.out.println(obj.findLastOccurenceOFNumber(array, x));

        // obj.givenArrayIsSortedOrNot(array);
        obj.maxAndMinValueArray(array);


        // ArrayExample obj = new ArrayExample();
        // obj.demoArray();
        // obj.multiDimenArray();

        // System.out.println(obj.sumOfArrayByTakingInput());
        // System.out.println(obj.maxValueInArray());

        // System.out.println(obj.findANumberInArray());

        // HomeWork Class Object Make;

        // homeworkAssignment obj2 = new homeworkAssignment();
        // obj2.findPositiveInteges();
        // obj2.printOddIndexesValue();
        // obj2.findPeakElement();

        // This Also Know As Shallow Copy

        
        // int[] arr_2 = arr;

        // System.out.println("Original Array : ");
        // printArray(arr);

        // System.out.println("Copying Array");
        // printArray(arr_2);

        // // update sone values of arr-2  

        // arr_2[2] = 200;
        // arr_2[3] = 100;

        // System.out.println("Original Array After Edit : ");
        // printArray(arr);

        // System.out.println("Copying Array After Edit");
        // printArray(arr_2);


        // Cloning A Array
        // int[] arr_3 = { 2, 3, 5, 6, 3, 4 };
        // int[] arr_4 = arr_3.clone();

        // System.out.println("Original Array" );;
        // printArray(arr_3);

        // arr_4[4] = 300;
        // arr_4[2] = 200;

        // System.out.println("Edited Array :");
        // printArray(arr_4);
    }
}
