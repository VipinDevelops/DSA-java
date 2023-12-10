package oop.staticeg;

// make a class that allow only one object to be created 
public class singleton {
    // with private constructor now one can create a object with this
    private singleton() {

    }

    // this is the instance we give to all
    private static singleton instance;

    // this is where we create one object
    public static singleton getInstance() {
        // check one object is created or not
        if (instance == null) { // not created
            instance = new singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        singleton obj = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
        singleton obj3 = singleton.getInstance();

        // all 3 ref variables are pointing to just one object

    }
}
