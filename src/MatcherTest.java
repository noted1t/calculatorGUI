import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatcherTest {
    @Test
    public void test () {
        Matcher forTest1 = new Matcher();
        assertEquals(4, forTest1.mathSolver("2 + 2"));
        assertEquals(8, forTest1.mathSolver("2 * 4"));
        assertNotEquals(4, forTest1.mathSolver("2 * 4"));

    }

}