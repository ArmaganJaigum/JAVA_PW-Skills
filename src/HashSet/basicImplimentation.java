package HashSet;
import java.util.HashSet;

public class basicImplimentation {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("Hashmi");
        st.add("Babura");
        st.add("Hashmi");
        System.out.println(st);  //Hashmi, Babura
        System.out.println(st.contains("Hashmi")); // true
        System.out.println(st.size());  // 2
        st.remove("Hashmi");
        System.out.println(st);
        for (String s : st){
            System.out.println(s);  // Babura
        }
    }
}
