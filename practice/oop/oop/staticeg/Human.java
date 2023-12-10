package oop.staticeg;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void text() {
        System.out.println("hey Human class is working");
        // System.out.println(this.age); // you can't use something depended on obj in a static method
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
