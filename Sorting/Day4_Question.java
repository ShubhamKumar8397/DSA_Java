package Sorting;

public class Day4_Question {

    // Question - 1 - Sort an Array with numbers 0 and natural number
    // Sort in order all zeroes are at end and non zero number allign first with
    // with no change in the non zero elements

    // input = {0,7,4, 0,2, 0,8,6,3};
    // output = {7,4,2,8,6,3,0,0,0};

    // done by bubble sort - stable algorithm

    static void sortZeroesInEnd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    // Question - 2 => Arrange an array of fruits into lexicographical order using
    // the selection sort
    // lexicographical order is also known as the dictonary order arrangement

    // Input : ["papaya", "lime", "watermelon", "apple", "mango", "kiwi"];
    // output: ["apple", "kiwi", "lime", "mango", "papaya", "watermelon"];

    // input : ["shivam", "shubham", "satyam", "shiv"];
    // output : ["satyam", "shiv", "shivam", "shubham"]

    // Important
    // hint : to Compare a String there is inbuilt method to find 
    //  in two string which one is greator

        // example : 
        // String s1 = "shubham";
        // String s2 = "shiv";
        // s1.compareTo(s2);
        // if s1 greater then return  value > 0;
        // if s1 is not greater return value < 0;

    
    static void sortStringArray(String [] fruitsArray){
        for(int i = 0; i < fruitsArray.length; i++){
            int minIdx  = i;
            for(int j = i; j < fruitsArray.length - 1; j++){
                if(fruitsArray[j+1].compareTo(fruitsArray[minIdx]) < 0){
                    minIdx = j + 1;
                }
            }

            String temp = fruitsArray[i];
            fruitsArray[i] = fruitsArray[minIdx];
            fruitsArray[minIdx] = temp;

        }
    }
                

    public static void main(String[] args) {

        // Question - 1
        int[] arr = { 0, 7, 4, 0, 2, 0, 8, 6, 3 };
        sortZeroesInEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }


        // Question - 2
        String [] fruitsArray = {"shivam", "shubham", "satyam", "shiv"};
        sortStringArray(fruitsArray);
        for(String fruit : fruitsArray){
            System.out.print(fruit + " ");
        }
    }

}
