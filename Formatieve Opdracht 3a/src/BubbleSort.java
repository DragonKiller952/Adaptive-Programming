//import java.util.ArrayList;
//
//public class AreeList extends ArrayList {
//
//    public void bubblesort() {
//        this.swap()
//    }
//}




import java.util.*;

public class BubbleSort {
    private boolean solved = false;
    private ArrayList<String> list;
    private LinkedList<String> list2;
    private HashMap<String, String> list3;
    private ArrayList<Comparable> list4;

    public BubbleSort(){
        this.list = new ArrayList<String>();
        this.list2 = new LinkedList<String>();
        this.list3 = new HashMap<String, String>();
        this.list4 = new ArrayList<Comparable>();
    }

    public ArrayList<String> sort(ArrayList<String> lijst){// sort een arraylist van strings met bubblesort
        this.list = lijst;
        while(!solved){
            this.solved = true;
            for(int i = 0; i < list.size()-1; i++){
                if(list.get(i).compareTo(list.get(i+1)) > 0){
                    Collections.swap(list, i, i+1);
                    this.solved = false;
                }
            }
        }
        return this.list;
    }

    public LinkedList<String> sort2(LinkedList<String> lijst){// sort een linkedlist van strings met bubblesort
        this.list2 = lijst;
        while(!solved){
            this.solved = true;
            for(int i = 0; i < list2.size()-1; i++){
                if(list2.get(i).compareTo(list2.get(i+1)) > 0){
                    Collections.swap(list2, i, i+1);
                    this.solved = false;
                }

            }
        }
        return this.list2;
    }

    public HashMap<String, String> sort3(HashMap<String, String> lijst){// sort een hashmap van strings met bubblesort
        this.list.addAll(lijst.keySet());
        while(!solved){
            this.solved = true;
            for(int i = 0; i < list.size()-1; i++){
                if(list.get(i).compareTo(list.get(i+1)) > 0){
                    Collections.swap(list, i, i+1);
                    this.solved = false;
                }
            }
        }
        for(int i = 0; i < list.size(); i++){
            this.list3.put(list.get(i), lijst.get(list.get(i)));
        }

        return this.list3;
    }

    public ArrayList<Comparable> sort4(ArrayList<Comparable> lijst){// sort een arraylist van objects met bubblesort
        this.list4 = lijst;
        while(!solved){
            this.solved = true;

            for(int i = 0; i < list4.size()-1; i++){
                if(list4.get(i).compareTo(list4.get(i+1)) > 0){
                    Collections.swap(list4, i, i+1);
                    this.solved = false;
                }
            }
        }
        return this.list4;
    }
}
