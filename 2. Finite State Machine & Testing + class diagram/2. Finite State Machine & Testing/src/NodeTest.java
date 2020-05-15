import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {
    @Test
    public void addNode() {
        Node s1 = new Node("S1", false);
        Node s2 = new Node("S2", false);
        s1.addNode("a",s2);
        assertEquals(s2, s1.verwerkInput("a"), "Moet Node S2 zijn");
    }

    @Test
    public void verwerkInput() {
        Node s1 = new Node("S1", false);
        Node s2 = new Node("S2", false);
        s1.addNode("a",s2);
        assertNull(s1.verwerkInput("b"), "Moet null zijn");
    }

    @Test
    public void nextNode() {
        Node s1 = new Node("S1", false);
        Node s2 = new Node("S2", true);
        s1.addNode("a",s2);
        assertEquals(s2, s1.nextNode(), "Moet S2 zijn");
    }

    @Test
    public void getEndnote() {
        Node s1 = new Node("S1", false);
        assertFalse(s1.getEndnote(), "Moet false zijn");
    }
}