package Tests;

import Code.Kaart;
import Code.Node;
import Code.Stap;
import Code.Vlucht;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    Node nodeA;
    Node nodeB;
    Node nodeC;
    Node nodeD;
    Node nodeE;
    Node nodeF;

    @BeforeEach
    void setUp() {
        nodeA = new Node("A");
        nodeB = new Node("B");
        nodeC = new Node("C");
        nodeD = new Node("D");
        nodeE = new Node("E");
        nodeF = new Node("F");

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

        k1.Dijkstra(nodeA);
    }

    @Test
    void getShortestPath() {
        assertEquals("ABD",nodeE.getShortestPath(), "It has to be ABD");
    }

    @Test
    void getDistance() {
        assertEquals(24,nodeE.getDistance(), "It has to be 24");
    }

    @Test
    void getName() {
        assertEquals("E",nodeE.getName(), "It has to be E");
    }

    @Test
    void getAanliggendeNodes() {
        assertEquals("[(10, B), (15, C)]",nodeA.getAanliggendeNodes().toString(), "It has to be [(10, B), (15, C)]");
    }
}