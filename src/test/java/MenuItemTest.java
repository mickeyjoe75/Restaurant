import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuItemTest {

    @Test
    public void has5Items(){
        assertEquals(5,MenuItem.values().length);
    }

    @Test
    public void hasDescription(){
        assertEquals("Garfield's favourite.", MenuItem.LASAGNE.getDescription());
    }

    @Test
    public void hasName(){
        assertEquals("Lasagne", MenuItem.LASAGNE.getName());
    }

    @Test
    public void hasValue(){
        assertEquals(7.00, MenuItem.LASAGNE.getValue(), 0.001);
    }
}
