//class Student{
//    int RollNu;
//    String name;
//}
//public class Person{
//
//    public static void main(String[] args) {
//        Student obj1 = new Student();
//        Student obj2 = new Student();
//
//        obj1.RollNu = 100;
//        obj1.name = "Mohammad";
//
//
//        obj2.RollNu = 200;
//        obj2.name = "Armagan";
//        System.out.println(obj1.RollNu + " " + obj1.name);
//        System.out.println(obj2.RollNu + " " + obj2.name);
//    }
//}
import java.util.Scanner;

class Student{
    int RollNu;
    String name;
}
public class Person{

    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();

        obj1.RollNu = 100;
        obj1.name = "Mohammad";


        obj2.RollNu = 200;
        obj2.name = "Armagan";
        System.out.println(obj1.RollNu + " " + obj1.name);
        System.out.println(obj2.RollNu + " " + obj2.name);
    }
}