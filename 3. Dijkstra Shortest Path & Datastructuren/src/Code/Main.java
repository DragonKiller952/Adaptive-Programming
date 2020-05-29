package Code;

import Code.Kaart;
import Code.Node;

public class Main {
    public static void main(String[] program){
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        Rit rit1 = new Rit(10, nodeB);
        Rit rit2 = new Rit(15, nodeC);
        Rit rit3 = new Rit(12, nodeD);
        Rit rit4 = new Rit(10, nodeE);
        Rit rit5 = new Rit(2, nodeE);
        Rit rit6 = new Rit(15, nodeF);
        Rit rit7 = new Rit(1, nodeF);
        Rit rit8 = new Rit(5, nodeE);

        nodeA.addStap(rit1);
        nodeA.addStap(rit2);
        nodeB.addStap(rit3);
        nodeC.addStap(rit4);
        nodeD.addStap(rit5);
        nodeB.addStap(rit6);
        nodeD.addStap(rit7);
        nodeF.addStap(rit8);

        Kaart k1 = new Kaart();
        k1.addNode(nodeA);
        k1.addNode(nodeB);
        k1.addNode(nodeC);
        k1.addNode(nodeD);
        k1.addNode(nodeE);
        k1.addNode(nodeF);

        System.out.println(k1);
        k1.Dijkstra(nodeA);
        System.out.println(k1.getShortestPath(nodeE));
    }
}
