package hus.oop.lab5.jdk_bigInteger;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger bigInteger2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        System.out.println("Adds: " + bigInteger1.add(bigInteger2));
        System.out.println("Multiply: " + bigInteger1.multiply(bigInteger2));
    }
}
