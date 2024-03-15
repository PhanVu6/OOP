package hus.oop.lab4.mypolynomial;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial myPolynomial1 = new MyPolynomial(1, 2, 3, -1, -2, 3);
        System.out.println(myPolynomial1.toString());

        MyPolynomial myPolynomial2 = new MyPolynomial(-3, -4, -2, -1, 5, 4);

        System.out.println("Degree is " + myPolynomial1.getDegree());
        System.out.println("Evaluate of polynomial 1 with x = 3 is " + myPolynomial1.evaluate(3));
        System.out.println(myPolynomial1.add(myPolynomial2));
        MyPolynomial myPolynomialMulti = myPolynomial1.multiply(myPolynomial2);
        System.out.println(myPolynomialMulti);

        /*
         * Trong java tôi không cần phải lưu trữ bậc của đa thức, tôi có thể tính toán
         * bậc bằng cách tính độ dài mảng. Nhưng nếu lưu bậc thì có thể cải thiện hiệu
         * suất bởi bậc là thứ không hay thay đổi tôi có thể lưu trữ nó và tái sử dụng
         * 
         * Trong C/C++, việc lưu trữ bậc như một biến riêng biệt là phổ biến hơn. Điều
         * này là do C/C++ không có các tính năng tích hợp như varargs hoặc độ dài mảng
         * động, do đó việc lưu trữ bậc một cách rõ ràng cung cấp một cách thuận tiện để
         * truy cập và thao tác nó.
         */
    }
}
