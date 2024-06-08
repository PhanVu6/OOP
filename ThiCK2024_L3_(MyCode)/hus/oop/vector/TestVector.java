package hus.oop.vector;

import java.util.Random;

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
    int n = random.nextInt(10);
    int[] indices = { 0, 3 };
    MyArrayVector myArrayVector1 = new MyArrayVector();
    MyArrayVector myArrayVector2 = new MyArrayVector();
    MyListVector myListVector1 = new MyListVector();
    MyListVector myListVector2 = new MyListVector();

    for (int i = 0; i < n; i++) {
      testInsert(myArrayVector1, random.nextInt(10));
      testInsert(myArrayVector2, random.nextInt(10));
    }
    print(myArrayVector1);
    print(myArrayVector2);

    testInsert(myArrayVector1, 4, 2);
    testInsert(myArrayVector2, 3, 2);

    testAdd(myArrayVector1, 3);
    testAdd(myArrayVector1, myArrayVector2);
    testAddTo(myArrayVector1, 4);
    testAddTo(myArrayVector1, myArrayVector2);

    testMinus(myArrayVector1, 3);
    testMinus(myArrayVector1, myArrayVector2);
    testMinusFrom(myArrayVector1, 4);
    testMinusFrom(myArrayVector1, myArrayVector2);

    testDot(myArrayVector1, myArrayVector2);
    testPow(myArrayVector1, 3);
    testScale(myArrayVector1, 4);
    testNorm(myArrayVector1);

    testRemove(myArrayVector1, 0);
    testRemove(myArrayVector2, 0);

    testExtract(myArrayVector2, indices);
  }

  private static void print(IMyVector myVector) {
    System.out.println(myVector);
  }

  private static void testInsert(IMyVector myVector, double value) {
    myVector.insert(value);
  }

  private static void testInsert(IMyVector myVector, double value, int index) {
    System.out.println("Insert at position: " + index);
    print(myVector.insert(value, index));
  }

  private static void testAdd(IMyVector myVector, double value) {
    System.out.println("Add value: " + value);
    print(myVector.add(value));
  }

  private static void testAdd(IMyVector myVector, IMyVector another) {
    System.out.println("Add another: " + another);
    print(myVector.add(another));
  }

  private static void testAddTo(IMyVector myVector, double value) {
    System.out.println("AddTo value: " + value);
    print(myVector.addTo(value));
  }

  private static void testAddTo(IMyVector myVector, IMyVector another) {
    System.out.println("AddTo another: " + another);
    print(myVector.addTo(another));
  }

  private static void testMinus(IMyVector myVector, double value) {
    System.out.println("Minus value: " + value);
    print(myVector.minus(value));
  }

  private static void testMinus(IMyVector myVector, IMyVector another) {
    System.out.println("Minus another: " + another);
    print(myVector.minus(another));
  }

  private static void testMinusFrom(IMyVector myVector, double value) {
    System.out.println("Minus value: " + value);
    print(myVector.minusFrom(value));
  }

  private static void testMinusFrom(IMyVector myVector, IMyVector another) {
    System.out.println("MinusTo another: " + another);
    print(myVector.minusFrom(another));
  }

  private static void testDot(IMyVector myVector, IMyVector another) {
    System.out.println("Dot: " + another);
    System.out.println(myVector.dot(another));
  }

  private static void testPow(IMyVector myVector, double value) {
    System.out.println("Pow: " + value);
    print(myVector.pow(value));
  }

  private static void testScale(IMyVector myVector, double value) {
    System.out.println("Scale: " + value);
    print(myVector.scale(value));
  }

  private static void testNorm(IMyVector myVector) {
    System.out.println("Norm: ");
    System.out.println(myVector.norm());
  }

  private static void testRemove(IMyVector myVector, int index) {
    System.out.println("Remove index: " + index);
    print(myVector.remove(index));
  }

  private static void testExtract(IMyVector myVector, int[] indices) {
    System.out.println("Extract indices: ");
    print(myVector.extract(indices));
  }

}
