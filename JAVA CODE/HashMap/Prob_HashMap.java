package HashMap;
import java.io.InterruptedIOException;
import java.util.*;
public class Prob_HashMap {
    // Here We only write the Program For Exejugating Copy and Go to Paste  Leet Code

    // 1. Anagram Problem
    static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i);
            if (!mp.containsKey(ch)){
                mp.put(ch,i);
            } else {
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq+1);
            }
        }
        return mp;
    }
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        HashMap<Character,Integer> mp1 = makeFreqMap(s);
        HashMap<Character,Integer> mp2 = makeFreqMap(s);
        return mp1.equals(mp2);
    }

    // Problem : 2
    // Isomorphic String
    class Isomorphic{
        public boolean isIsomorphic(String s, String t){
            HashMap<Character, Character> mp = new HashMap<>();
            for (int i = 0; i < s.length(); i++){
                Character sCh = s.charAt(i);
                Character tCh = t.charAt(i);
                if (mp.containsKey(sCh)){
                    if (mp.get(sCh) != tCh) return false;
                } else if(mp.containsValue(tCh)){
                    return false;
                } else {
                    mp.put(sCh, tCh);
                }
            }
            return true;
        }
    }

    // Problem : 3
    // Two Sum

    class TwoSum{
        public int[] twoSum(int[] nums, int target){
            int n = nums.length;
            int[] ans = {-1};
            HashMap<Integer,Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++){
                int partner = target-nums[i];
                if (mp.containsKey(partner)){
                    ans = new int[] {i,mp.get(partner)};
                    return ans;
                }
                mp.put(nums[i],i);
            }
            return ans;
        }
    }

    // Problem : 4
    // Largest Subarray with 0 Sum > in GFG

    class largestSubarray{
        int zeroSumLargestSubarray(int[] arr, int n){
            HashMap<Integer, Integer> mp = new HashMap<>();
            int maxLen = 0, prefSum = 0;
            for (int i = 0; i < arr.length; i++){
                prefSum += arr[i];
                if (mp.containsKey(prefSum)){
                    maxLen = Math.max(maxLen,i-mp.get(prefSum));
                } else {
                    mp.put(prefSum,i);
                }
            }
            return maxLen;
        }
    }




    public static void main(String[] args) {

    }
}
