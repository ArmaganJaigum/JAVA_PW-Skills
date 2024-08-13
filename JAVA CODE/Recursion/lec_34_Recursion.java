package Recursion;

import java.util.Scanner;

public class lec_34_Recursion {
    static String removeA(String s, int idx){
        if (idx == s.length()) return " ";
        String smallAns = removeA(s,idx + 1);
        char currChar = s.charAt(idx);
        if (currChar != 'a'){
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    static String reverse(String s, int idx){
        if (idx == s.length()) return "";
        String smallAns = reverse(s, idx + 1);
        return smallAns + s.charAt(idx);
    }

    static boolean isPalindrone(String s, int l, int r){ //Method 2
        if (l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && isPalindrone(s, l+1 , r-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        String rev = reverse(s,0);
//        if (rev.equals(s)){
//            System.out.printf("%s is Palindrome" , s);   //  1st method
//        } else {
//            System.out.printf("%s is Not Palindrome" , s);
//        }
        System.out.println(isPalindrone(s,0,s.length()-1));   // Method 2

    }
}
