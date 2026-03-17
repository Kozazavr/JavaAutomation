package Lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayForHundred {
    int arrayLength = 100;
    int[] arrayFor100 = new int [arrayLength];

    public int[] arrayForHundred(int[] a) {
        for (int i = 0; i < arrayLength; i++) {
            a[i] = i+1;
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

}

class ArrayForHundredTest {
    public static void main(String[] args) {
        ArrayForHundred arrayForHundred = new ArrayForHundred();
        int[] arrayFor100 = new int [100];
        arrayForHundred.arrayForHundred(arrayFor100);

    }
}
