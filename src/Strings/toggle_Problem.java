package Strings;
import java.util.*;
public class toggle_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        // toggle
        // PHysics -> phYSICS
        for(int i =0;i<str.length();i++){
            // check > alphabet > small, capital
            boolean flag = true; // true > capital
            char ch = str.charAt(i); //A
            if(ch == ' ') continue;  // if any speace available
            int asci = (int)ch; // 65
            if(asci>=97) flag = false; // small
            if(flag==true){ // Capital
                asci += 32;
                char dh = (char)asci; // a
                str.setCharAt(i,dh);
            }
            else { // small
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }

}
