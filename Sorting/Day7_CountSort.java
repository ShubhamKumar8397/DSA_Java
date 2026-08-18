package Sorting;

public class Day7_CountSort {

    static void printArray(int [] arr){
        for(int ss : arr){
            System.out.print(ss + " ");
        }
        System.out.println();
    }

    // basic countsort code
    static void basicCountSort(int [] arr){
        // first of all find the max value in array to make frequency array
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }

        // make frequency array
        // why max + 1 becaue , if max value is 5 then array length 5 but
        //  index 4, so frequency array not form proper
        int [] frequencyArray = new int[max + 1];
        for(int i = 0; i < arr.length; i++){
            frequencyArray[arr[i]]++;
        }
        // print frequency array
        printArray(frequencyArray);

        // then sort the array by help of frequency array
        int k = 0;
        for(int i = 0; i < frequencyArray.length; i++){
            for(int j = 0; j < frequencyArray[i]; j++){
                arr[k++] = i;
            }
        }

        // print sorted array
        System.out.println("Sorted Array is : ");
        printArray(arr);
    }
  
    // countSort Actual Implementation :-
    // this makes The algorithm , stable sorting 

    static void countSort(int [] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }

        // make frequency array
        // why max + 1 becaue , if max value is 5 then array length 5 but
        //  index 4, so frequency array not form proper
        int [] frequencyArray = new int[max + 1];
        for(int i = 0; i < arr.length; i++){
            frequencyArray[arr[i]]++;
        }
        // print frequency array
        printArray(frequencyArray);

        // make prefix array of frequencyArray
        for(int i = 1; i < frequencyArray.length; i++){
            frequencyArray[i] += frequencyArray[i-1];
        }
        System.out.println("Prefix Sum Frequency Array :-");
        printArray(frequencyArray);

        // put the elements in right place 
        int [] outputArr = new int[arr.length];
        for(int i = arr.length -1 ; i >= 0; i--){
            int postitionOfElement = frequencyArray[arr[i]];
            outputArr[postitionOfElement - 1] = arr[i];
            frequencyArray[arr[i]]--;
        }

        System.out.println("sorted Array After Operations ");
        printArray(outputArr);
    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,2,9,3,6};
        printArray(arr);
        // basicCountSort(arr);
        countSort(arr);

    }
}
