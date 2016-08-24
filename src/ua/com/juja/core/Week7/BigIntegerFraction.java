package ua.com.juja.core.Week7;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by
 * stereoj on 24.08.2016.
 */


public class BigIntegerFraction {
    public static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {
        BigInteger[] result = new BigInteger[2];
        BigInteger divisor;


        result[0] = x[0].multiply(y[1]).add(y[0].multiply(x[1]));
        result[1] = x[1].multiply(y[1]);

        divisor = result[0].gcd(result[1]);
        result[0] = result[0].divide(divisor);
        result[1] = result[1].divide(divisor);

    return result;
    }
}

class Test {
    public static void main(String[] args) {
        BigInteger[] x = {new BigInteger("1"), new BigInteger("2")};
        BigInteger[] y = {new BigInteger("1"), new BigInteger("2")};
        BigInteger[] expected = {new BigInteger("1"), new BigInteger("1")};
        BigInteger[] actual = BigIntegerFraction.sum(x, y);

        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}