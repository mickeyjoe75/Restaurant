public class Customer {

    private String name;
    private double wallet;
    private Table table;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.table = null;
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
        Order order = new Order(1, MenuItem.LETTUCE);
        order.setTable(this.table);
        return order;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

}
