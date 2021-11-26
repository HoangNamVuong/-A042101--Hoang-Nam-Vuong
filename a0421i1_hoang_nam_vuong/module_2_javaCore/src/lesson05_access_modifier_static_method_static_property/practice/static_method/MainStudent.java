package lesson05_access_modifier_static_method_static_property.practice.static_method;

public class MainStudent {
    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(1,"A");
        Student student2 = new Student(2,"B");

        student1.display();
        student2.display();
    }
}
