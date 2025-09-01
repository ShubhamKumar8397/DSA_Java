import java.util.ArrayList;
import java.util.Scanner;

public class Day6 {

    // Question - 1 => Given an array of n integers and a target value x . 
    // print x Exists in the array or not if true -> print yes

    static boolean findXInArray(int [] arr, int idx, int x){
        if(arr[idx] == x){
            return true;
        }
                                   
        if(idx == arr.length -1){
            return false;
        }

        return findXInArray(arr, idx + 1, x);
    }

    // Question -2 => Find the first index of Element x if Available,  return -1 if not available ;

    static int findIndexOfIntegerXInArray(int [] arr, int idx, int x){
        if(arr[idx] == x){
            return idx;
        }

        if(idx == arr.length -1){
            return -1;
        }

        return findIndexOfIntegerXInArray(arr, idx + 1, x);
    }


    // Question -3 => Given an array size of N and an integer X , 
    // the task is to find all the indices of the integer x in the array

    // Input: arr= {1, 2, 3, ,4, ,6, 4, 4, 9, 4}
    // Output : 3, 5, 6, 8;

    static void findAllIndicesOfX(int [] arr, int idx, int x){
        if(idx == arr.length){
            return;
        }

        if(arr[idx] == x){
            System.out.println(idx);
        }
        findAllIndicesOfX(arr, idx + 1, x);
    }

    // Question - 4 => Return a Array List of All Indices of interger x;

    static ArrayList<Integer> allIndicies(int [] arr, int idx, int x){
        if(idx >= arr.length){
            return new ArrayList<Integer>();  //return empty arraylist
        }
        ArrayList<Integer> ans = new ArrayList<>();
        // self work
        if(arr[idx] == x){
            ans.add(idx);
        }

        ArrayList<Integer> smallAns = allIndicies(arr, idx + 1, x);
        System.out.println(smallAns);
        ans.addAll(smallAns);
        return ans;

    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {1, 2,3 , 5, 6, 7, 8, 10};
        System.out.println("Enter Value of X");
        int x = sc.nextInt();

        // Question - 1
        // if(findXInArray(arr, 0, x)){
        //     System.out.println("YES");
        // }else{
        //     System.out.println("NO");
        // }

        // Question -2 
        // System.out.println(findIndexOfIntegerXInArray(arr, 0, x));

        // // Question - 3
        // int [] arr2 = {1, 2, 3, 4, 6, 4, 4, 9, 4};
        // findAllIndicesOfX(arr2, 0, x);


        // Question - 4
        int [] arr4 = { 1, 2, 3, 3, 3, 3,5, 5,3, 2,3,7};
        System.out.println(allIndicies(arr4, 0, x));

        // 
        

    }
}
