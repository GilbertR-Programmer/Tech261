package com.sparta.grr;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private Integer score;
    private Integer id;
    private String name;

    public Student(Integer score, String name, Integer id) {
        this.score = score;
        this.id = id;
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(score, student.score) && Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return getScore() - o.getScore();
    }
}
