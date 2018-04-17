public class Table {

    private int tableNumber;
    private Customer customer;

    public Table(int tableNumber){
        this.tableNumber = tableNumber;
        this.customer = null;
    }

    public int getTableNumber(){
        return this.tableNumber;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public void addCustomer(Customer customer){
        this.customer = customer;
    }


}
