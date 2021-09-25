package lesson17_IO_file_Binary_and_serialization.practice.demo_binary_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BinaryObjectFileDemo {
    public static void main(String[] args) {
//        writeFile("sample\\A0421I1\\sample2.dat");
//        readFile("sample\\A0421I1\\sample2.dat");

        // Write and read object not implement Serializable => write Error
//        writeFileStudent("sample\\A0421I1\\sample3.dat");
//        readFileStudent("sample\\A0421I1\\sample3.dat");

        // Write and read by element in list => write OK but read Error
//        writeFileByPerson("sample\\A0421I1\\sample4.dat");
        readFileByPerson("sample\\A0421I1\\sample4.dat");
    }

    public static void readFile(String path) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
            List<Person> personList = (List<Person>) inputStream.readObject();
            for(Person p: personList) {
                System.out.println(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String path) {
        Person p1 = new Person("P01", "Thang", 21, "Da Nang");
        Person p2 = new Person("P02", "Thang", 21, "Da Nang");
        Person p3 = new Person("P03", "Thang", 21, "Da Nang");
        Person p4 = new Person("P04", "Thang", 21, "Da Nang");
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
            outputStream.writeObject(personList);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFileByPerson(String path) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
            List<Person> personList = new ArrayList<>();
            Person p = null;
            while ((p = (Person) inputStream.readObject()) != null) {
                personList.add(p);
            }

            for(Person person: personList) {
                System.out.println(person);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writeFileByPerson(String path) {
        Person p1 = new Person("P01", "Thang", 21, "Da Nang");
        Person p2 = new Person("P02", "Thang", 21, "Da Nang");
        Person p3 = new Person("P03", "Thang", 21, "Da Nang");
        Person p4 = new Person("P04", "Thang", 21, "Da Nang");
        List<Person> personList = new ArrayList<>();
        personList.add(p1); personList.add(p2); personList.add(p3); personList.add(p4);
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
            for(Person p: personList) {
                outputStream.writeObject(p);
            }
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
