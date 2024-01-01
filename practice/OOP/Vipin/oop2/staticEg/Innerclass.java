// Inner classes can't not be static
public class Innerclass {
    class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test('Vipin');
        Test b = nwe Test("Tushar");
    }

}
