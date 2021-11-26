package lesson12_java_collection_framework.practice.comparison_hashMap_hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "Ha noi");
        Student student2 = new Student("Hung", 22, "Da nang");
        Student student3 = new Student("Ha", 21, "Saia gon");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for (Map.Entry<Integer,Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("Use set");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);

        for (Student student : studentSet) {
            System.out.println(student.toString());
        }
    }
}
