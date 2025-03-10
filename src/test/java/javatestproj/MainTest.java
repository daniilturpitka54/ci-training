package javatestproj;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testAdd(){
        Main main = new Main();
        assertEquals(7, main.add(3,4), "3+4 should be 7");
    }

    @Test
    void testSquare(){
        Main main = new Main();
        assertTrue(main.square(-7)==49, "-7^2 should be 49");
    }
    
}
