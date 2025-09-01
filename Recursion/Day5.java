

public class Day5 {
    // Question -1 => Print All Array elements by Recursion
    static void printArrayElements(int [] arr, int idx){
        if(idx == arr.length){
            return;
        }
        // self work
        System.out.println(arr[idx]);

        // recursive work
        printArrayElements(arr, idx+1);
    }

    // Question -2 => Find the Sum of elements of array 
    static int printSumOfArray(int [] arr, int idx){
        if(idx == arr.length -1){
            return arr[idx];
        }
        int ans = arr[idx] + printSumOfArray(arr, idx + 1);
        return ans;
    }

    // Question - 3 => Find The maximum value of Array
    // My Approach
    static int findMaximumValueInArray(int [] arr, int idx, int max){
        // hault condition
        if(arr.length == idx){
            return max;
        }
        // self work
        if(arr[idx] > max){
            max = arr[idx];
        }
        
        // recursive work
        return findMaximumValueInArray(arr, idx + 1, max);
    }


    // Teacher approach For Question number - 3
    static int findMaximumValueInArrayByTeacherApproach(int [] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int smallAns = findMaximumValueInArrayByTeacherApproach(arr, idx + 1);
        return Math.max(arr[idx], smallAns);
    }


    public static void main(String [] args){
         int [] arr = {1, 2, 3, 7, 2, 9, 10, 11, 8, 0};
        // printArrayElements(arr, 0);
        // System.out.println(printSumOfArray(arr, 0));
        int max = arr[0];
        System.out.println(findMaximumValueInArray(arr, 0, max ));
        System.out.println(findMaximumValueInArrayByTeacherApproach(arr, 0));
    }
}
