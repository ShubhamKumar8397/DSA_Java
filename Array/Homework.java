package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework {

    static void arrangeArray(int [] arr){
        // 

        int [] newArr =  new int[arr.length];

        int idx = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                newArr[idx] = arr[i];
                idx++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                newArr[idx] = arr[i];
                idx++;
            }
        }

        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }

    }

    static void getUnionOfTwoArray(){
        int [] arr_1 = {2, 2,2};
        int [] arr_2 = {2, 2, 2, 2, 2};

        int [] newArr = new int [arr_1.length + arr_2.length];
        int idx = 0;

        for(int i = 0; i < arr_1.length; i++){
            newArr[idx] = arr_1[i];
            idx++;
        }

        for(int i = 0; i < arr_2.length; i++){
            newArr[idx] = arr_2[i];
            idx++;
        }
        Arrays.sort(newArr);
        int count = 1;

        for(int i = 1 ; i < newArr.length; i++){
            if(newArr[i-1] == newArr[i]){
                continue;
            }
            count ++;
        }
        
        System.out.println(count);

    }
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The Length Of Array :");
        // int n = sc.nextInt();
        // System.out.println("Enter All The Elements of Array : ");

        // int [] arr = new int[n];
        
        // for(int i = 0; i < n ; i++){
        //     arr[i] = sc.nextInt();
        // }

        // int [] arr = {1, -1 , 3, 2, -7, -5, 11, 6};
        // System.out.println("shubham");

        // arrangeArray(arr);
        getUnionOfTwoArray();

    }
}
