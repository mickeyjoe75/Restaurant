import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    Order order1;

    @Before
    public void before() {
        order1 = new Order(3, MenuItem.LATTE);
    }

//    @Test
//    public void hasOrderId(){
//        assertEquals(7, order1.getOrderId());
//    }

    @Test
    public void hasQuantity(){
        assertEquals(3, order1.getQuantity());
    }

     @Test
    public void hasMenuItem(){
        assertEquals(MenuItem.LATTE, order1.getMenuItem());
    }





}
