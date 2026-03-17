package Lesson2;

import java.util.Arrays;

public class NewArray {
    int[] myArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    public int[] changeMyArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] < 6) {
                a[i] = a[i]*2;
            }
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}

class NewArrayTest {
    public static void main(String[] args) {
        NewArray newArray = new NewArray();
        int[] a = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        newArray.changeMyArray(a);
    }
}