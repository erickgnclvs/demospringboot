package com.example.demospringboot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(
                1L,
                "erick",
                "erick@mail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                23
        );
        studentList.add(student1);

        return studentList;
    }
}
