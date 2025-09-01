import java.util.ArrayList;
import java.util.Scanner;

public class Day8 {

    // Question - 1 Find The Subsequences of an String in Series
    // Full Explnation - IN Recursion Notebook of DSA

    static ArrayList<String> findSubSequences(String text) {
        ArrayList<String> ans = new ArrayList<>();

        if (text.length() == 0) {
            ans.add("");
            return ans;
        }

        // Recursion / self work
        char currentChar = text.charAt(0);
        ArrayList<String> smallAns = findSubSequences(text.substring(1));
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(currentChar + ss);
        }
        return ans;

    }

    // Important - Inlcude Exclude Question
    // Question - 2 print all the subsequences of a one word string Without array
    // list
    // Full Explanation - In Recursion Notebook of DSA

    static void printSubsequences(String text, String currentAns) {
        if (text.length() == 0) {
            System.out.println(currentAns);
            return;
        }

        char currentChar = text.charAt(0);
        String remaningString = text.substring(1);
        printSubsequences(remaningString, currentAns + currentChar);
        printSubsequences(remaningString, currentAns);
    }


    // Important 
    // Question - 2) Find Subset Sum of an Array of all elements;

    static void subsetSum(int[] arr, int arrayLength, int idx, int subsetSum) {
        if(idx >= arrayLength){
            System.out.println(subsetSum);
            return;
        }

        subsetSum(arr, arrayLength, idx + 1, subsetSum + arr[idx]);
        subsetSum(arr, arrayLength, idx + 1, subsetSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question-1, 2
        System.out.println("Enter The Text :: ");
        String text = sc.next();
        // System.out.println(findSubSequences(text));
        // printSubsequences(text, "");


        // Question - 2
        int [] arr = {2, 4, 5};
        subsetSum(arr, arr.length, 0, 0);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    }
}
