package hus.oop.lab6.personclass;

public class TestMain {
    public static void main(String[] args) {
        Person student = new Student("Vu", "Ho Guom district", "Code full-stack", 2025, 15 * Math.pow(10, 6));
        Person staff = new Staff("Vu", "Ho Guom district", "Yen Hoa", 5 * Math.pow(10, 6));

        if (student instanceof Student) {
            System.out.println(student);
            System.out.println("Program: " + ((Student) student).getProgram());
            System.out.println("Year: " + ((Student) student).getYear());
            System.out.println("Fee: " + ((Student) student).getFee());
        } else {
            System.out.println(-1);
        }

        System.out.println();

        if (staff instanceof Staff) {
            System.out.println(staff);
            System.out.println("School: " + ((Staff) staff).getSchool());
            System.out.println("Pay: " + ((Staff) staff).getPay());
        } else {
            System.out.println(-1);
        }
    }
}
