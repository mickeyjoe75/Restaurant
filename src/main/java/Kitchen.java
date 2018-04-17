import java.util.ArrayList;

public class Kitchen {
    private ArrayList<Order> ordersToCook;
    private ArrayList<Dish> dishesToServe;

    public Kitchen() {
        this.ordersToCook = new ArrayList<>();
        this.dishesToServe = new ArrayList<>();
    }

    public ArrayList<Order> getOrdersToCook() {
        return ordersToCook;
    }

    public ArrayList<Dish> getDishesToServe() {
        return dishesToServe;
    }

    public void receiveOrdersToCook(Waiter waiter) {
        ordersToCook = waiter.passOrders();
    }


}
