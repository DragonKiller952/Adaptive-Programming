import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        String [] myStrings  = new String[]{"z","a","c","b"};

        // sort een arraylist van strings met bubblesort
        BubbleSort al = new BubbleSort();
        ArrayList<String> ar= new ArrayList<String>(Arrays.asList(myStrings));
        System.out.println(al.sort(ar));

        // sort een linkedlist van strings met bubblesort
        BubbleSort ll = new BubbleSort();
        LinkedList<String> li = new LinkedList<String>(Arrays.asList(myStrings));
        System.out.println(ll.sort2(li));

        // sort een hashmap van strings met bubblesort
        BubbleSort hm = new BubbleSort();
        HashMap<String, String> ha = new HashMap<String, String>();
        ha.put("z", "z");
        ha.put("a", "a");
        ha.put("c", "c");
        ha.put("b", "b");
        System.out.println(hm.sort3(ha));

        int[] myInts  = new int[]{4, 1, 3, 2};

        // sort een arraylist van objects met bubblesort
        ArrayList<Comparable> arI= new ArrayList<Comparable>();
        arI.add(new Integer(4));
        arI.add(new Integer(1));
        arI.add(new Integer(3));
        arI.add(new Integer(2));

        BubbleSort alI = new BubbleSort();
        System.out.println(alI.sort4(arI));

    }
}
