package Lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquareArray {
    int[][] myArray = new int[5][5];

    public int[][] diagonal(int [][] a) {

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(i == j) {
                    a[i][j] = i;
                }
            }
        }
        System.out.println(Arrays.deepToString(a));
        return a;
    }
}

class SquareArrayTest {
    public static void main(String[] args) {
        SquareArray squareArray = new SquareArray();
        int [][] ar1 = new int[5][5];

        squareArray.diagonal(ar1);
    }
}