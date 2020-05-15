import java.util.ArrayList;
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

    public void addNode(String key, Node node) {// adds a path to another node
        nodes.put(key, node);
    }

    public Node verwerkInput(String s){// gives the node based on the path
        if(nodes.containsKey(s)){
            return nodes.get(s);
        }
        else {
            System.out.println("ERROR; Programma stap " + s + " not supported by node " + this.name);
            return null; // Node state is no supported stay in the same state
        }
    }

    public Node nextNode(){//selects a random node that the current node is connected to
        ArrayList<Node> myArrayList = new ArrayList<Node>(nodes.values());
        int random = getRandomInRange(0, myArrayList.size()-1);
        return myArrayList.get(random);
    }

    public static int getRandomInRange(int start, int end) {//gives a random int in the length of the nodes list
        return start + generator.nextInt(end - start + 1);
    }

    public boolean getEndnote() {// gives if the node is a ending node
        return endnote;
    }

    @Override
    public String toString() {
        return name;
    }
}
