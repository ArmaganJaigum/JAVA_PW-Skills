package Stacks;

import java.util.Stack;

public class basicOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(6);
        st.push(8);
        st.push(12);
        st.push(21);
        System.out.println(st.peek());     // peak element
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size is : " + st.size());
        while (st.size() > 2) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
