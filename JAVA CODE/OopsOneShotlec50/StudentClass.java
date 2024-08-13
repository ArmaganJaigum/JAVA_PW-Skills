package OopsOneShotlec50;

public class StudentClass {

    public static class Student{
        String name;
        int rln;
        double percent;
    }

    public static void main(String[] args) {
        Student x = new Student();
        Student y = new Student();
        x.name = "Mohammad";
        x.rln = 23;
        x.percent = 25.9;
        y.name = "Armagan Jaigum";
        System.out.println(x.name + " " + y.name);
    }
}
