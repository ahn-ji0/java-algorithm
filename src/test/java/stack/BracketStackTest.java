package stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BracketStackTest {
    @Test
    @DisplayName("bracket test")

    void bracket() {
        BracketStack bs = new BracketStack();
        assertTrue(bs.solution("()()"));
        assertTrue(bs.solution("(())()"));
        assertFalse(bs.solution(")()("));
        assertFalse(bs.solution("(()("));

    }

}