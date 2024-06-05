package search;

import java.util.Random;

public class TestBinarySearch {
  public static void main(String[] args) {
    /*
     * Yêu cầu:
     * - Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [20 - 30].
     * - Sinh ra ngẫu nhiên một mảng các số kiểu double, có kích thước bằng số tự
     * nhiên đã sinh ngẫu nhiên ở trên.
     * - Tạo đối tượng có kiểu dữ liệu BinarySearch. Dùng đối tượng này test thuật
     * toán tìm kiếm nhị phân với
     * mảng dữ liệu đã sinh ra, và sử dụng 3 thuật toán sắp xếp khác nhau như đã
     * cho.
     * 
     * Các kết quả test được in ra terminal theo định dạng: ví dụ
     * Using Bubble Sort Algorithm:
     * Before sorting: [5.0 unSort sorting: [1.0 2.0 3.0 4.0 5.0]
     * Binary search giá trị 3.0: 2
     * 
     * Using Insertion Sort Algorithm:
     * Before sorting: [5.0 unSort sorting: [1.0 2.0 3.0 4.0 5.0]
     * Binary search giá trị 6:-1
     * 
     * - Kết quả chạy chương trình lưu vào file text được đặt tên
     * <TenSinhVien_MaSinhVien_BinarySearch.txt.
     * - Nén các file source code và file text kết quả chạy chương trình vào file
     * zip có tên
     * <TenSinhVien_MaSinhVien_BinarySearch>.zip (Ví dụ,
     * NguyenVanA_123456_BinarySearch.zip),
     * nộp lên classroom
     */

    Random random = new Random();
    int n = random.nextInt(20, 30);
    int indexSearch = 0;
    BinarySearch binarySearch = BinarySearch.getInstance();
    BubbleSort bubbleSort = new BubbleSort();
    SelectionSort selectionSort = new SelectionSort();
    InsertionSort insertionSort = new InsertionSort();

    StringBuilder stringArray = new StringBuilder();
    String unSort = "";
    double[] data = new double[n];
    for (int i = 0; i < data.length; i++) {
      data[i] = (int) (Math.random() * 10);
      stringArray.append(data[i] + " ");
    }
    unSort = stringArray.toString().trim();
    stringArray.delete(0, stringArray.length());

    // BubbleSort
    double valueSearch = (int) (Math.random() * 10);
    System.out.println("Using Bubble Sort Algorithm:");
    System.out.println("Before sorting: [" + unSort + "]");
    binarySearch.setSorter(bubbleSort);
    indexSearch = binarySearch.search(data, valueSearch);
    for (int i = 0; i < data.length; i++) {
      stringArray.append(data[i] + " ");
    }
    System.out.println("After sorting: [" + stringArray.toString().trim() + "]");
    stringArray.delete(0, stringArray.length());
    System.out.println("Binary Search giá trị " + valueSearch + ": " + indexSearch + "\n");

    // SelectionSort
    valueSearch = (int) (Math.random() * 10);
    System.out.println("Using Selection Sort Algorithm:");
    System.out.println("Before sorting: [" + unSort + "]");
    binarySearch.setSorter(selectionSort);
    indexSearch = binarySearch.search(data, valueSearch);
    for (int i = 0; i < data.length; i++) {
      stringArray.append(data[i] + " ");
    }
    System.out.println("After sorting: [" + stringArray.toString().trim() + "]");
    stringArray.delete(0, stringArray.length());
    System.out.println("Binary Search giá trị " + valueSearch + ": " + indexSearch + "\n");

    // InsertionSort
    valueSearch = (int) (Math.random() * 10);
    System.out.println("Before sorting: [" + unSort + "]");
    binarySearch.setSorter(insertionSort);
    indexSearch = binarySearch.search(data, valueSearch);
    for (int i = 0; i < data.length; i++) {
      stringArray.append(data[i] + " ");
    }
    System.out.println("After sorting: [" + stringArray.toString().trim() + "]");
    stringArray.delete(0, stringArray.length());
    System.out.println("Binary Search giá trị " + valueSearch + ": " + indexSearch);
  }
}
