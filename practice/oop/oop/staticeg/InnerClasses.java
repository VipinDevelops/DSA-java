package oop.staticeg;

import java.util.Arrays;

//out side class can't be static because they are not depended on any other class
public class InnerClasses {

    // This will work because its static means it not depended object of its parents
    // static mean its not depended on the object of its parent class

    // static class Test {
    // String name;

    // public Test(String name) {
    // this.name = name;
    // }
    // }

    // creating a static variable in a static class
    static class Test {
        static String name;

        public Test(String name) {
            Test.name = name;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            System.out.println("toString");
            return name;
        }

    }

    // wont work because its needes an object to run
    // and its depended on the parent InnerClasses to run it can't run without an
    // object
    // class Test {
    // String name;

    // public Test(String name) {
    // this.name = name;
    // }
    // }

    public static void main(String[] args) {
        Test a = new Test("vipin");
        Test b = new Test("tushar");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);

        System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4 }));
    }

}

// This won't work
// class Test {
// String name;

// public Test(String name) {
// this.name = name;
// }
// }

// This will work
// class Test {
// static String name;

// public Test(String name) {
// Test.name = name;
// }
// }