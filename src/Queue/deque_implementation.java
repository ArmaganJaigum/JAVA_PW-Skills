package Queue;
import java.util.*;

public class deque_implementation {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
//        dq.addLast(1);
//        dq.addLast(2);
//        dq.addLast(3);
//        dq.addLast(4);
//        System.out.println(dq);
//        dq.addFirst(5);
//        System.out.println(dq);
//        dq.removeFirst();
//        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        System.out.println(dq.getLast());
        dq.addLast(1);
        dq.addLast(1);
        dq.addLast(3);
        dq.add(4);    // last Add
        System.out.println(dq);
//        dq.remove(); // first Remove;
//        System.out.println(dq);
//        dq.removeFirstOccurrence(1);
//        System.out.println(dq);
        dq.removeLastOccurrence(1);
        System.out.println(dq);



    }
}
