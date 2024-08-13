package Strings;

public class Palindromic_Substrings_Prob {

    public static boolean isPallindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcad";
        int count = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1; j<=str.length(); j++){
                if (isPallindrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j) + " ");
                    count++;
                }
            }
        }
        System.out.println("\nThr Number of Pallindrone Substrings Are :" + count);
    }
}
