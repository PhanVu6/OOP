package hus.oop.datastructure;

import java.util.Random;

public class App {
    static int n = 0;

    public static void main(String[] args) {
        /*
         * Yêu cầu:
         * 
         * - Hoàn thiện code chương trình theo mẫu đã cho.
         * 
         * - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [15 - 30], gọi là n.
         * - Sinh ra n số nguyên ngẫu nhiên, cho vào stack.
         * + In ra các phần tử trong stack.
         * + Lần lượt xóa các phần tử trong stack. Sau mỗi lần xóa, in ra các phần tử
         * còn lại trong stack.
         * 
         * - Sinh ra n số nguyên ngẫu nhiên, cho vào queue.
         * + In ra các phần tử trong queue.
         * + Lần lượt xóa các phần tử trong queue. Sau mỗi lần xóa, in ra các phần tử
         * còn lại trong queue.
         */
        Random rd = new Random();
        n = rd.nextInt(15, 30);
        testStack();
        testQueue();
    }

    public static void testStack() {
        Random rd = new Random();
        MyStack myStack = new MyStack();

        System.out.print("Stack: ");

        for (int i = 0; i < n; i++) {
            myStack.push(rd.nextInt(30));
        }
        System.out.println(myStack);
        myStack.pop();
        System.out.println("Later: " + myStack);
        myStack.pop();
        System.out.println("Later: " + myStack);
        myStack.pop();
        System.out.println("Later: " + myStack);

    }

    public static void testQueue() {
        Random rd = new Random();
        MyQueue myQueue = new MyQueue();

        System.out.print("Queue: ");
        for (int i = 0; i < n; i++) {
            myQueue.add(rd.nextInt(30));
        }
        System.out.println(myQueue);
        myQueue.remove();
        System.out.println("Later: " + myQueue);
        myQueue.remove();
        System.out.println("Later: " + myQueue);
        myQueue.remove();
        System.out.println("Later: " + myQueue);

    }
}
