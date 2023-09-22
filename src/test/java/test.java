import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.TestClass;

public class test {
    @Test
    public void test() {
        assertEquals(TestClass.test(), true);
    }

    @Test
    public void test2() {
        assertEquals(TestClass.test2(), true);
    }
}
