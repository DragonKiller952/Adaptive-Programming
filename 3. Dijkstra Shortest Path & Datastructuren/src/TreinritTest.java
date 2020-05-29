import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreinritTest {
    Treinrit treinrit1;

    @BeforeEach
    void setUp() {
        Node nodeB = new Node("B");
        treinrit1 = new Treinrit(10, nodeB);
    }

    @Test
    void getAfstand() {
        assertEquals(10,treinrit1.getAfstand(), "It has to be 10");
    }

    @Test
    void getBestemming() {
        assertEquals("B, []",treinrit1.getBestemming().toString(), "It has to be B, []");
    }
}