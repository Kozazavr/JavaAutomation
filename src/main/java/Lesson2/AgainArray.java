package Lesson2;

import java.util.Arrays;

public class AgainArray {
    public int[] newArray(int[] a, int n) {

        if (n == 0) {
            return a;
        } else if (n > 0) {
            for(;n > 0; n--) {
                int lastNumber = a[a.length - 1];
                for (int i = a.length - 1; i > 0; i--) {
                    a[i] = a[i - 1];
                }
                a[0] = lastNumber;
            }
        } else if (n < 0) {
            for(;n < 0; n++) {
                int firstNumber = a[0];
                for (int i = 0; i < a.length - 1; i++) {
                    a[i] = a[i + 1];
                }
                a[a.length - 1] = firstNumber;
            }

        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}

class AgainArrayTest {
    public static void main(String[] args) {
        AgainArray againArray = new AgainArray();
        int[] a = {1, 2, 3, 4, 5};
        againArray.newArray(a, -2);
    }
}
