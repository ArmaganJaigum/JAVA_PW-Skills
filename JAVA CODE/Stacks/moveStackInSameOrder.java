package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {     // Reverse
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
//        System.out.println("Enter the Number of Elements");
//        int n = sc.nextInt();
//        System.out.println("Enter " + n + " Elements : ");
//        for (int i = 1;i<=n;i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
        st.push(2);
        st.push(5);
        st.push(9);
        st.push(45);
        st.push(3);
        System.out.println(st);
        // for Reverse the stack
        Stack<Integer> rt = new Stack<>();
        while (st.size()>0){
//            int x = st.peek();
            rt.push(st.pop());   // 2nd method
//            st.pop();
        }
        // for copy a stack
        Stack<Integer> mt = new Stack<>();
        while (rt.size()>0){
            mt.push(rt.pop());
        }
        System.out.println(mt);
    }
}
