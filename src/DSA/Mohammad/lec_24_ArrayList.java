package DSA.Mohammad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;

public class lec_24_ArrayList {
    public static void main(String[] args) {

        // Wrapper classes
//        Integer in = Integer.valueOf(4);
//        System.out.println(in);
//        Float f = Float.valueOf(4.5f);
//        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();

        // 1. add new nu

        l1.add(5); // 5
        l1.add(6); // 5 6
        l1.add(8); // 5 6 8
        l1.add(10); // 5 6 8 10

        // 2. get an elements at index i

//        System.out.println(l1.get(0));

        // 3. print with for loop

//        for(int i = 0; i < l1.size(); i++){
//            System.out.print(l1.get(i) + " "); // 5, 6, 8, 10
//        }

        // 4. print the array list directlr\

//        System.out.println(l1);

        // 5. Adding elements at some index

//        l1.add(1,7);
//        System.out.println(l1);  // 5 7 6 8 10

        // 6. Modifying elements at index i

//        l1.set(1,10);
//        System.out.println(l1);  // 5 10  8 10


        // 7. Remove an elements at index i

//        l1.remove(1);
//        System.out.println(l1);  // 5 8 10

        // 8. Remove an element e

//        l1.remove(Integer.valueOf(6));
//        System.out.println(l1);  // 5 8 10

        // 9.Chaquing a element is exist

//        boolean ans = l1.contains(Integer.valueOf(10));
//        System.out.println(ans);  // true

        // If dont specify the Array type

//        ArrayList l = new ArrayList();
//        l.add("Mohammad");
//        l.add(2);
//        l.add(true);
//        System.out.println(l);

        // By Using Collection Import Method

        Collections.reverse(l1);
        System.out.println("Reverse " + l1);

        Collections.sort(l1);
        System.out.println("Assending order" + l1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Descinding Order" + l1);
    }
}
