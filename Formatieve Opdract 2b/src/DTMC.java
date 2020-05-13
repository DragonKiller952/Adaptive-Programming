public class DTMC {
    Node currentNode;

    public DTMC() {
    }

    public Node run(){
        while (true) {
            if (currentNode.getEndnote()) {
                return currentNode;
            }
            currentNode = currentNode.nextNode();
        }
    }
    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }
}

