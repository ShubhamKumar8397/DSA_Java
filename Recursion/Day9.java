
// Lecture 36 Recursion of DSA IMporatant lecture

class Day9{

    // Explanation is in the notebook of DSA
    // Question - 1 => FROG Jump Problem of recursion

    static int findBest(int[] height, int n, int idx){
        if(idx == n-1) return 0;

        int option1 = Math.abs(height[idx] - height[idx + 1]) + findBest(height, n, idx + 1);
        if(idx == n-2) return option1;
        int option2 = Math.abs(height[idx] - height[idx + 2]) + findBest(height, n, idx + 2);

        return Math.min(option1, option2);
    }

    // Question -2 => Keypad Combination
    static void combination(String dig, String [] kp, String res){
        if(dig.length() == 0){
            System.out.print(res + " ");
            return;
        }

        // change the character into integer by subtracting character "0";
        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];
        for(int i = 0; i< currChoices.length();i++){
            combination(dig.substring(1), kp, res + currChoices.charAt(i));
        }
    }

    public static void main(String[] args){
        int [] height = {10, 30, 40, 20};
        System.out.println(findBest(height, height.length, 0));


        // Question -2 => Keypad Questions
        String dig = "253";
        String []keypad = {"", "", "abc","def","ghi","mno","pqrs", "tuv", "wxyz"};   
        combination(dig, keypad, ""); 
    }
}