public class Node {
    private  String name;
    private Node nodeA;
    private Node nodeB;
    private boolean endnote;

    public Node(String name){
        this.name = name;
        this.endnote = false;
        nodeA = null;
        nodeB = null;
    }

    public void setNodeA(Node nodeA) {
        this.nodeA = nodeA;
    }

    public void setNodeB(Node nodeB) {
        this.nodeB = nodeB;
    }

    public Node verwerkInput(String s){
        switch(s) {
            case "A":
                if (nodeA == null) {
                    System.out.println("ERROR; Node overgang " +s+ " bestaat niet voor node " + this);
                }
                return nodeA;

            case "B":
                if (nodeB == null) {
                    System.out.println("ERROR; Node overgang " +s+ " bestaat niet voor node " + this);
                }
                return nodeB;
            default:
                System.out.println("ERROR; Programma stap "+s+" not supported by this program");
                return null; // Node state is no supported stay in the same state

        }
    }

    public boolean getEndnote() {
        return endnote;
    }

    @Override
    public String toString() {
        return name;
    }
}
