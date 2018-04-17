import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    private Customer customer1;

    @Before
    public void before(){
        customer1 = new Customer("Bob", 100.00);
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

}
