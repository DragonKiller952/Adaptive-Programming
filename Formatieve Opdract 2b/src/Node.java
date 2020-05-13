import java.util.ArrayList;
import java.util.Random;

public class Node {
    private  String name;
    private ArrayList<Node> nodes;
    private boolean endnote;
    private static final Random generator = new Random();

    public Node(String name, boolean endnote){
        this.name = name;
        this.endnote = endnote;
        this.nodes = new ArrayList<Node>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public Node nextNode(){
        int random = getRandomInRange(0, nodes.size()-1);
        return this.nodes.get(random);
    }

    public static int getRandomInRange(int start, int end) {
        return start + generator.nextInt(end - start + 1);
    };

    public boolean getEndnote() {
        return endnote;
    }

    @Override
    public String toString() {
        return name;
    }
}
