import java.util.Scanner;

public class Day7 {

    /*
     * Question - 1 => Remove all occurrences of 'a' from string s = 'abcax' by
     * recursion
     * 
     * Note -> by This code we can remove a from a line of String or from a text2
     * knowledge -> nextLine - for Complete Line Input
     * 2) sc.next() -> for just one word input
     * 3) text.length() -> this is method not property
     * 4) s.substring(startingIndex, EndIndex) -> from which index to which index u
     * need substring
     * IMP => Concatination of String has Time Complexity -> O(n) thats not a
     * constant operation
     * n is the length of String
     * 
     */

    static String removeAllA(String text, int idx) {
        if (idx >= text.length()) {
            return "";
        }

        String smallAns = removeAllA(text, idx + 1);
        if (text.charAt(idx) != 'a') {
            return text.charAt(idx) + smallAns;
        }
        return smallAns;
    }

    // Question - 2 => Do The Question No - 1 Without idx;
    // By Substring => text.substring(startIndex) => it prints values from
    // startIndex to text.length();

    static String removeAllaApproach2(String text) {
        if (text.length() == 0) {
            return "";
        }
        // index is start from 0 -> so 1 refers to next character of a String
        String smallAns = removeAllaApproach2(text.substring(1));
        if (text.charAt(0) != 'a') {
            return text.charAt(0) + smallAns;
        }
        return smallAns;
    }

    // Question -3 => Print the reverse of A String;
     static String printReverseOfAnString(String text){
        if(text.length() == 0 ){
            return "" ;
        }
        String smallAns = printReverseOfAnString(text.substring(1));
        return smallAns + text.charAt(0);
     }

    // Question - 4 => Check Whether a Number is Palindrome or not
    static boolean isStringPalindrome(String text, int left, int right){
        System.out.println("Function Run....");
        if(left >= right){
            return true;
        }
        if(text.charAt(left) == text.charAt(right)){
            return isStringPalindrome(text, left + 1, right - 1);
        }
        return false;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Text Here :");
        String text = sc.next();
        // Question - 1, 2, 3, 4

        System.out.println(removeAllA(text, 0));
        System.out.println(removeAllaApproach2(text));
        System.out.println(printReverseOfAnString(text));
        if(isStringPalindrome(text, 0, text.length() - 1)){
            System.out.printf("%s Is Palindrome", text);
        }else{
            System.out.printf("%s Is Not Palindrome ", text);
        }
    }

}
