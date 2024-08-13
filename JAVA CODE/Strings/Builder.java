package Strings;

public class Builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
//        System.out.println(str);
//         // hello -> mello;
//        str.setCharAt(0,'m');
//        System.out.println(str);
//        str.append(" world");
//        System.out.println(str);
//        str.insert(0,'m');
//        System.out.println(str);
//        str.deleteCharAt(0);
//        System.out.println(str);
//        str.reverse();
//        System.out.println(str);
        str.delete(3,9);
        System.out.println(str);
    }
}