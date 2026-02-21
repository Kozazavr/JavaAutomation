package data;

public class HomeWorkApp {
    public static void printThreeWords() {
        System.out.println("Orange\n");
        System.out.println("Banana\n");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 8;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 18;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
