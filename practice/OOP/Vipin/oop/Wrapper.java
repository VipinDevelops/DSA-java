package practice.OOP.Vipin.oop;

public class Wrapper {
    public static void main(String[] args) {

        // Primitive
        int a = 10;
        int b = 29;

        // Object
        Integer num = 52;

        swapObj(a, b);

        System.out.println(a + " " + b);

        A obj = new A("Vipin");
        System.out.println(obj);

    }

    // Primitive are pass by value
    // This is not swap because a and b is not swap there values are passed which is
    // swap in the scope of function only
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // THis is object which is pass by reference
    // this will swap the actuall value of thing these values point to
    static void swapObj(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }

    
}
