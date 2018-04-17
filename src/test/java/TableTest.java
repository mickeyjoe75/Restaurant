import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TableTest {

    private Table table;
    private Customer customer;

    @Before
    public void before(){
        table = new Table(1);
        customer = new Customer("Joe", 50.0);
    }


    @Test
    public void canGetTableNumber(){
        assertEquals(1, table.getTableNumber());
    }

    @Test
    public void canGetCustomer(){
        assertEquals(null, table.getCustomer());
    }

    @Test
    public void canAddCustomer(){
        table.addCustomer(customer);
        assertEquals("Joe", table.getCustomer().getName());
        assertEquals(1, table.getCustomer().getTable().getTableNumber());
        assertEquals(1, customer.getTable().getTableNumber());
    }





}
