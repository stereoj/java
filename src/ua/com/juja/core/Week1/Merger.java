package ua.com.juja.core.Week1;

/**
 * Created by andy on 29.03.16.
 */
public class Merger {

    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        while (fstIndex + sndIndex < result.length - 2) {
            if (fst[fstIndex] < snd[sndIndex]) {
                result[fstIndex + sndIndex] = fst[fstIndex];
                if (fstIndex != fst.length - 1) {
                    fstIndex++;
                }
            } else {
                result[fstIndex + sndIndex] = snd[sndIndex];
                if (sndIndex != snd.length - 1) {
                    sndIndex++;
                }
            }
        }

        if ( fst[fstIndex] < snd[sndIndex] ) {
            result[fstIndex + sndIndex] = fst[fstIndex];
            result[fstIndex + sndIndex + 1] = snd[sndIndex];
        }
        else{
            result[fstIndex + sndIndex] = snd[sndIndex];
            result[fstIndex + sndIndex + 1] = fst[fstIndex];
        }



        return result;
    }

}
