import java.util.Random;

public class Order {

    private int orderId;
    private int quantity;
    private MenuItem menuItem;

    public Order(int quantity, MenuItem menuItem){
        // Create a random object and assign it to the orderID
        Random rand = new Random();
        this.orderId = rand.nextInt(9999);
        // Assign values from creator
        this.quantity = quantity;
        this.menuItem = menuItem;

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

}
