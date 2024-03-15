package hus.oop.lab4.book23;

public class TestBook23 {
    public static void main(String[] args) {

        // Test Author class
        Author23 author1 = new Author23("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(author1);
        author1.setEmail("ahteck@somewhere.com");
        System.out.println(author1);
        System.out.println("name is: " + author1.getName());
        System.out.println("email is: " + author1.getEmail());

        // Test Book class
        Book23 book1 = new Book23("12345", "Java for dummies", author1, 8.8, 88);
        System.out.println(book1);

        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println(book1);
        System.out.println("isbn is: " + book1.getIsbn());
        System.out.println("name is: " + book1.getName());
        System.out.println("price is: " + book1.getPrice());
        System.out.println("qty is: " + book1.getQty());
        System.out.println("author is: " + book1.getAuthor()); // Author's toString()
        System.out.println("author's name: " + book1.getAuthorName());
        System.out.println("author's name: " + book1.getAuthor().getName());
        System.out.println("author's email: " + book1.getAuthor().getEmail());

    }
}
