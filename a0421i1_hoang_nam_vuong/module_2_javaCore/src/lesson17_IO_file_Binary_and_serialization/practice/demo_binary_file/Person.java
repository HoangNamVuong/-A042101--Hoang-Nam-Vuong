package lesson17_IO_file_Binary_and_serialization.practice.demo_binary_file;

import java.io.Serializable;

public class Person implements Serializable {
    private final static long serialVersionUID = 1L;
    public String id;
    public String name;
    public int age;
    public String address;
    public String note;

    public Person(){}

    public Person(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
