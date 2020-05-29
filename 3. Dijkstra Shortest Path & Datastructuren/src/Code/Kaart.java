package Code;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Kaart {
    private ArrayList<Node> nodes = new ArrayList<>();
    private PriorityQueue<Node> unsettled = new PriorityQueue<>();

    public void addNode(Node node){
        nodes.add(node);
    }//voegt een node toe aan de kaart

    public void Dijkstra(Node node){//voert dijsktra's algoritme uit op de gehele kaart vanaf de beginnode,
        // en slaat deze data bij de nodes op
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
    public String getShortestPath(Node node){//een toString voor het shortest path van een node op de kaart inclusief de eigen naam
        return "Path: "+node.getShortestPath()+node.getName()+", length: "+node.getDistance();
    }
}
