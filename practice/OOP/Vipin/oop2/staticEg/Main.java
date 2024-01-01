public class Main {
    public static void main(String[] args) {
        Human vipin = new Human(22, "Vipin", 1000, false);
        Human tushar = new Human(23, "Tushar", 1000, false);

        System.out.println(vipin.population); // check if population in vipin if not than use the class name
        System.out.println(Human.population); // we can use that without making an object of the class

    }

    // func dont depend on the instance
    static void fun() {
        // gretting can't be used it depend on an object
        // greeting();

        // Make one object so non static function can run
        Main object = new Main(); // we can use it in main because its the function where it will be run in the
                                  // end
        object.greeting();
    }

    // gretting depend on an instance
    void greeting() {
        // fun can be used here it doesn't depend on an object
        fun();
        System.out.println("Hello");
    }
}