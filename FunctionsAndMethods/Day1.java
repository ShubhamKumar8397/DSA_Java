package FunctionsAndMethods;

import java.util.Scanner;

class Algebra{
    int a ;
    int b;

    Algebra(int x , int y){
        System.out.println("constructor call");
        a = x;
        b = y;
    }

    int add(){
        int ans = a + b;
        return ans;
    }
}

public class Day1{
    public static void main(String[] args){
        Algebra obj = new Algebra(4,8);
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();

        System.out.println("Sum Of Two Integers");
        int result = obj.add();
        System.out.println("Sum of Numbers is " + result);
    }
}