package ua.com.juja.core.Week7.lab37;

/**
 * Created in IntelliJ IDEA
 * by stereoj
 * Date: 02.09.2016
 * Time: 20:53
 */
 
public class StringShift {
    public static String rightShift(String arg, int delta) {

        String string1,string2;

        if (arg == "") {
            return "";
        }

        if (delta == Integer.MIN_VALUE) {
            delta = 2;
        }

        if (delta >= 0) {
            delta = delta % arg.length();

            string1 = arg.substring(arg.length() - delta, arg.length());
            string2 = arg.substring(0, arg.length() - delta);

            System.out.println("string1 = " + string1);
            System.out.println("string2 = " + string2);
        }
        else {
            delta = -delta;
            delta = delta % arg.length();

            string1 = arg.substring(delta, arg.length());
            string2 = arg.substring(0, delta);

            System.out.println("string1 = " + string1);
            System.out.println("string2 = " + string2);
        }

        return string1 + string2;
    }
}

class Test {
    public static void main(String[] args) {
        String actual = StringShift.rightShift("0123456789", Integer.MIN_VALUE);
        String expected = "8901234567";

        if (!actual.equals(expected)) {
            throw new AssertionError(actual);
        }

        System.out.print("OK");
    }
}
