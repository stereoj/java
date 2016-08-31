package ua.com.juja.core.Week7.lab36;

/**
 * Created in IntelliJ IDEA
 * by stereoj
 * Date: 31.08.2016
 * Time: 23:13
 */

import java.math.BigInteger;
import java.util.Arrays;

public class BigIntegerPolyMul {
    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {
        BigInteger[] result = new BigInteger[x.length + y.length -1];

        for ( int i = 0; i <  result.length; i++ ) {
            result[i] = new BigInteger("0");
        }


            for ( int i = 0; i < x.length; i++ )
                for (int j = 0; j < y.length ; j++) {

                result[i+j] = result[i+j].add(x[i].multiply(y[j]));
            }

        return result;
    }
}

class Test {
    public static void main(String[] args) {
            BigInteger[] x = {
                    new BigInteger("1"),
                    new BigInteger("1"),
            };
            BigInteger[] y = {
                    new BigInteger("1"),
                    new BigInteger("1"),
            };

            BigInteger[] expected = {
                    new BigInteger("1"),
                    new BigInteger("2"),
                    new BigInteger("1"),
            };
            BigInteger[] actual = BigIntegerPolyMul.mul(x, y);

            if (!Arrays.equals(actual, expected)) {
                throw new AssertionError(Arrays.toString(actual));
            }

            System.out.print("OK");
        }
}