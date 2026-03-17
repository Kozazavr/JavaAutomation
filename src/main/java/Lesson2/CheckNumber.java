package Lesson2;

public class CheckNumber {

    public void checkNumber(int a) {
        if (a == 0) {
            System.out.println(a + " - положительное число");
        }
        int result = a + a;
        if (result > 0) {
            System.out.println(a + " - положительное число");
        } else if (result < 0) {
            System.out.println(a + " - отрицательное число");
        }
    }
}

class CheckNumberTest {
    public static void main(String[] args) {
        CheckNumber checkNumber = new CheckNumber();
        checkNumber.checkNumber(0);
    }
}
