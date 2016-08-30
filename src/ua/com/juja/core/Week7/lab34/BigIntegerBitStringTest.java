package ua.com.juja.core.Week7.lab34;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Created in IntelliJ IDEA
 * by stereoj
 * Date: 29.08.2016
 * Time: 23:57
 */

public class BigIntegerBitStringTest {
    @Test
    public void test() {
        assertEquals("11000000100011",
                BigIntegerToBitString.toBitStr(new BigInteger("12323")));
        assertEquals("1010101011000",
                BigIntegerToBitString.toBitStr(new BigInteger("5464")));
        assertEquals("10100011110001110000101100110",
                BigIntegerToBitString.toBitStr(new BigInteger("343466342")));
        assertEquals("1101010010000110101",
                BigIntegerToBitString.toBitStr(new BigInteger("435253")));
        assertEquals("10",
                BigIntegerToBitString.toBitStr(new BigInteger("2")));
        assertEquals("1",
                BigIntegerToBitString.toBitStr(new BigInteger("1")));
        assertEquals("0",
                BigIntegerToBitString.toBitStr(new BigInteger("0")));
    }


}
