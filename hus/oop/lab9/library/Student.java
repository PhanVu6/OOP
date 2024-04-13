package hus.oop.lab9.library;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String lastName;
    private String phone;
    private double average;

    public Student(String phone, String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Student(String name, String lastName, double average) {
        this.name = name;
        this.lastName = lastName;
        this.average = average;
    }

    public Student(String phone, String name, String lastName, double average) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student s) {
        int compareName = this.name.compareTo(s.name);
        int compareLastName = this.lastname.compareTo(s.lastname);

        if (compareName != 0) {
            return compareName;
        }

        return compareLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Double.compare(student.average, average) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, phone, average);
    }

    @Override
    public String toString() {
        return "Student[" +
                "name=" + name +
                ", lastName=" + lastName +
                ", phone=" + phone +
                ", average=" + average +
                ']';
    }
}
