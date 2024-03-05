import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // offer new element to the queue // add (add will crash the app)
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        // pop // remove (remove will crash the app)
        System.out.println(queue.poll());

        // peek // element (element will crash the app)
        System.out.println(queue.peek());

        


    }   
}
