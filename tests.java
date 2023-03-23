import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals(1, solution.calculatePascalLayerTotal (0));
    }

    @Test
    public void test2()
    {
        Solution solution = new Solution();

        assertEquals(2, solution.calculatePascalLayerTotal (1));
    }
}
