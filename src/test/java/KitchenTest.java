import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KitchenTest {
    private Kitchen kitchen1;
    private Waiter waiter1;
    private Order order1;
    private Order order2;
    @Before
    public void before() {
        kitchen1 = new Kitchen();
        waiter1 = new Waiter("Jaime", 200.0);
        order1 = new Order(1, MenuItem.LASAGNE);
        order2 = new Order(2, MenuItem.LATTE);
    }
    @Test
    public void hasOrdersToCook() {
        assertEquals(0, kitchen1.getOrdersToCook().size());
    }
    @Test
    public void hasDishesToServe() {
        assertEquals(0, kitchen1.getDishesToServe().size());
    }
    @Test
    public void canReceiveOrdersToCook() {
        waiter1.takeOrder(order1);
        waiter1.takeOrder(order2);
        kitchen1.receiveOrdersToCook(waiter1);
        assertEquals(2, kitchen1.getOrdersToCook().size());
    }
    @Test
    public void canCookOrders() {
        waiter1.takeOrder(order1);
        waiter1.takeOrder(order2);
        kitchen1.receiveOrdersToCook(waiter1);
        kitchen1.cookOrders();
        assertEquals(0,kitchen1.getOrdersToCook().size());
        assertEquals(2,kitchen1.getDishesToServe().size());

    }





}
