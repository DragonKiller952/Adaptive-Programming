import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StapTest {
    Stap stap1;

    @BeforeEach
    void setUp() {
        Node nodeB = new Node("B");
        stap1 = new Stap(10, nodeB);
    }

    @Test
    void getAfstand() {
        assertEquals(10,stap1.getAfstand(), "It has to be 10");
    }

    @Test
    void getBestemming() {
        assertEquals("B, []",stap1.getBestemming().toString(), "It has to be B, []");
    }
}