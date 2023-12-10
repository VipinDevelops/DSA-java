package oop.staticeg;

// this is a demo to show init of static variables 
// in a non static class 

public class StaticBlock {
    static int a = 4;
    static int b;

    // execute once when the first obj is create, when the class is loaded for the
    // first time
    static {
        System.out.println("init");
        b = 2 * a;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 10;

        StaticBlock obj2 = new StaticBlock();

        System.out.println(obj2.b);
    }

}
