package mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ
         * vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        System.out.println("Test ArrayList");
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList.append(Math.random() * 10);
            // myArrayList.append((double) i);
        }
        System.out.println(myArrayList);
        MyIterator myArrayListIterator = myArrayList.iterator();
        while (myArrayListIterator.hasNext()) {
            System.out.println(myArrayListIterator.next());
        }
        BasicStatistic basicStatistic = new BasicStatistic(myArrayList);
        System.out.println("max: " + basicStatistic.max());
        System.out.println("min: " + basicStatistic.min());
        System.out.println("mean: " + basicStatistic.mean());
        System.out.println("variance: " + basicStatistic.variance());
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ
         * vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        System.out.println("Test LinkedList");
        MyLinkedList myLinkedList = new MyLinkedList();
        for (int i = 0; i < 10; i++) {
            // myLinkedList.append(Math.random() * 10);
            myLinkedList.append((double) i);
        }
        System.out.println(myLinkedList);

        MyIterator myLinkedListIterator = myLinkedList.iterator();
        while (myLinkedListIterator.hasNext()) {
            System.out.println(myLinkedListIterator.next());
        }

        BasicStatistic basicStatistic = new BasicStatistic(myLinkedList);
        System.out.println("max: " + basicStatistic.max());
        System.out.println("min: " + basicStatistic.min());
        System.out.println("mean: " + basicStatistic.mean());
        System.out.println("variance: " + basicStatistic.variance());
    }
}
