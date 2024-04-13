package hus.oop.lab9.phonebook;

import java.util.Objects;

public class Student implements Comparable<Student> {
    protected String name;
    protected String lastName;
    protected String phone;
    protected double average;

    public Student(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Student(String name, String lastName, double average) {
        this.name = name;
        this.lastName = lastName;
        this.average = average;
    }

    public Student(String name, String lastName, String phone, double average) {
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
    public int hashCode() {
        return Objects.hash(name, lastName, phone, average);
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
    public String toString() {
        return "Student [name=" + name + ", lastname=" + lastName + ", phone=" + phone + ", average=" + average + ']';
    }
}
