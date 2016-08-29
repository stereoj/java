package ua.com.juja.core.Week7.lab34;

import java.math.BigInteger;

/**
 * Created in IntelliJ IDEA
 * by stereoj
 * Date: 30.08.2016
 * Time: 0:09
 */
public class BigIntegerToBitString {
    public static String toBitStr(BigInteger arg) {

        int number;
        String str;

        number = arg.intValue();
        str = Integer.toBinaryString(number);

    return arg.toString(2);
    }
}
