package Lesson4;

public class Dog extends Animal {
     public String name;
     public static final int MAXRUN = 500;
     public static final int MAXSWIM = 10;
     public static int count = 0;

     Dog(String name) {
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
        if( length <= MAXSWIM) {
            System.out.println(name + " swims " + length + " metres");
        } else {
            System.out.println(name + " swims " + MAXSWIM + " metres");
        }
    }
}
