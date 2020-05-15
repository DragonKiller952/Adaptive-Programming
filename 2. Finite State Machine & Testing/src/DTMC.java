import java.util.ArrayList;
import java.util.Arrays;

public class DTMC {
    private Node currentNode;
    private ArrayList<Node> nodes;

    public DTMC() {
        this.nodes = new ArrayList<Node>();
    }

    public void run(){
        while (true) {
            nodes.add(currentNode);
            if (currentNode.getEndnote()) {
                break;
            }
            currentNode = currentNode.nextNode();
        }
    }
    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    @Override
    public String toString() {
        return "DTMC(" +nodes+")";
    }
}
