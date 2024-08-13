package Stacks;

import java.util.Stack;

public class displayStacks {
    public static void dispRevrecursion(Stack<Integer> st){    // By using Recursion
        if (st.size() == 0) return;
        int top = st.pop();
        System.out.print(top + " ");
        dispRevrecursion(st);
        st.push(top);
    }
    public static void dispRecur(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        dispRecur(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        dispRevrecursion(st);
        System.out.println();
        dispRecur(st);
    }
}
