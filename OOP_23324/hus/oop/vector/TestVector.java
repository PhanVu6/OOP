package hus.oop.vector;

import java.util.Random;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        /*
         * TODO
         * 
         * Thực hiện các yêu cầu sau.
         * 
         * I. Test chức năng vector
         * - Sinh ngẫu nhiên một số tự nhiên, lưu giá trị sinh ra vào biến n.
         * - Tạo ra các vector có kích thước n, với các phần tử được sinh ngẫu nhiên.
         * Trong đó có 2 vector kiểu MyArrayList
         * và 2 vector có kiểu MyListVector.
         * - Viết các hàm để test các chứ năng của các vector, như thêm vào phần tử, xóa
         * bớt phần tử, sửa giá trị các
         * phần tử, cộng các vector, nhân vector với vô hướng, tích vô hướng 2 vector,
         * chuẩn vector, ... Mỗi lần thay
         * đổi vector hoặc tính toán, in kết quả ra terminal.
         * 
         * II. Lưu các kết quả chạy chương trình vào file text có tên
         * <Ten_MaSinhVien_Vector>.txt
         * (ví dụ NguyenVanA_123456_Vector.txt). Nén các file source code và file kết
         * quả vào file zip có tên
         * <Ten_MaSinhVien_Vector>.zip (ví dụ NguyenVanA_123456_Vector.zip), nộp lên
         * classroom.
         */
        Random random = new Random();
        int n = random.nextInt(5, 10);
        IMyVector myVector1 = new MyArrayVector();
        IMyVector myVector2 = new MyArrayVector();
        IMyVector myVector3 = new MyListVector();
        IMyVector myVector4 = new MyListVector();
        for (int i = 0; i < n; i++) {
            myVector1.insert(random.nextInt(2, 10));
            myVector2.insert(random.nextInt(2, 10));
            myVector3.insert(random.nextInt(2, 10));
            myVector4.insert(random.nextInt(2, 10));
        }

        System.out.println(myVector1);
        System.out.println(myVector2);
        System.out.println(myVector3);
        System.out.println(myVector4);

        testAdd(myVector1, myVector3);
        testAdd(myVector1, 20);
        testAddTo(myVector1, myVector3);
        testAddTo(myVector1, 20);
        testCoordinate(myVector1, 1);
        testMinus(myVector1, myVector3);
        testMinus(myVector1, 2);
        testMinusFrom(myVector1, myVector3);
        testMinusFrom(myVector1, 2);
        testDot(myVector1, myVector3);
        testPow(myVector1, 2);
        testScale(myVector1, 2);
        testNorm(myVector1);
        testInsert(myVector1, 20);
        testInsert(myVector1, 20, 5);
        testRemove(myVector1, 2);
        testExtract(myVector1, new int[] { 2, 3 });

        System.out.println("=============================");
        testAdd(myVector2, myVector4);
        testAdd(myVector2, 20);
        testAddTo(myVector2, myVector4);
        testAddTo(myVector2, 20);
        testCoordinate(myVector2, 1);
        testMinus(myVector2, myVector4);
        testMinus(myVector2, 2);
        testMinusFrom(myVector2, myVector4);
        testMinusFrom(myVector2, 2);
        testDot(myVector2, myVector4);
        testPow(myVector2, 2);
        testScale(myVector2, 2);
        testNorm(myVector2);
        testInsert(myVector2, 20);
        testInsert(myVector2, 20, 5);
        testRemove(myVector2, 2);
        testExtract(myVector2, new int[] { 2, 3 });

    }

    private static void testAdd(IMyVector vector1, IMyVector vector2) {
        System.out.println("Test Add");
        System.out.println(vector1.add(vector2));
        System.out.println("-----------------");
    }

    private static void testAdd(IMyVector vector, double value) {
        System.out.println("Test Add");
        System.out.println(vector.add(value));
        System.out.println("-----------------");
    }

    private static void testAddTo(IMyVector vector1, IMyVector vector2) {
        System.out.println("Test Add To");
        System.out.println(vector1.addTo(vector2));
        System.out.println("-----------------");
    }

    private static void testAddTo(IMyVector vector, double value) {
        System.out.println("Test Add To");
        System.out.println(vector.addTo(value));
        System.out.println("-----------------");
    }

    private static void testCoordinate(IMyVector vector, int i) {
        System.out.println("Test coordinate");
        System.out.println(vector.coordinate(i));
        System.out.println("-----------------");
    }

    private static void testMinus(IMyVector vector1, IMyVector vector2) {
        System.out.println("Test minus");
        System.out.println(vector1.minus(vector2));
        System.out.println("-----------------");
    }

    private static void testMinus(IMyVector vector, double value) {
        System.out.println("Test minus");
        System.out.println(vector.minus(value));
        System.out.println("-----------------");
    }

    private static void testMinusFrom(IMyVector vector1, IMyVector vector2) {
        System.out.println("Test minus from");
        System.out.println(vector1.minusFrom(vector2));
        System.out.println("-----------------");
    }

    private static void testMinusFrom(IMyVector vector, double value) {
        System.out.println("Test minus from");
        System.out.println(vector.minusFrom(value));
        System.out.println("-----------------");
    }

    private static void testDot(IMyVector vector1, IMyVector vector2) {
        System.out.println("Test dot");
        System.out.println(vector1.dot(vector2));
        System.out.println("-----------------");
    }

    private static void testPow(IMyVector vector, double power) {
        System.out.println("Test pow");
        System.out.println(vector.pow(power));
        System.out.println("-----------------");
    }

    private static void testScale(IMyVector vector, double value) {
        System.out.println("Test scale");
        System.out.println(vector.scale(value));
        System.out.println("-----------------");
    }

    private static void testNorm(IMyVector vector) {
        System.out.println("Test norm");
        System.out.println(vector.norm());
        System.out.println("-----------------");
    }

    private static void testInsert(IMyVector vector, double value) {
        System.out.println("Test insert");
        System.out.println(vector.insert(value));
        System.out.println("-----------------");
    }

    private static void testInsert(IMyVector vector, double value, int index) {
        System.out.println("Test insert");
        System.out.println(vector.insert(value, index));
        System.out.println("-----------------");
    }

    private static void testRemove(IMyVector vector, int index) {
        System.out.println("Test remove");
        System.out.println(vector.remove(index));
        System.out.println("-----------------");
    }

    private static void testExtract(IMyVector vector, int[] indecies) {
        System.out.println("Test extract");
        System.out.println(vector.extract(indecies));
        System.out.println("-----------------");
    }
}
