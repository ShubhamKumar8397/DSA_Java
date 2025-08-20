
// package Recursion;

import java.util.Scanner;

public class Day1 {

    // Ques1 - Print first n natural number from 0 to n
    static void printNaturalNumber(int n){
        if(n == 1){  //base case
            System.out.println(n);
            return;
        }
        printNaturalNumber(n-1);
        System.out.println(n);
    }

    // Ques2 - Print natural number n to 1;
    static void printReverseNaturalNumber(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printReverseNaturalNumber(n-1);
    }

    // Ques3 - print factorial of n natural Number using recursion
    static int factorial(int n){
        if(n == 0) return 1;
        int ans = n * factorial(n - 1);
        return ans;
    }

    // Ques4 - print fibonacci series till n
    static int fibonacciSeries(int n){
        if(n == 0 || n == 1) return n;
        int ans = fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
        return ans; 
    }

    // ques5 - print fibonacci series by loop
    static void fibonacciSeriesByLoop(int n){
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        for(int i = 3; i <= n; i++){
            int ans = n1 + n2;
            System.out.print(ans + " ");
            n1 = n2;
            n2 = ans;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of n");
        int n = sc.nextInt();
        // printNaturalNumber(n);
        // printReverseNaturalNumber(n);
        // System.out.println(factorial(n));
        // System.out.println(fibonacciSeries(n));
        fibonacciSeriesByLoop(n);
    }
}
