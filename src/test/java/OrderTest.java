import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    Order order1;
    Table table1;

    @Before
    public void before() {
        order1 = new Order(3, MenuItem.LATTE);
        table1 = new Table(3);
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

    @Test
    public void hasTable() {
        assertEquals(null, order1.getTable());
    }

    @Test
    public void canSetTable() {
        order1.setTable(table1);
        assertEquals(3, order1.getTable().getTableNumber());
    }





}
