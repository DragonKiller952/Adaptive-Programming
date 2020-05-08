import java.util.ArrayList;
import java.util.Arrays;

public class FSM {
    private String[] program;
    private ArrayList<Node> nodes;
    Node currentNode;

    public FSM() {
        this.program = new String[0];
        this.nodes = new ArrayList<Node>();
    }

    public void run(){
        nodes.add(currentNode);

        for (String step:program) {
            if (currentNode.getEndnote()) {
                break;
            }
            currentNode = currentNode.verwerkInput(step);
            if (currentNode == null) {
                break; //Stop the program
            }
            nodes.add(currentNode);
        };
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    public void setProgram(String[] aProgam){
        program = aProgam;
    }

    @Override
    public String toString() {
        return "f(" + Arrays.toString(program).toString() +
                ") = " + nodes;
    }
}