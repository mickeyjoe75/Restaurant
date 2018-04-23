import java.util.ArrayList;

public class implements IServable Kitchen {
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

    public void cookOrders() {
        for (Order order : ordersToCook
             ) {
            dishesToServe.add(new Dish(
                    order.getOrderId(),
                    order.getQuantity(),
                    order.getMenuItem(),
                    order.getTable()
            ));
        }
        ordersToCook.clear();
    }




}
