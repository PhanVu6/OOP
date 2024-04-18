package hus.oop.datastructure;

public class TestMyList {
    public TestMyList() {

    }

    public static void main(String[] args) {
        // TestMyArrayList();
        System.out.println("**************************************************");
        TestMyLinkedList();
    }

    public static void testIterator(MyList typeList) {
        typeList.insertAtEnd(1);
        typeList.insertAtEnd(2);
        typeList.insertAtEnd(4);
        System.out.println(typeList);

        System.out.println("Get at position 2: " + typeList.get(1));
        typeList.insertAtPos(4, 2);
        System.out.println("Insert 4 at position 3: \n" + typeList);
        typeList.remove(3);
        System.out.println("Remove book at position 4: \n" + typeList);
        typeList.set(3, 2);
        System.out.println("Set 3 at position 3: \n" + typeList);
        System.out.println("Size: " + typeList.size());

    }

    public static void TestMyArrayList() {
        ArrayMyList arrayMyList = new ArrayMyList();
        System.out.println("* Array List");
        testIterator(arrayMyList);

    }

    public static void TestMyLinkedList() {
        LinkedListMyList linked = new LinkedListMyList();
        System.out.println("* Linked List");
        testIterator(linked);

    }

}
