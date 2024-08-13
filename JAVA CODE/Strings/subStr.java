package Strings;

public class subStr {
    public static void main(String[] args) {
//        String str = "abcd";
////        System.out.println(str.substring(0,3));
//        System.out.println(str.substring(2));

//       * MCQUES : What Will be output of the following Code

//        String str = "physics";
//        for(int j = 2; j < 4 ; j++){
//            System.out.print(str.substring(j));
//        }
//        * Given A String S print all the substring of s
        String str = "abcd";
        for(int i=0;i<=3;i++){
            for (int j=i+1;j<=4;j++){
                System.out.print(str.substring(i,j) + " ");
            }
        }
    }
}
