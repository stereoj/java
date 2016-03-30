package ua.com.juja.core;

/**
 * Created by andy on 30.03.16.
 */
public class MathUtils {
    public static int lookFor(int max) {
        int Index=0;

        for ( int a=1; a<=max; a++)  {
            for ( int b=1; b<=max; b++) {

                if ((a*a+b*b)<=max) { Index++; }

            }
        }
        return Index;
    }
}
