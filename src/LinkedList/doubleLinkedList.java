package LinkedList;

public class doubleLinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void dispRev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node Random){
        Node temp = Random;
        while (temp.prev!=null){
            temp = temp.prev;
        }
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAttail(Node head, int x){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev=temp;
    }
    public static void insertAtidx(Node head, int idx, int x){
        Node s = head;
        for (int i = 1; i <= idx-1; i++){
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        t.prev= s;
        t.next = r;
        r.prev = t;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(9);
        Node c = new Node(45);
        Node d = new Node(8);
        Node e = new Node(1);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
//        dispRev(e);
//        display2(e);
//        Node newHead = insertAtHead(a, 35);
//        display(newHead);
//        insertAttail(a,80);
//        display(a);
        insertAtidx(a,3,12);
        display(a);

    }
}