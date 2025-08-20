package Array;

import java.util.Scanner;

public class Day6 {

    static void printArray(int [] arr){
        for( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +  " ");
        }
        System.out.println();
    }
    
    static void prefixSumArray(){
        int [] arr = {1, 2, 3, 4, 5, 6};

        int [] prefixArr = new int[arr.length];
        prefixArr[0] = arr[0];

        for(int i = 1; i < prefixArr.length; i++){
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }

        System.out.println("Print O./riginal Array : ");
        printArray(arr);

        System.out.println("Print Prefix sum Array : ");
        printArray(prefixArr);

    }

    static void prefixSumArrayInPlace(){
        int [] arr = {1, 2, 3, 5, 6, 7};

        for( int i = 1; i < arr.length;i++){
            arr[i] = arr[i-1] + arr[i];
        }

        System.out.println("Prefix Array");
        printArray(arr);
    }

    static void suffixSumArray(){
        int [] arr = {2, 5, 6, 1, 3};

        // int suffixArr = arr[arr.length - 1];

        for(int i = arr.length - 2 ; i >= 0; i--){
            arr[i] = arr[i] + arr[i+1];
        }

        printArray(arr);
    }
    
    static void prefixArrayLToR(int [] arr, int l , int r ){
        
        for(int i = l + 1; i <= r; i++){
            arr[i] = arr[i] + arr[i-1];
        }

        printArray(arr);
    }
  
    static void prefixSumArrayForQqueriesLToR(int[]arr, int l , int r){

    }

    static void findSubArrayequal(){
        boolean found = false;
        int [] arr = {5, 3, 2, 6, 3, 1,4 };
        int prefixSum = arr[0];
        int totalSum = 0;
        
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }

        for(int i = 0; i < arr.length -1 ; i++ ){
            if(prefixSum == (totalSum - prefixSum)){
                found = true;
                break;
            }
            prefixSum += arr[i];
        }

        System.out.println("Result " + found);

    }

    
    public static void main(String[] args){

        // prefixSumArray();
        // prefixSumArrayInPlace();


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The length of Array : ");
        // int n = sc.nextInt();

        // int [] arr = new int[n + 1];

        // System.out.println("Enter Elements of Array");
        // for(int i = 1; i < n + 1; i++){
        //     arr[i] = sc.nextInt();
        // }

        

        // System.out.println("Start Index For Pefix Sum : l :");
        // int l = sc.nextInt();

        // System.out.println("Enter End Index For Which Prefix Sum Array Want : r :");
        // int r = sc.nextInt();


        // findSubArrayequal();

        suffixSumArray();


     }
}