package ua.com.juja.core.Week7;

/**
 * Created in IntelliJ IDEA
 * by stereoj
 * Date: 29.08.2016
 * Time: 23:24
 */

import ua.com.juja.core.Week7.lab34.BigIntegerToBitString;

import java.math.BigInteger;


class TestResult {
    public static void main(String[] args) {
        BigInteger k = new BigInteger("1024").pow(10);

        String expected = "1";
        for (int i = 0; i < 10; i++) {
            expected += "0000000000";
        }

        String actual = BigIntegerToBitString.toBitStr(k);

        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}