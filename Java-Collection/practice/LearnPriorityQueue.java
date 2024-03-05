import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min Heap 
        
        // Queue<Integer> pq = new PriorityQueue<>(); // this will work as well

        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// Max Heap


        // By default it give priority to the smallest (MIN heap), it does the heapify
        // we can use all the queue functions 
        pq.offer(40);
        pq.offer(12);
        pq.offer(25);
        pq.offer(36);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);
        System.out.println(pq.peek());
        
    }
}
