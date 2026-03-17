package Lesson2;

public class CheckSum {
    int min = 10;
    int max = 20;
    public boolean checkSum(int a, int b) {
        int sum = a + b;
        if (min <= sum && sum <= max) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}

class CheckSumTest {
    public static void main(String[] args) {
        CheckSum checkSum = new CheckSum();
        checkSum.checkSum(15, 2);
    }
}
