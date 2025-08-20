package Array;

public class Day3{
    // make a array and the array has subarray which sum is equal to target sum

    static void sumSubarray(int x){
        int [] arr = {2, 3, 2,  4, 5, 6 ,7, 1, 7};
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i + 1 ; j < arr.length; j++){
                if(arr[i] + arr[j] == x ){
                    System.out.println("The Two index Are : " + arr[i] + " " + arr[j] + " ");
                    count++;
                }
            }
        }
        System.out.println("The Number of Array : " + count);
    }

    static void tripletSumArray(int x){
        int [] arr = { 1, 2 ,3 , 4,5, 6,2, 5};
        int count = 0;

        for(int i = 0; i < arr.length ; i++){
            for( int j = i + 1; j < arr.length ; j++){
                for(int z = j + 1; z < arr.length ; z++){
                    if(arr[i] + arr[j] + arr[z] == x){
                        System.out.println("All elements Are : " + arr[i] + " " + arr[j] + " " + arr[z]);
                        count++;
                    }
                }
            }
        }

        System.out.println("The Number of Subarray found : " + count);

    }
    
    static void findUniqueElement(){
        int [] arr = { 1, 2 ,3 , 4,5, 6,2,3, 5};
        for(int i = 0; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        System.out.print("The Unique Elements Are : ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != -1){
                System.out.print(arr[i] + " ");
            }
        }


    }
    
    static int findKthMax(){
        int [] arr = { 1, 2 ,3 , 4,5, 6,2,3, 99,  5 ,224 };
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]> mx){
                mx = arr[i];
            }

        }

        System.out.println("After find 1st Greates mx = " + mx);

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        mx = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int i = 0; i< arr.length; i++){
            if(arr[i]> mx){
                mx = arr[i];
            }

        }

        return mx;


        

    }
    
    static void findSecondSmallestNumber(){
        int [] arr = { 1, 2 ,3 , 4,5, 6, - 8  , -5 ,2,3, 5};
        int minValue = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        };

        for( int i = 0; i < arr.length; i++){
            if(arr[i] == minValue){
                arr[i] = Integer.MAX_VALUE;
            }
        }

        minValue = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];            
            }
        }

        System.out.println("The Second Minimum Value is : " + minValue );
    }
   
    static void findFirstRepeatValue(){
        int [] arr = { 1, 2 ,3 , 4};

        int ans = -1;

        for(int i = 0 ; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("The number is" + arr[i]);
                    ans = arr[i];
                    break;
                }
            }
            if(ans != -1){
                break;
            }
        }
        System.out.println("The First Repetative element : " + ans );
    }

    public static void main(String [] args){
        int x = 15;
        // sumSubarray(x);
        // tripletSumArray(x);
        // findUniqueElement();
        // System.out.println("Second Largest Number is : " + findKthMax());
        // findFirstRepeatValue();
        findSecondSmallestNumber();
    }
}
