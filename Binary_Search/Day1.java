package Binary_Search;

public class Day1 {

    // Question 1 - Find The Index of first occurence of given element x in a sorted array,
    //  if no occurence return -1

    static int findOccurence(int [] arr, int target){
        int startIndex = 0;
        int endIndex = arr.length -1;
        int answerIndex = -1;
        while(startIndex <= endIndex){

            int midIndex = startIndex + (endIndex - startIndex)/2;

            if(arr[midIndex] == target){
                answerIndex = midIndex;
                endIndex = midIndex - 1;    // find out the first occurence

            } else if (arr[midIndex] > target){
                endIndex = midIndex -1 ;

            } else {
                // if arr[midIndex] < target;
                startIndex = midIndex + 1;
            }
        }
        return answerIndex;
    }



    // Question 2 - a number given , it can be a perfect square or not of any interger x , 
    //  you have to find out square root of the number to the nearest Interger By binary Search

    // input 4 => output 2         input 11 => output 3     input 27 => output 5

    static int findSquareRoot(int inputInterger){

        int start = 0;
        int end = inputInterger;
        int answerInterger = -1;

        while ( start <= end) {
            int mid = start + (end - start)/2;
            int value = mid * mid;
    
            if(value == inputInterger){
                return mid;
            } else if (value < inputInterger){
                answerInterger = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return answerInterger;
    }

    public static void main(String [] args){
        int [] arr = {3,5,5,5, 7, 11, 14, 17, 31,31, 53,58,58};
        int [] newArr = new int[5];
        int target = 25;
        // findOccurence(arr, target);
        // System.out.println(findOccurence(arr, target));

       System.out.println(findSquareRoot(target));

        
    }
    
}
