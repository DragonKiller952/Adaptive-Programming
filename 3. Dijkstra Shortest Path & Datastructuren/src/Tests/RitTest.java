package Tests;

import Code.Node;
import Code.Rit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RitTest {
    Rit rit1;

    @BeforeEach
    void setUp() {
        Node nodeB = new Node("B");
        rit1 = new Rit(10, nodeB);
    }

    @Test
    void getAfstand() {
        assertEquals(10,rit1.getAfstand(), "It has to be 10");
    }

    @Test
    void getBestemming() {
        assertEquals("B, []",rit1.getBestemming().toString(), "It has to be B, []");
    }
}