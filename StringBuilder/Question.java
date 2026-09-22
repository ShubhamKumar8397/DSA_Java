package StringBuilder;

import java.util.*;

public class Question {
    // Question-1
    // toggle uppercase to lowercase and vise versa
    // example => input => ShuBHam => sHUbhAM

    static String toggleFunction(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == ' ') {
                continue;
            }
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                continue;
            }
            Boolean flag = true;
            if (ascii >= 97) {
                flag = false;
            }

            if (flag) {
                ascii += 32;
                ch = (char) ascii;
                sb.setCharAt(i, ch);
            } else {
                ascii -= 32;
                ch = (char) ascii;
                sb.setCharAt(i, ch);
            }
        }

        return sb.toString();
    }

    // Question - 2
    // Find The number of Palindrome Substring in a string
    // abc => a, ab, abc, b , bc, c => single substring is a palindrome =. output -
    // 3

    static int findNumberofPalindromeSubstring(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i + 1; j <= sb.length(); j++) {
                String subString = sb.substring(i, j);

                int start = 0, end = subString.length() - 1;
                Boolean flag = true;
                while (start < end) {

                    if (subString.charAt(start) != (subString.charAt(end))) {
                        flag = false;
                        break;
                    }
                    start++;
                    end--;
                }
                if (flag) {
                    // System.out.println();
                    // System.out.println(subString);
                    count++;
                }
            }
        }
        return count;
    }

    // Question - 3
    // Java Program to Reverse The Words in a sentence
    // input => i am an educator
    // output => i ma na rotacude

    static void reverseWord(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    static StringBuilder reverseWordInSentence(String inputSentence) {
        StringBuilder sb = new StringBuilder(inputSentence);
        System.out.println(sb);
        int start = 0;
        int end = 0;
        while (end < sb.length()) {
            if (sb.charAt(end) == ' ') {
                reverseWord(sb, start, end - 1);
                start = end + 1;
            }
            end++;
        }
        reverseWord(sb, start, end - 1); // no space at last so last word not print at all
        System.out.println(sb);
        return sb;
    }

    // Question - 4 Compression of String
    // input = abbbcccdefff
    // output = ab3c3def3

    // my code logic ohk but writing wrong , well managed code can be written for this 
    static StringBuilder compressString(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        StringBuilder answer = new StringBuilder("");
        int count = 1;
        char backChar = sb.charAt(0);
        for (int i = 1; i < sb.length(); i++) {
            backChar = sb.charAt(i - 1);
            if (sb.charAt(i) == backChar) {
                count = count + 1;
                continue;
            }
            if (count == 1) {
                answer.append(backChar);
            } else {
                answer.append(backChar);
                answer.append(count);
            }

            backChar = sb.charAt(i);
            count = 1;
        }
        if (count == 1) {
            answer.append(backChar);
        } else {
            answer.append(backChar);
            answer.append(count);
        }

        return answer;
    }

    static String compressStringProperCode(String inpuString){
        String answerString = "" + inpuString.charAt(0);
        int count = 1;
        for(int i = 1; i < inpuString.length(); i++){
            char previousChar = inpuString.charAt( i -1);
            char presentChar = inpuString.charAt(i);

            if(presentChar == previousChar){
                count++;
            }else{
                if(count > 1) answerString += count;
                answerString += presentChar;
                count = 1;
            }
        }
        if(count > 1 ) answerString += count;
        return answerString;
    }
    
    public static void main(String[] args) {
        // String s = "Sh2525uBH 25am343";
        // System.out.println(toggleFunction(s));

        // String inputString = "abcba";
        // System.out.println(findNumberofPalindromeSubstring(inputString));

        // String inputSentence = "My name is Rohan";
        // System.out.println(reverseWordInSentence(inputSentence));

        // System.out.println(compressString("a"));

        System.out.println(compressStringProperCode("aaabbbcdeffffg"));
    }
}
