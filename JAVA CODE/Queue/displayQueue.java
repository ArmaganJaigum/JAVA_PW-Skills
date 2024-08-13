package Queue;

import java.util.*;

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> helper = new ArrayDeque<>();    // to add the element in another array list
        while (q.size() > 0){
            System.out.print(q.peek() + " ");
            helper.add(q.remove());
        }
        while (helper.size()>0){
            q.add(helper.remove());
        }
    }
}
