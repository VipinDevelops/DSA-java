package oop.staticeg;

public class Main {
    public static void main(String[] args) {

        Human.text();

        System.out.println(Human.population);
        Human vipin = new Human(20, "vipin", 30000, false);
        System.out.println(Human.population);
        Human tushar = new Human(23, "tushar", 50000, false);
        System.out.println(Human.population);

        // greeting(); // you can't use this because it require a instance but main
        // function dont require instance
        // you can't run somethign thati is not static in a static funciton
    }

    void greeting() {
        fun(); // we can us a static method in a non static method
        // but not opposite of that
        System.out.println("Hello world ");
    }

    static void fun() {
        System.out.println("fun");

        // you can't access a non static stuff without ref their instances in a static
        // context
        // to run greeting you either want it to be static of have a object
        // now after making a new object we can use greeting on that new object and run
        // it in a staic function
        Main obj = new Main();
        obj.greeting();

    }
}
