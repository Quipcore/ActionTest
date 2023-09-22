import org.example.TestClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SecondSetOfTest {
    @Test
    public void test() {
        assertTrue(TestClass.test());
    }

    @Test
    public void test2() {
        assertFalse(TestClass.test2());
    }
}
