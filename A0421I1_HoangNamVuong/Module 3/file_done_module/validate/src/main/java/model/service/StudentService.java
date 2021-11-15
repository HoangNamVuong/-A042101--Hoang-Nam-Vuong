package model.service;

import model.bean.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<Student> findAll();
    Student findById(int id);
    boolean save(Student student);
    // dùng và lidate
    Map<String,String> save1(Student student);
    boolean delete(int id);
    boolean update(int ind, Student student);
}
