import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaiterTest {

    private Waiter waiter1;

    @Before
    public void before() {
        waiter1 = new Waiter("Todd", 100.00);
    }

    @Test
    public void hasName() {
        assertEquals("Todd", waiter1.getName());
    }

    @Test
    public void hasBumBagCash() {
        assertEquals(100d, waiter1.getBumBagCash(), 0.01);
    }

}