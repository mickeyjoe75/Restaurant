import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaiterTest {

    private Waiter waiter1;
    private Order order1;
    private Customer customer1;


    @Before
    public void before() {
        waiter1 = new Waiter("Todd", 100.00);
        order1 = new Order(1, MenuItem.LASAGNE);
        customer1 = new Customer("Claire", 2000.00);

    }

    @Test
    public void hasName() {
        assertEquals("Todd", waiter1.getName());
    }

    @Test
    public void hasBumBagCash() {
        assertEquals(100d, waiter1.getBumBagCash(), 0.01);
    }

    @Test
    public void waiterHasNotePad() {
        assertEquals(0,waiter1.getNotepad().size());
    }

    @Test
    public void canTakeOrder() {
        waiter1.takeOrder(order1);
        assertEquals(1,waiter1.getNotepad().size());
    }

    @Test
    public void canTakeOrderFromCustomer(){
        waiter1.takeOrder(customer1);
        assertEquals(1, waiter1.getNotepad().size());
//        Comparing the order1 object with known class Order against the first item in the Notepad ArrayList<Order>.
        assertEquals(order1.getClass(), waiter1.getNotepad().get(0).getClass());
    }

    @Test
    public void canPassOrders() {
        waiter1.takeOrder(order1);
        assertEquals(1, waiter1.passOrders().size());
        assertEquals(0, waiter1.getNotepad().size());

    }




}