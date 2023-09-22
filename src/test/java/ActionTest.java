import org.junit.jupiter.api.Test;

import org.example.TestClass;

import static org.junit.jupiter.api.Assertions.*;

public class ActionTest {
    @Test
    public void test() {
        assertTrue(TestClass.test());
    }

    @Test
    public void test2() {
        assertFalse(TestClass.test2());
    }

    @Test
    public void test3() {
        assertTrue(TestClass.test2());
    }

    @Test
    public void test4() {
        assertEquals(TestClass.test3(4),4);
    }

    @Test
    public void test5() {
        assertEquals(TestClass.test3(4),3);
    }
}
