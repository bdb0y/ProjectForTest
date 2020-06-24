import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void factorial() {
        assertEquals(0, App.factorial(0), "0! = 1");
    }
}