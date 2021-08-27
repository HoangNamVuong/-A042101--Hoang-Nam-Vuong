package lesson05_access_modifier_static_method_static_property.practice.static_method;

public class Student {
    private int numberList;
    private String name;
    private static String college = "DUT";

    Student(int nu, String na) {
        numberList = nu;
        name = na;
    }

    static void change() {
        college = "CODE GYM";
    }
    void display() {
        System.out.println(numberList + " " + name + " " + college);
    }
}
