package lesson05_access_modifier_static_method_static_property.exercise.access_modifier_1;

import lesson05_access_modifier_static_method_static_property.exercise.access_modifier_2.Student;

public class StudentExtendsStudent extends Student {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.setClasses("a0421i1"));;
        System.out.println(student.setName("hoang nam vuong"));;
        //System.out.println(Student.classes);
    }
}
