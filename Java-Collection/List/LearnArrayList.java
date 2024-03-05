import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        // ArrayList<String> studentName = new ArrayList<>();
        // studentName.add("Vipin");
        // studentName.add("Chaudhary");

        // System.out.println(studentName.toString());

        // ------ Other feature of arraylist
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // list.add(1, 50);
        // System.out.println(list);

        // List<Integer> newList = new ArrayList();
        // newList.add(150);
        // newList.add(160);

        // ------- addAll
        // list.addAll(newList);
        // System.out.println(list.toString());

        // -------- get
        // System.out.println(list.get(1));

        // ------- remove value or index
        // list.remove(0); /// remove using index
        // list.remove(Integer.valueOf(3)); //remove using value
        // list.clear();// clear the list

        // --- update vlaues
        // list.set(1, 1000);

        // ---- Contains
        // System.out.println(list.contains(3));

        // ---- iterating the list

        // for loop
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println("The element is " + list.get(i));
        // }

        // // for each
        // for (int element : list) {
        //     System.out.println("The element is " + element);
        // }

        // Iterator<Integer> it = list.iterator();
        // while (it.hasNext()) {
        //     System.out.println("Iterator " + it.next());
        // }

        // System.out.println(list);

    }
}