import java.util.Scanner;

public class Day2 { 
    // question-1 find sum of first n natural number
    static int sum(int n){
        if(n == 1) return 1;
        int ans = n + sum(n-1);
        return ans;
    }

    // Question-2 find sum of Digits of n like n = 23467 ans = 2 + 3 + 4 + 6 + 7 =
    static int sumOfDigits(int n){
        if(n >= 0 && n <= 9) return n;   //when single digit it the value
        int ans = n % 10 + sumOfDigits(n/10);
        return ans;
    }

    // Question-3 find the count of digits in the number n
    static int countDigitsOfN(int n){
        if(n >= 0 && n <= 9) return 1;
        int ans = 1 + countDigitsOfN(n/10);
        return ans;
    }

    // Question-4 given two numbers p and q , find the value of p^q using a recursive function;
    static int findPowerSolution(int p , int q){
        if(q == 0) return 1;    // because 0 power of anything is = 1;
        int ans = p * findPowerSolution(p, q - 1);
        return ans;
    }

    // Question-4 Optmized approach -- time complexity --> O(log(q))
    static int findPowerSolutionOptimized(int p , int q){   
        if(q == 0) return 1;
        int smallPow = findPowerSolutionOptimized(p, q/2);
        if(q % 2 == 0){
            return smallPow * smallPow ;
        }
        return p * smallPow * smallPow;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The VAlue of N: -");
        int n = sc.nextInt();
        // System.out.println(sum(n));
        // System.out.println(sumOfDigits(n));
        // System.out.println(countDigitsOfN(n));

        System.out.println("Enter The Value of p : ");
        int p = sc.nextInt();
        System.out.println("Enter The Value of q : ");
        int q = sc.nextInt();

        // System.out.println(findPowerSolution(p, q));
        System.out.println(findPowerSolutionOptimized(p, q));
    }
}
