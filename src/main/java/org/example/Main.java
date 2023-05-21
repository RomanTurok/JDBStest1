package org.example;

import org.example.domain.Student;
import org.example.repository.StudentMySqlRepository;
import org.example.repository.StudentRepository;

import java.util.List;
import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {
       StudentRepository studentRepository = new StudentMySqlRepository();

        System.out.println(studentRepository.findAll());

        Student student = studentRepository.findById(1);

        System.out.println(student);

        Student s1 = Student.builder()
                .age(14)
                .name("Roman")
                .build();

        StudentRepository studentRepository1 = new StudentMySqlRepository();
        studentRepository1.save(s1);

        System.out.println(studentRepository1.findAll());

    }
}