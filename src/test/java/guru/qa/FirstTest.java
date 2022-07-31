package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void firstTest() {
        Assertions.assertTrue(100 < 200);
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(1000 < 2000);
    }
}
