package Recursion;

public class lec_36_Recursion {

    static int bestForFrigJump(int[] h, int n, int idx) {
        if (idx == n - 1) return 0;
        int opt1 = bestForFrigJump(h, n, idx + 1) + Math.abs(h[idx + 1] - h[idx]);
        if (idx == n - 2) return opt1;
        int opt2 = bestForFrigJump(h, n, idx + 2) + Math.abs(h[idx + 2] - h[idx]);
        return Math.min(opt1, opt2);

    }

    static void keypadCombination(String dig, String [] kp, String res){
        if (dig.length() == 0){
            System.out.print(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';  // 2
        String currChoice = kp[currNum];  // "abc"
        for(int i = 0; i < currChoice.length(); i++){  //"abc"
            keypadCombination(dig.substring(1), kp, res + currChoice.charAt(i));
        }
    }

    public static void main(String[] args) {
//        int[] h = {10, 30, 20, 40};
//        System.out.println(bestForFrigJump(h, h.length, 0));
        String s = "253";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl" , "mno" , "pqrs", "tuv", "wxyz"};
        keypadCombination(s,kp,"");
    }
}