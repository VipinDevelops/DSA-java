public class StaticInt {
    static int a = 4;
    static int b;

    static {
        System.out.println("Static Block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        
    
    }
}