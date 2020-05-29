import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VluchtTest {
    Vlucht vlucht1;

    @BeforeEach
    void setUp() {
        Node nodeB = new Node("B");
        vlucht1 = new Vlucht(10, nodeB);
    }

    @Test
    void getAfstand() {
        assertEquals(10,vlucht1.getAfstand(), "It has to be 10");
    }

    @Test
    void getBestemming() {
        assertEquals("B, []",vlucht1.getBestemming().toString(), "It has to be B, []");
    }
}