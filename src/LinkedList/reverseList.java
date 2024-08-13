package LinkedList;

public class reverseList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node reverse(Node head){
        if(head.next==null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void displayRev(Node head) {
        if (head == null) return;
        displayRev(head.next);
        System.out.print(head.val + " ");
    }

        public static void display(Node head){
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.val+" ");
        display(head.next);

    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(9);
        Node e = new Node(0);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next =e ;
        e.next = null;
        display(a);
        displayRev(a);
//        a = reverse(a);
//        display(a);
    }
}
