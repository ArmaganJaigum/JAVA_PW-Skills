package Stacks;

import java.util.Stack;

public class Remove_and_Reverse {

    public static void RemoveAtAnyIndex(Stack<Integer> st , int idx){
        Stack<Integer> rt = new Stack<>();
        while (st.size()>idx){
            rt.push(st.pop());
        }
        st.pop();
        while (rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
    public static void ReverseInSameStack(Stack<Integer> st){     // IitrativeLy
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0){
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> mt = new Stack<>();
        while (rt.size()>0){
            mt.push(rt.pop());
        }
        System.out.println(mt);
        while (mt.size()>0){
            st.push(mt.pop());
        }
        System.out.println(st);
    }
    public static void pushAtBottom(Stack<Integer> st, int x){
        if (st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
     // Recursively
    public static void revers(Stack<Integer> st){
        if (st.size()== 1) return;
        int top = st.pop();
        revers(st);
        pushAtBottom(st,top);
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
//        RemoveAtAnyIndex(st,2);
//        ReverseInSameStack(st);
        revers(st);
        System.out.println(st);
    }
}
