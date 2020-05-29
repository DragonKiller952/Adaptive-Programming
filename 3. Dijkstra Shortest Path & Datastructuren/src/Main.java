public class Main {
    public static void main(String[] program){
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        Stap stap1 = new Stap(10, nodeB);
        Stap stap2 = new Stap(15, nodeC);
        Stap stap3 = new Stap(12, nodeD);
        Stap stap4 = new Stap(10, nodeE);
        Stap stap5 = new Stap(2, nodeE);
        Stap stap6 = new Stap(15, nodeF);
        Stap stap7 = new Stap(1, nodeF);
        Vlucht stap8 = new Vlucht(5, nodeE);

        nodeA.addStap(stap1);
        nodeA.addStap(stap2);
        nodeB.addStap(stap3);
        nodeC.addStap(stap4);
        nodeD.addStap(stap5);
        nodeB.addStap(stap6);
        nodeD.addStap(stap7);
        nodeF.addStap(stap8);

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
