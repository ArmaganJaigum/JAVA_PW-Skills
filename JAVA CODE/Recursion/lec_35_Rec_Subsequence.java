package Recursion;

import java.util.ArrayList;


public class lec_35_Rec_Subsequence {

    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if (s.length() == 0){
            ans.add(" ");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        for (String ss : smallAns){      // create a new ss varible to store all small value in that variable
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }

    // 2nd Method

    static void printSSQ(String s, String currAns){
        if (s.length() == 0 ){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString,currAns + curr);
        printSSQ(remString,currAns);
    }

    static void sumSubset(int[] a, int n, int idx, int sum){
        if (idx >= n){
            System.out.println(sum);
            return;
        }
        sumSubset(a,n,idx +1,sum);
        sumSubset(a,n,idx + 1,sum + a[idx]);
    }
    public static void main(String[] args) {
//        ArrayList<String> ans = getSSQ("abc");       // 1st Method
//        for (String ss : ans){
//            System.out.print(ss);   // for each
//        }
//        System.out.println(ans); // aother type
//        printSSQ("abc","");    //2nd Method

        int[] a = {2, 3, 4};
        sumSubset(a,a.length,0,0);

    }
}