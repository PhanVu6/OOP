package hus.oop.lab9.phonebook;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookMap();

        pb.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new Student("Marco", "Rizzo", "45243"));
        pb.addPerson(new Student("Luisa", "Poppi", "24564"));

        if (pb.searchByName("Marco") != null){
            System.out.println(pb.searchByName("Marco"));
        } else {
            System.out.println("Not student found");
        }

        if (pb.searchByLastName("Poppi") != null){
            System.out.println(pb.searchByLastName("Poppi"));
        } else {
            System.out.println("Not student found");
        }

        if (pb.searchByNumber("1111") != null){
            System.out.println(pb.searchByNumber("1111"));
        } else {
            System.out.println("Not student found");
        }

        pb.deleteByNumber("24564");
        if (pb.searchByLastName("Poppi") != null){
            System.out.println(pb.searchByLastName("Poppi"));
        } else {
            System.out.println("Not student found");
        }

    }
}

