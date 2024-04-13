package hus.oop.lab9.library;

import java.util.Date;

public class Rent {
    protected Item item;
    protected Student student;
    protected Date begin;
    protected Date end;

    public Rent(Item item, Student student, Date begin, Date end) {
        this.item = item;
        this.student = student;
        this.begin = begin;
        this.end = end;
    }

    public Item getItem() {
        return item;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    @Override
    public String toString() {
        return "Rent[" +
                "item=" + item +
                ", end=" + end +
                ", student=" + student +
                ", begin=" + begin +
                ']';
    }
}
