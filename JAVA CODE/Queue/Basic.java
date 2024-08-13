package Queue;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        System.out.println(q);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
