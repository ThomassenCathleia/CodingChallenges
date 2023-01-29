package codewars.kyu8.vowelremover;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class KataTest {
    @Test
    void test1() {
        assertEquals("hll", Kata.shortcut("hello"));
        assertEquals("hw r y tdy?", Kata.shortcut("how are you today?"));
        assertEquals("cmpln", Kata.shortcut("complain"));
        assertEquals("nvr", Kata.shortcut("never"));
    }
}
