package Strings;

public class equals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");  // this is store in different memory so s1 and s3 are not same in String
//        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}
