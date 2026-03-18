package Lesson4;

public class Cat extends Animal{

    public String name;
    public static final int MAXRUN = 200;
    public static final int MAXSWIM = 0;
    public static int count = 0;
    Cat(String name) {
        count++;
        this.name = name;
    }
    @Override
    public void run(int length) {
        if( length <= MAXRUN) {
            System.out.println(name + " runs " + length + " metres");
        } else {
            System.out.println(name + " runs " + MAXRUN + " metres");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(name + " dont swim " + length + " metres, because it dont can swim.");
    }


}
