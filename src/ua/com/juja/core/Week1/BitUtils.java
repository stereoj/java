package ua.com.juja.core.Week1;

/**
 * Created by andy on 26.03.16.
 */
public class BitUtils {
    public static byte swapBits(byte b, int i, int j) {
        byte x,y,x1=0b00000000,y1=0b00000000;
        x=(byte)(0b00000001<<i);
        y=(byte)(0b00000001<<j);

            if ((b&y)>0)
            x1=(byte)(b|x);
            else x1=(byte)(b&(~x));
            if ((b&x)>0)
            y1=(byte)(x1|y);
            else y1=(byte)(x1&(~y));

        return y1;
    }
}
