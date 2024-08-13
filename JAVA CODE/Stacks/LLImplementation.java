package Stacks;

public class LLImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if (head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek(){
            if (head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        void displayRec(Node h){    // By using Recursion
            if (h==null)return;
            displayRec(h.next);
            System.out.print(h.val+ " ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        void displayRev(){   // For reverse order Print
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){    // Geeter
            return size;
        }
        boolean isEmpty(){
            if (size==0) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        System.out.println(st.isEmpty());
        st.push(2);
        st.display();
        st.push(3);
        st.display();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        System.out.println("The peak Element is ! " + st.peek());
        st.push(7);
        st.display();
        st.push(8);
        st.pop();
        System.out.println(st.size());
    }
}
