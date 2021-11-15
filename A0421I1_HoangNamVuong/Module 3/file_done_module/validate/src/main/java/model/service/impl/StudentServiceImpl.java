package model.service.impl;

import model.bean.Student;
import model.repository.StudentRepository;
import model.repository.impl.StudentRepositoryImpl;
import model.service.StudentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentServiceImpl implements StudentService {
    StudentRepository studentRepository = new StudentRepositoryImpl();
    final String E_REGEX ="^[a-z]{3,20}@[a-z]{3,5}\\.[a-z]{3,5}$";
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public boolean save(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public Map<String, String> save1(Student student) {
        Map<String,String>map=new HashMap<>();
        boolean check=true;
        if ("".equals(student.getEmail())){
            check=false;
            map.put("emailMss","Email ko dc để trống");
        }else if (!validateEmail(student.getEmail())){
            check =false;
            map.put("emailMss","Email sai định dạng");
        }

        if (check){
            studentRepository.save(student);
        }
        return map;
    }

    @Override
    public boolean delete(int id) {
     return studentRepository.delete(id);
    }

    @Override
    public boolean update(int id, Student student) {
     return studentRepository.update(id,student);
    }

    // validate dư liệu
    public  boolean validateEmail(String email){
        return email.matches(E_REGEX);
    }

}
