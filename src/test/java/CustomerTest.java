import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    private Customer customer1;
    private Table table1;

    @Before
    public void before(){
        customer1 = new Customer("Bob", 100.00);
        table1 = new Table(1);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", customer1.getName());
    }

    @Test
    public void hasWallet(){
        assertEquals(100.00, customer1.getWallet(), 0.01);
    }

    @Test
    public void canPay(){
        customer1.pay(10d);
        assertEquals(90d, customer1.getWallet());
    }

    @Test
    public void canOrderItem(){
        Order orderToCheck = customer1.placeOrder();
        assertEquals(MenuItem.LETTUCE, orderToCheck.getMenuItem());
    }

    @Test
    public void hasTable() {
        assertEquals(null, customer1.getTable());
    }

    @Test
    public void canSetTable() {
        customer1.setTable(table1);
        assertEquals(1, customer1.getTable().getTableNumber());
    }

    @Test
    public void customerPassesTableToOrder() {
        table1.addCustomer(customer1);
        Order order1 = customer1.placeOrder();
        assertEquals(1, order1.getTable().getTableNumber());
    }



}
