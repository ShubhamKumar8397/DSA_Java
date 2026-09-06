package Binary_Search;

public class Day3 {

    // Question - 1 Binary Search on 2D array find target in 2d array array => n rows m coloum
    // Given a 2d Array having each row sorted in ascending,
    // in a way first element of next row is greater then the last element of
    // previous row;
    // This make the Matrix sorted column wise also;

    // Array => Matrix => You feel due to condition each row and each colom sorted
    //  4 7  9
    // 11 22 34
    // 60 61 62

    static Boolean findTarget(int [][] arr, int target){
        int row = arr.length;
        int coloum = arr[0].length;

        int startRow = 0;
        int startColoum = coloum - 1;
        while(startRow < row && startColoum >= 0){
            if(target == arr[startRow][startColoum]){
                return true;
            }else if(target < arr[startRow][startColoum]){
                startColoum--;
            }else{
                startRow++;
            }
        }
        return false;
    }


    // Question -2 Find Peak Element in Mountain Array 
    // Contraint => Mountain Array Must have 3 elements; find peak;

    static int findPeak(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        int answer = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] < arr[mid + 1]){
                answer = mid + 1 ;
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        // Question 1
        // int [][] arr = {{3, 4, 5}, {10, 13, 15}, {19, 20, 26}};
        // System.out.println("find Target ?");
        // System.out.println(findTarget(arr, 10));

        // Question 2
        int [] arr1 = {2,4 ,6, 8, 13 , 67,45, 3, 1};
        System.out.println(findPeak(arr1));
    }
}
