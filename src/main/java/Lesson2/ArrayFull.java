package Lesson2;

import java.util.Arrays;

public class ArrayFull {
    public int[] newArray(int len, int initialValue) {
        int[] newArray = new int[len];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = initialValue;
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}

class ArrayFullTest {
    public static void main(String[] args) {
        ArrayFull arrayFull = new ArrayFull();
        arrayFull.newArray(1, 7);
    }
}
