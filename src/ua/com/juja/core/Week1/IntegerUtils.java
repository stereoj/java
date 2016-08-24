package ua.com.juja.core.Week1;

/**
 * Created by andy on 25.03.16.
 */
public class IntegerUtils {
    public static int leftShift(int arg) {

        if (arg>0) arg = arg << 1;
        if (arg<0) arg = (arg << 1) | 1;

        String x=Integer.toBinaryString(arg);

        System.out.println(x);


        return (arg);
    }
}
