package Lesson2;

public class PrintStrings {
    public void printStrings(String a, int b) {
        while (b > 0) {
            System.out.println(a);
            b--;
        }
    }
}

class PrintStringsTest {
    public static void main(String[] args) {
        PrintStrings printStrings = new PrintStrings();
        //printStrings.printStrings("re-re", 8);
        printStrings.printStrings("re-re", 1);
    }
}

