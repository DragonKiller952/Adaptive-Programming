import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DTMCTest {

    @Test
    void run() {
        //Create nodes
        Node s0 = new Node("s0", false);
        Node s1 = new Node("s1", false);
        Node s2 = new Node("s2", false);
        Node s3 = new Node("s3", true);

        //Connect all the nodes
        s0.addNode("A", s1);
        s1.addNode("A", s2);
        s2.addNode("A", s3);

        DTMC dtmc = new DTMC();
        dtmc.setCurrentNode(s0); //Set the startnode
        dtmc.run();
        assertEquals("DTMC([s0, s1, s2, s3])", dtmc.toString(),
                "Moet Node DTMC([s0, s1, s2, s3]) zijn");
    }
}