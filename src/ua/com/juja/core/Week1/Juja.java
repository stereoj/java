package ua.com.juja.core.Week1;

/**
 * Created by andy on 20.03.16.
 */
public class Juja {


    public static void main(String[] args) {



        int arr[] = new int[11];

        /*int ar1[] = {11,22,34,45,56,67,77,88,92,100};
        int ar2[] = {10,12,39,40,59,61,62,90};
        int ar3[] = new int[ar1.length+ar2.length];

        ar1 = new int[10];
        ar2 = new int[10];
        System.out.println(x);
        System.out.println(Integer.toString(-14,2)+" "+Integer.toString(-7,2));
        System.out.println(Integer.parseInt("-1110", 2) & Integer.parseInt("-111", 2));
        System.out.println("\ny="+Integer.toBinaryString(BitUtils.swapBits((byte)(0b1111_0001), 0, 6)));
        */

        //ar3 = Merger1.merge(ar1,ar2);


        arr=ArrayUtils.lookFor(0, 1, 1, 1, 1, 0, 1, 1, 1, 1);
        for (int i=0; i<arr.length; i++) System.out.println(arr[i]+" ");


    }

}



