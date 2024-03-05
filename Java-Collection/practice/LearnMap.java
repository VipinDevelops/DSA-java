import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class LearnMap{
    public static void main(String[] args){
        // Map<String,Integer> numbers = new HashMap<>(); // O(1)


        // use a Tree internally and keep the elements sorted
        //sorted on base of alaphabtic order of the key in this case 
        Map<String,Integer> numbers = new TreeMap<>(); // O(log n)


        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);

        // numbers.remove("Three");//remove using a key

        System.out.println(numbers);
        
        // if we try to put again with same key value it will override
        // numbers.put("Two",22);

        // add check before putting 
        if(!numbers.containsKey("Two")){
            numbers.put("Two",23);
        }


        // other method to add a check 
        numbers.putIfAbsent("Two",23);


        // Iterate in map
        // for(Map.Entry<String,Integer> e: numbers.entrySet()){
        //     System.out.println(e + " Entry");
        //     System.out.println(e.getKey() + " Key");
        //     System.out.println(e.getValue()+ " Value");
        // }

        // Iterate just key
        // for(String key:numbers.keySet()){
        // System.out.println(key + " Key");
        // }

        //  // Iterate just value
        // for(Integer value:numbers.values()){
        // System.out.println(value+ " Value");
        // }

         // Contains value
        System.out.println(numbers.containsValue(2));
        
        // Check is empty
        System.out.println(numbers.isEmpty());


        System.out.println(numbers);

        }
}