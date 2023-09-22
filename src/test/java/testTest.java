import org.junit.jupiter.api.Test;

import org.example.TestClass;

import static org.junit.jupiter.api.Assertions.*;

public class testTest {
    @Test
    public void test() {
        assertTrue(TestClass.test());
    }

    @Test
    public void test2() {
        assertFalse(TestClass.test2());
    }
}
