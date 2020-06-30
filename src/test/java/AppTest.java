import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void factorial() {
        assertEquals(1, App.factorial1(0), "0! = 1");
    }
}