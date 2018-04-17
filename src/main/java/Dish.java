
public class Dish {

    private int orderId;
    private int quantity;
    private MenuItem menuItem;
    private Table table;

    public Dish(int orderId, int quantity, MenuItem menuItem, Table table){
        this.quantity = quantity;
        this.menuItem = menuItem;
        this.table = table;
        this.orderId = orderId;

    }
}
