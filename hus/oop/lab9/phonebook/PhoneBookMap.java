package hus.oop.lab9.phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student s) {
        phoneBook.put(s.phone, s);
    }

    @Override
    public Student searchByName(String name) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            Student student = entry.getValue();
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastName) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            Student student = entry.getValue();
            if (student.lastName.equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            String phoneNum = entry.getKey();
            if (phoneNum.equals(phone)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        if (phoneBook.containsKey(phone)) {
            phoneBook.remove(phone);
        }
    }

}
