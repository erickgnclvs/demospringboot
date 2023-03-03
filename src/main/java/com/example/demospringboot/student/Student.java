package com.example.demospringboot.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate birth;
    private Integer age;

    public Student(String name,
                   String email,
                   LocalDate birth,
                   Integer age) {
        this.name = name;
        this.email = email;
        this.birth = birth;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                ", age=" + age +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(Long id,
                   String name,
                   String email,
                   LocalDate birth,
                   Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birth = birth;
        this.age = age;
    }

    public Student() {
    }
}
