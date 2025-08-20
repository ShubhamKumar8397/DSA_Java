package Array;

public class Day4 {
    static void swapTwoNumbers(){
        int a = 10;
        int b = 13;
        int temp;

         temp = a;
         a = b;
         b = temp;

         System.out.println("value of a after swap : "+ a);
         System.out.println("Value of b after swap : " +b);


    }

    static void swapNumberWithoutTempVariable(){
        int a = 15;
        int b = 10;

        // solution ;
        // hint - This can Done by math's Magic

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value After Change");
        System.out.println("a " + a);
        System.out.println("b " + b);
    }

    static void reverseArray(){
        int [] arr = { 1, 2, 3, 4, 5};
        int [] ans = new int [arr.length];
        int idx = 0;
        for(int i = arr.length - 1 ; i >= 0; i--){
            ans[idx] = arr[i];
            idx++;
        }

        System.out.println("The manipulate or Reverse Array : ");
        for(int i = 0 ; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
    static void reverse_Array_Wihout_Making_New_Array(){

        // wihout making new Array is called as in place

        int [] arr = {1, 2, 3 ,4, 5, 6, 7, 9};
        for(int i = 0; i < arr.length/2; i++){

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("The Array After Reverse : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void rotateArrayByKSteps(int k){
        int [] arr = {1, 2, 4, 5, 6};
        int [] ansArr = new int [arr.length];

        k = k % arr.length;
        int idx = 0;

        for(int i = arr.length - k ; i < arr.length ; i++){
            ansArr[idx++] = arr[i];
        }

        for(int i = 0; i < arr.length - k ; i++){
            ansArr[idx++] = arr[i];
        }

        for(int i = 0; i < ansArr.length; i++){
            System.out.println(ansArr[i]);
        }
    }

    static void swap(int [] arr, int start , int end){   
        end = end -1 -start;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void reverse(int [] arr, int start , int end){
        // start means from the which part of array need to reverse
        // end refers to till the which index array reverse
        System.out.println(start + " " + end);

        // for(int i = start; start < end/2; start++){
        //     swap(arr, start , end);
        //     System.out.println("Value of Start is Equal to : " +start);
        // }

        while(start < end/2){
            swap(arr, start , end);
            start++;
        }
    }

    static void printArray(int [] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void rotateArrayBykStepsInplace(int k){
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        k = k % n ;

        reverse(arr, 0, n-k );
        reverse(arr, n-k , n);
        reverse(arr, 0, n);
        System.out.println("Array After Rotating By k Stesp : ");
        printArray(arr);

    }

    public static void main(String [] args){
        // swapTwoNumbers();
        // swapNumberWithoutTempVariable();
        // reverseArray();
        // reverse_Array_Wihout_Making_New_Array();

        int k = 8;
        // rotateArrayByKSteps(k);
        rotateArrayBykStepsInplace(k);
        
    }
}
