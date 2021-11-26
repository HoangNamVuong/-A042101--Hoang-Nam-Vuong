package lesson12_java_collection_framework.practice.sort_comparable_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {
        Student student1 = new Student("A", 30,"HaNoi");
        Student student2 = new Student("B", 31,"SaiGon");
        Student student3 = new Student("C", 28,"DaNang");
        Student student4 = new Student("D", 29,"GiaLai");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student.toString());
        }

        Collections.sort(list, new AgeComparator());
        System.out.println("sort for age");
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }
}
