package oop;

public class First {
    public static void main(String[] args) {
        System.out.println("hello world ");

        Student vipin = new Student(2, "vipin", 99.5f);

        // vipin.marks = 88.5f;
        // vipin.name = "vipin chaudhary";
        // vipin.rno = 2;

        vipin.changeName("developer");
        vipin.greeting();

        Student random = new Student(vipin);
        Student test = new Student();

        System.out.println(test.marks);
        System.out.println(test.rno);
        System.out.println(test.name);
    }

    static class Student {
        int rno;
        String name;
        float marks;

        Student(int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        Student(Student other) {
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        Student() {
            // constructor calling other constructor
            this(13, "default", 100.0f);
        }

        void greeting() {
            System.out.println("Hello my name is " + name);
        }

        void changeName(String newname) {
            name = newname;
        }
    }

    // export
    // public mean its it avilable for all the file even in another package
    public static void message() {
        System.out.println("this is awesome");
    }
}
