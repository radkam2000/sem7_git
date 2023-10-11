import java.util.List;
import java.util.Random;


public class Order {
    private int itemQuantity;
    private int totalBill;
    private String orderId;

    public void prepareOrder(Customer customer, Item item){
        System.out.println("Preparing order for customer -"
                + customer.getCustomerName()
                + " who has ordered "
                + item.getItemName());
    }
    public void calculateBill(){
        Random rand = new Random();
        int totalAmt = rand.nextInt(100) * getItemQuantity();
        setTotalBill(totalAmt);
        System.out.println("Order with order id "
                + getOrderId()
                + " has a total bill amount of "
                + getTotalBill());
    }
    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
