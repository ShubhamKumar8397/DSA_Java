package OOPS;

import java.util.Scanner;

public class Fraction {

    static class fraction {
        int numerator;
        int denomenator;

        public fraction(int numerator, int denomenator) {
            this.numerator = numerator;
            this.denomenator = denomenator;
        }

    }


    // find the Greatest Common Divisor and divide the numerator and denominator easily with this and complete
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static fraction bestApproachTosimplify(fraction answer) {
        int divisor = gcd(answer.numerator, answer.denomenator);
        answer.numerator /= divisor;
        answer.denomenator /= divisor;
        return answer;
    }

    // my approach but very complex ;;;
    static fraction simplify(fraction answer) {
        int maxValue = Math.max(answer.numerator, answer.denomenator);
        for (int i = 2; i <= maxValue; i++) {
            if (answer.numerator % i == 0 && answer.denomenator % i == 0) {
                answer.numerator /= i;
                answer.denomenator /= i;
                maxValue = Math.max(answer.numerator, answer.denomenator);
                i = 2;
            }
        }
        return answer;

    }

    static void addFraction(fraction one, fraction two) {
        int value1 = ((one.numerator * two.denomenator) + (two.numerator * one.denomenator));
        int value2 = one.denomenator * two.denomenator;
        fraction answer = new fraction(value1, value2);
        simplify(answer);
        System.out.println(answer.numerator + "/" + answer.denomenator);
    }

    // taking input for fraction;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // double numerator = sc.nextDouble();
        // double denomenator = sc.nextDouble();

        fraction one = new fraction(4, 4);
        fraction two = new fraction(6, 4);
        addFraction(one, two);

        sc.close();
    }
}
