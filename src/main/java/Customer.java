public class Customer {

    private String name;
    private double wallet;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public String getName(){
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }

    public void pay(double cost){
        wallet -= cost;
    }

    public Order placeOrder(){
        Order order = new Order(1, 1, MenuItem.LETTUCE);
        return order;
    }

}
