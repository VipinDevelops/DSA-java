class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // Static is something belong to class not to object
    // Static is something same for all the human

    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

 
}