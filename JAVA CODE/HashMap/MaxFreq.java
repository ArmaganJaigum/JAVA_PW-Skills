package HashMap;

import java.util.*;

public class MaxFreq {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,1};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int el : arr){
            if (!freq.containsKey(el)){
                freq.put(el,1);
            } else {
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println("Frequency map");
        System.out.println(freq.entrySet());
        int  mxfreq = 0, ansKew = -1;
        for (var key : freq.keySet()){
            if (freq.get(key) > mxfreq){
                mxfreq = freq.get(key);
                ansKew = key;
            }
        }
        System.out.printf("%d has a Max Frequency and it Occurs %d Times", ansKew,mxfreq);
    }
}
