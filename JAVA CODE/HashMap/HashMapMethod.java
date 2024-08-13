package HashMap;
import java.util.*;
public class HashMapMethod {
    static void allHashMapsmethod(){
        // Syntax
        Map<String , Integer> mp = new HashMap<>();
        // Adding elements
        mp.put("Akash" , 21);
        mp.put("Rahul" , 20);
        mp.put("Babul" , 23);
        mp.put("Hashmi" , 21);
        // Getting value
        System.out.println(mp.get("Akash"));  // 21
        System.out.println(mp.get("Mohammad"));  //Null
        //Changing / update value
        mp.put("Akash",13);
        System.out.println(mp.get("Akash")); //13
        // Remove a pair From the hashmap
        System.out.println(mp.remove("Akash")); // 13
        System.out.println(mp.remove("riya")); // null because Riya is not present in the list
        // Checking if a key is in the hashmap
        System.out.println(mp.containsKey("Akash")); // false > because we remove the akash
        System.out.println(mp.containsKey("Hashmi")); // true
        // aDDING A NEW eNTRY If that key not present in the list
        mp.putIfAbsent("Armagan",20); // Will Enter
        mp.putIfAbsent("hashmi" , 20); // will not enter
        // Get all the key in the HASHMAP
        System.out.println(mp.keySet());
        // Get all values in the Hashma
        System.out.println(mp.values());
        // Get al the Enteriez in the Hashma
        System.out.println(mp.entrySet());
        // Traversing all entries of Hashmap > Multiple Methods
        //Method 1
        for (String key : mp.keySet()){
            System.out.printf("Age of %s is %d \n", key,mp.get(key));
        }
        //Method 2
        System.out.println();
        for (Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d \n", e.getKey(),e.getValue());
        }
        //Method 3

        System.out.println();
        for (var e : mp.entrySet()){
            System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());
        }

    }
    public static void main(String[] args) {
        allHashMapsmethod();

    }
}
