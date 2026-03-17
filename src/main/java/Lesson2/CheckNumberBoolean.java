package Lesson2;

public class CheckNumberBoolean {

    public boolean checkNumberBoolean(int a) {
        if (a == 0) {
            System.out.println("false");
            return false;
        }
        int result = a + a;
        if (result > 0) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }
}

class CheckNumberBooleanTest {
    public static void main(String[] args) {
        CheckNumberBoolean checkNumberBoolean = new CheckNumberBoolean();
        checkNumberBoolean.checkNumberBoolean(15);
    }
}