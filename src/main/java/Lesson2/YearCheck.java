package Lesson2;

public class YearCheck {
    int year400 = 400;
    int year100 = 100;
    int year4 = 4;
    public boolean yearCheck(int a) {
        if (a % 400 == 0) {
            System.out.println("true");
            return true;
        } else if (a % 100 == 0) {
            System.out.println("true");
            return true;
        } else if (a % 4 == 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}

class YearCheckTest {
    public static void main(String[] args) {
        YearCheck yCheck = new YearCheck();
        yCheck.yearCheck(1644);
    }


}
