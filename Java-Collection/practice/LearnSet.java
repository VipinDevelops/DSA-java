import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LearnSet{
    public static void main(String[] args){
        // Set dont have defined order 
        // we can't put a element twice in set 
        // Set<Integer> set = new HashSet<>(); // work in O(1)

        // will  follow property of linkedlist 
        // it will have proper order in set , order how we put 
        // Set<Integer> set = new LinkedHashSet<>();

        //will follow property of binray tree
        // it will keep the element sorted in the set
        Set<Integer> set = new TreeSet<>(); // work in O(log n)


        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);

        // it will not add these
        set.add(2);
        set.add(2);

        // remove 
        set.remove(2);

        // contains
        System.out.println(set.contains(32));

        // is empty
        System.out.println(set.isEmpty());

        // clear 
        set.clear();

        System.out.println(set);
    }
}