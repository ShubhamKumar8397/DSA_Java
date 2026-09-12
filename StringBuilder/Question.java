package StringBuilder;
import java.util.*;


public class Question {
    // Question-1 
    // toggle uppercase to lowercase and vise versa 
    // example => input => ShuBHam => sHUbhAM

    static String toggleFunction(String inputString){
        StringBuilder sb = new StringBuilder(inputString);

        for(int i = 0 ; i < sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch == ' '){
                continue;
            }
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <=57){
                continue;
            }
            Boolean flag = true;
            if(ascii >= 97){
                flag = false;
            }

            if(flag){
                ascii += 32;
                ch = (char) ascii;
                sb.setCharAt(i, ch);
            }else{
                ascii -= 32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            }
        }

        return sb.toString();
    }
    public static void main( String [] args){
        String s = "Sh2525uBH 25am343";
        System.out.println(toggleFunction(s));
    }
}
