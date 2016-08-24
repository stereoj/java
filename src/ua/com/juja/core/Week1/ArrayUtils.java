package ua.com.juja.core.Week1;

/**
 * Created by andy on 30.03.16.
 */
public class ArrayUtils {
    public static int[] lookFor(int... array) {
        int Index1=array.length,Index2=array.length,count=0,maxcount=0,intcount=0,tmp=0,tmpIndex=0;

        int[] ArrIndex1,ArrIndex2,ArrMaxcount;
        ArrIndex1 = new int[array.length];
        ArrIndex2 = new int[array.length];
        ArrMaxcount = new int[array.length];

        for (int i=0; i<array.length; i++) {

            if ( array[i] > 0 ) {
                if ( count==0 ) { Index1=i; Index2=i; }
                else { Index2++; }
                count++;
            }
            if ( array[i] <= 0 || i == array.length-1) {
                if ( maxcount<count ) maxcount=count;
                if ( count != 0 ) { ArrIndex1[intcount]=Index1; ArrIndex2[intcount]=Index2; ArrMaxcount[intcount]=count; intcount++;}
                count=0;
            }
            if ( count>maxcount ) maxcount=count;

        }

        tmp=ArrMaxcount[0];
        for (int i=1; i<array.length; i++) { if (ArrMaxcount[i]>=tmp) { tmpIndex=i; tmp=ArrMaxcount[i]; }}
        Index1=ArrIndex1[tmpIndex]; Index2=ArrIndex2[tmpIndex];

        if ( maxcount==0 ) return new int[0];
        return new int[]{Index1,Index2} ;
    }
}