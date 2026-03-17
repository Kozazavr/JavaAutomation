package Lesson2;

import java.util.Arrays;

public class ChangeArray {
    int[] numbers = {1,0,1,1,0,0,0,1};

    public int[] changeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}

class ChangeArrayTest {
    public static void main(String[] args) {
        ChangeArray changeArray = new ChangeArray();
        int[] a = {1,0,1,1,0,0,0,1};
        changeArray.changeArray(a);
    }

}