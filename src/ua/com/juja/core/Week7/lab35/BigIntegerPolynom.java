package ua.com.juja.core.Week7.lab35;

/**
 * Created in IntelliJ IDEA
 * by stereoj
 * Date: 30.08.2016
 * Time: 22:54
 *
 * Предположим, что мы работаем с полиномами и храним их в виде последовательности коэффициентов.
 * То есть полином f = 1 * x*x*x + 2*x*x + 3*x + 4 представляем в виде [1, 2, 3, 4] точнее
 *
 * new BigInteger[] {
 * new BigInteger("1"),
 * new BigInteger("2"),
 * new BigInteger("3"),
 * new BigInteger("4"),
 * }
 *
 * Полином f = 10 * x*x - 100 представляем в виде [10, 0, -100] точнее
 *
 * new BigInteger[] {
 * new BigInteger("10"),
 * new BigInteger("0"),
 * new BigInteger("-100"),
 * }
 *
 * Реализовать вычисление полинома в точке, то есть нам, скажем, дают полином f = 2*x*x*x - 3*x в виде [2, 0, -3, 0]
 * и точку 100, а мы должны вычислить 2*100*100*100 - 3*100 = 2000000 - 300 = 1999700
 *
 */

import java.math.BigInteger;

public class BigIntegerPolynom {
    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        BigInteger result = new BigInteger("0");

        for (int i = 0; i < poly.length; i++) {
            result = result.add((arg.pow(poly.length-i-1)).multiply(poly[i]));
        }
    return result;
    }
}

class Test {
    public static void main(String[] args) {
        BigInteger[] poly = {new BigInteger("1")};
        BigInteger arg = new BigInteger("10");
        BigInteger expected = new BigInteger("1");
        BigInteger actual = BigIntegerPolynom.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}