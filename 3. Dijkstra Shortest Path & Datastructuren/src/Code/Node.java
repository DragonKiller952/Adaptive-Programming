package Code;

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

    public void addStap(Stap stap) {//voegt een verbinding toe aan de node
        aanliggendeNodes.add(stap);
    }

    public String getShortestPath() {//geeft het shortest path terug
        return shortestPath;
    }

    public void setShortestPath(String shortestPath) {//set het shortest path
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {// haalt de afstand van het shortest path op
        return distance;
    }

    public void setDistance(Integer distance) {//stelt de afstand van het shortest path in
        this.distance = distance;
    }

    public String getName() {//haalt de naam van de node op
        return name;
    }

    public ArrayList<Stap> getAanliggendeNodes() {//haalt alle verbindingen die de node heeft op, inclusief de afstanden ernaartoe
        return aanliggendeNodes;
    }

    @Override
    public String toString() {
        return ""+name +", "+ aanliggendeNodes;
    }

    @Override
    public int compareTo(Object o) {//compareTo voor de kaart om nodes met elkaar te vergelijken
        Node n = (Node) o;
        return this.distance.compareTo(n.getDistance());
    }
}
