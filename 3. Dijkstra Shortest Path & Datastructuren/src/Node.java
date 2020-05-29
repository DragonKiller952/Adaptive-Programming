import java.util.ArrayList;

public class Node implements Comparable{
    private String name;
    private String shortestPath;
    private Integer distance = Integer.MAX_VALUE;
    ArrayList<Stap> aanliggendeNodes = new ArrayList<>();

    public Node(String name){
        this.name = name;
        this.shortestPath = "";
    }

    public void addStap(Stap stap) {
        aanliggendeNodes.add(stap);
    }

    public String getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(String shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Stap> getAanliggendeNodes() {
        return aanliggendeNodes;
    }

    @Override
    public String toString() {
        return ""+name +", "+ aanliggendeNodes;
    }

    @Override
    public int compareTo(Object o) {
        Node n = (Node) o;
        return this.distance.compareTo(n.getDistance());
    }
}
