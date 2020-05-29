import java.util.ArrayList;
import java.util.PriorityQueue;

public class Kaart {
    private ArrayList<Node> nodes = new ArrayList<>();
    private PriorityQueue<Node> unsettled = new PriorityQueue<>();

    public void addNode(Node node){
        nodes.add(node);
    }

    public void Dijkstra(Node node){
        node.setDistance(0);
        this.unsettled.add(node);
        while(unsettled.peek()!=null){
            Node current = unsettled.poll();
            for(Stap step:current.getAanliggendeNodes()){
                unsettled.add(step.getBestemming());
                if(current.getDistance()+step.getAfstand()<step.getBestemming().getDistance()){
                    step.getBestemming().setDistance(current.getDistance()+step.getAfstand());
                    step.getBestemming().setShortestPath(current.getShortestPath()+current.getName());
                }
            }
        }
    }

    @Override
    public String toString() {
        return ""+nodes;
    }
    public String getShortestPath(Node node){
        return "Path: "+node.getShortestPath()+node.getName()+", length: "+node.getDistance();
    }
}
