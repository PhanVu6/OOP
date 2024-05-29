package bai2;

public class TestMyList {
    public TestMyList() {

    }

    public static void main(String[] args) {
        // TestMyArrayList();
        System.out.println("**************************************************");
        TestMyLinkedList();
    }

    public static void testIterator(MyList typeList) {
        Book book = new Book("Hoang", 2013, 20);
        Book book1 = new Book("Vu", 2013, 22);
        Book book2 = new Book("Huong", 2013, 23);
        Book book3 = new Book("Linh", 2013, 24);
        Book book4 = new Book("Hong", 2013, 24);
        typeList.append(book);
        typeList.append(book1);
        typeList.append(book2);
        typeList.append(book3);
        System.out.println(typeList);

        System.out.println("Get at position 2: " + typeList.get(1));
        typeList.insert(book4, 2);
        System.out.println("Insert book4 at position 3: \n" + typeList);
        typeList.remove(4);
        System.out.println("Remove book at position 5: \n" + typeList);
        typeList.set(book3, 3);
        System.out.println("Set book3 at position 4: \n" + typeList);
        System.out.println("Size: " + typeList.size());

        System.out.println("Test iterator: ");
        MyIterator iterator = typeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nSort: ");
        BookManager bookManager = new BookManager(typeList);
        System.out.println("Sort by page");
        System.out.println(bookManager.sortByPageNumber(false));
        System.out.println("Sort by title");
        System.out.println(bookManager.sortTitle(false));
    }

    public static void TestMyArrayList() {
        MyAbstractList al = new MyArrayList();
        System.out.println("* Array List");
        testIterator(al);

    }

    public static void TestMyLinkedList() {
        MyAbstractList linked = new MyLinkedList();
        System.out.println("* Linked List");
        testIterator(linked);

    }

}
