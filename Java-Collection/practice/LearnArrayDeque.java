 import java.util.ArrayDeque;
 public class LearnArrayDeque{
    public static void main(String[] args){
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        
        adq.offer(23);// add element in queue
        adq.offerFirst(12);// add element in first of queue
        adq.offerLast(45);// add element in last of queue
        adq.offer(26);


        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll()"+ adq);

         System.out.println(adq.pollFirst());
        System.out.println("pollFirst()"+ adq);
        
         System.out.println(adq.pollLast());
        System.out.println("pollpollLast()"+ adq);
        

    


        
        



    }
 }
