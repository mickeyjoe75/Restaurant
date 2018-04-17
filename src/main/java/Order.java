import java.util.Random;

public class Order {

    private int orderId;
    private int quantity;
    private MenuItem menuItem;
    private Table table;

    public Order(int quantity, MenuItem menuItem){
        // Create a random object and assign it to the orderID
        Random rand = new Random();
        this.orderId = rand.nextInt(9999);
        // Assign values from creator
        this.quantity = quantity;
        this.menuItem = menuItem;
        this.table = null;

    }

    public int getOrderId(){
        return this.orderId;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public MenuItem getMenuItem(){
        return this.menuItem;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
}
