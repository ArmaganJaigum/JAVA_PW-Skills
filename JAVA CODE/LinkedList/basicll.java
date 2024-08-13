package LinkedList;

import org.w3c.dom.Node;

public class basicll {
    public static void displayreverse(Node head){
        if(head == null) return;
        displayreverse(head.next);
        System.out.print(head.data+" ");
    }
    public static int length(Node head){    // to know the length
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
//        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(19);
//        a.next = b;
//        System.out.println(a);
//        System.out.println(a.next);
//        System.out.println(b);
//        System.out.println(c);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
//        System.out.println(a.next.next.data);   // by adding next next we also get the data
//
//        Node temp = a;
//        while (temp!=null){
//            System.out.print(temp.data+ " ");
//            temp = temp.next;
//        }
//        displayreverse(a);




    }
}
