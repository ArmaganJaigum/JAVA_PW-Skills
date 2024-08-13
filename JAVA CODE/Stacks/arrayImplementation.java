package Stacks;


public class arrayImplementation {
    public static class Stack{
        private int[] arr = new int[6];
        private int idx = 0;
        void push(int x){
            if (isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peak(){
            if(idx == 0){
                System.out.println("Stack is Empty ! ");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if (idx==0){
                System.out.println("Stack is Empty ! ");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display(){
            for (int i = 0; i <= idx-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if (idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if (idx == arr.length) return true;
            else return false;
        }
        int capacity(){         // For knoe the length of the Array
            return arr.length;
        }
    }


    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println("The peak Element is ! " + st.peak());
        st.push(7);
        st.pop();
        st.display();;
        st.push(8);
        st.display();
        System.out.println(st.size());

    }
}