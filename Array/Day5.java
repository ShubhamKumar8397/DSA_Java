package Array;

public class Day5 {

    static void printArray(int [] arr){
        for( int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static boolean findSubsarrayDifferenceIsX(int x) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == x) {
                    result = true;
                    System.out.println("The First pair Found : " + arr[i] + " " + arr[j]);
                    return result;
                }
            }
        }
        return result;

    }

    static void findMissingNumber() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int missing = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != missing) {
                System.out.println("Missing Number Is : " + missing);
                break;
            }
            missing++;
        }

    }

    static void sortArrayHavingOnly1s0s() {
        int[] arr = { 0, 1, 1, 1, 0, 0, 1, 0, 1 };
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < zeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sortArrayHavingOnly1s0sInOneIteration(){
        int [] arr = {0, 1, 1, 1 ,0, 0 ,1 , 1, 0};
        int left = 0;
        int right = arr.length - 1;

        while (left < right) { 
            if(arr[left] == 1 && arr[right] == 0){
                // swap both the places
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(arr[left] == 0){
                left++;
            }
            else if(arr[right] == 1){
                right --;
            }
        } 

        // now print the sorted array
    }

    static void sortArrayWithEvenFirstAndOddLater(){
        int [] arr = {1, 2, 3,4, 5, 6, 7, 8,38};
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                // swap both;
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right --;
            }

            if(arr[left] % 2 == 0){
                left++;
            }

            if(arr[right] % 2 == 1){
                right --;
            }
        }

        printArray(arr);

    }
  
    static void sortTheSquareOfTheArrayElements(){
        int [] arr = {-10, -4, -3, 1, 2, 5, 7,4, 10};
        int [] ansArr = new int[arr.length];
        int idx = 0;
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            if(Math.abs(arr[left]) >= Math.abs(arr[right])){
                System.out.println(Math.abs(arr[left]) + " " + Math.abs(arr[right]));
                ansArr[idx++] = arr[left] * arr[left];
                left++;
            }
            
            else if(Math.abs(arr[left]) <= Math.abs(arr[right])){
                ansArr[idx++] = arr[right] * arr[right];
                right--;
            }
        }

        printArray(ansArr);
    }
   
   

    
    public static void main(String[] args) {
        int x = 10;
        // System.out.println(findSubsarrayDifferenceIsX(x));
        // findMissingNumber();
        // sortArrayHavingOnly1s0s();
        // sortArrayHavingOnly1s0sInOneIteration();
        // sortArrayWithEvenFirstAndOddLater();
        // sortTheSquareOfTheArrayElements();
    }
}
