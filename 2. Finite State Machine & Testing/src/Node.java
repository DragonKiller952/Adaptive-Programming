import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;

public class Node {
    private  String name;
    private HashMap<String, Node> nodes;
    private boolean endnote;
    private static final Random generator = new Random();

    public Node(String name, boolean endnote){
        this.name = name;
        this.endnote = endnote;
        this.nodes = new HashMap<String, Node>();

    }

    public void addNode(String key, Node node) {
        nodes.put(key, node);
    }

    public Node verwerkInput(String s){
        if(nodes.containsKey(s)){
            return nodes.get(s);
        }
        else {
            System.out.println("ERROR; Programma stap " + s + " not supported by node " + this.name);
            return null; // Node state is no supported stay in the same state
        }
    }

    public Node nextNode(){
        ArrayList<Node> myArrayList = new ArrayList<Node>(nodes.values());
        int random = getRandomInRange(0, myArrayList.size()-1);
        return myArrayList.get(random);
    }

    public static int getRandomInRange(int start, int end) {
        return start + generator.nextInt(end - start + 1);
    }

    public boolean getEndnote() {
        return endnote;
    }

    @Override
    public String toString() {
        return name;
    }
}
