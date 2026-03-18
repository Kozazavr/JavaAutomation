package Lesson4;

public abstract class Animal {

    public abstract void run(int length);

    public abstract void swim(int length);

}

class mainClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        dog.run(800);
        dog.run(150);
        dog.swim(5);
        dog.swim(30);

        Cat cat = new Cat("Vasya");
        cat.run(300);
        cat.run(150);
        cat.swim(150);

    }
}
