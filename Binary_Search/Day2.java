package Binary_Search;

public class Day2 {

    // Question 1 => Rotated Sorted Array Present , k Times rotated 
    // Find The pivot Index or Find The Minimum Element in The array

    static int findMinimum(int [] arr){
        int n = arr.length;
        int start = 0;
        int end = arr.length -1 ;
        int answer = -1;
        while (start <= end){
            int mid = (start + end )/2;

            if(arr[mid] > arr[n-1]){
                // we present in right side of pivot
                start = mid + 1;
            }else{
                answer = mid;
                end = mid -1;
            }
        }
        return answer;
    }

    // Question 2
    // Find The target Element in rotated Sorted Array return true or false
    // no duplicacy of elements

    static Boolean findTarget(int [] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                
                return true;
            }else if(arr[start] < arr[mid]){
                if(target < arr[mid] && target >= arr[start]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid] && target <= arr[end] ){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
            
        }
        return false;
    }

    // Question-3 - Find The target
    // Same As Above , Rotated sorted array but with duplicate elements , sorted mentioned
    // example => arr = {1, 1, 1, 1, 1, 1, 2 , 3, 1 , 1} 
    // no first occuring , just tell its present or not 
    // explanation in ipad 

    static Boolean findTargetInDublicacy(int [] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return true;
            } else if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
            } else if(arr[start] < arr[mid]){
                if(arr[start] <= target && target < arr[mid] ){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                
                if(arr[mid] < target && arr[end] >= target){
                    start = mid + 1;
                }else {
                    end = mid -1;
                }
            }
        }
        return false;


    }


    public static void main(String [] args){
        
        int [] arr1 = {5,9,10,13, 17, 22,2, 3};

        // Question 1
        System.out.println("Minimum Index");
        System.out.println(findMinimum(arr1));

        // Question 2
        System.out.println("Is Element Present?");
        System.out.println(findTarget(arr1, 3));

        // Question 3
        int [] arr2 = {1, 1, 1, 1, 1, 1,1, 1, 2 , 3, 1 , 1} ;
        System.out.println("Is Element Present?");
        System.out.println(findTargetInDublicacy(arr2, 2));
    }

    
}
