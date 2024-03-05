import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        // Push in the stack
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Hourse");
        animals.push("Cat");
        
        System.out.println(animals.toString());

        // Check the top of the stack
        System.out.println(animals.peek());

        // Pop from the stack
        animals.pop();
        System.out.println(animals);
    }
}
