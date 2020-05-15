import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {

    @Test
    void run() {
        Node s0 = new Node("s0", false);
        Node s1 = new Node("s1", false);
        Node s2 = new Node("s2", false);
        Node s3 = new Node("s3", true);

        s0.addNode("A", s2);
        s0.addNode("B", s1);
        s1.addNode("A", s1);
        s1.addNode("B", s2);
        s2.addNode("B", s3);
        s3.addNode("A", s3);
        s3.addNode("B", s0);

        FSM fsm = new FSM();
        fsm.setProgram(new String[]{"A", "B", "B", "A"}); //set the program
        fsm.setCurrentNode(s0); //Set the startnode
        fsm.run(); //run the program

        assertEquals("FSM([A, B, B, A] = [s0, s2, s3])", fsm.toString(),
                "Moet Node FSM([A, B, B, A] = [s0, s2, s3]) zijn");
    }
}