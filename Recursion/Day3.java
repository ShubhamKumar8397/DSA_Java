import java.util.Scanner;

public class Day3 {

    // Question - 1 Given a number num and a value k . print ke multiples of num  -- table print krna haii
    // Contraints : k > 0
    // input 1 : num = 12 , k = 5
    // ouput : 12, 24, 36, 48, 60

    static void printKMultiplesOfNum(int num, int k ){
        if(k == 1){   //basecase
            System.out.println(num + " ");
            return;
        }
        printKMultiplesOfNum(num , k-1);
        System.out.println(num * k);   //self work
    }

    // --------------------------------------------------------
    // Question -2 find Sum of first n natural number 

    static int findSumOfFirstNaturalNumber(int num){
        if(num == 0) return num;
        return num + findSumOfFirstNaturalNumber(num-1);
        
    }

    // /------------------------------------------------
    // Question - 3 Alternate Sum of number num
    // contraints : n < 10^6 or 1e6;
    // input : num = 5 
    // output : ans => 1 - 2 + 3 - 4 + 5 => 3  -- ans = 3

    //  input : num = 2
    //  output : ans => 1 -2 => -1 -- ans = -1

    static int findAlternateSum(int num){
        if(num == 0) return 0;
        if(num % 2 == 0){
            return findAlternateSum(num -1) - num;
        }else{
            return findAlternateSum(num -1 ) + num;
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of Num : ");
        int num = sc.nextInt();
        System.out.println("Enter value of K : ");
        int k = sc.nextInt();

        // printKMultiplesOfNum(num, k);
        // System.out.println(findAlternateSum(num));
        System.out.println(findSumOfFirstNaturalNumber(num));
    }
}
