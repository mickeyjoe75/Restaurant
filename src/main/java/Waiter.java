import java.util.ArrayList;

public class Waiter {

    private String name;
    private double bumBagCash;
    private ArrayList<Order> notepad;

    public Waiter(String name, double bumBagCash){
        this.name = name;
        this.bumBagCash = bumBagCash;
        this.notepad = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getBumBagCash() {
       return bumBagCash;
  }

    public ArrayList<Order> getNotepad() {
        return this.notepad;
    }

    public void takeOrder(Order order) {
        notepad.add(order);
    }

    public void takeOrder(Customer customer){
        notepad.add(customer.placeOrder());
    }
}
