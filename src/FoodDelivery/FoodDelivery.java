package FoodDelivery;

public class FoodDelivery {
    public void delivery(Order order, Customer customer){
        System.out.println("Delivering the order for FoodDelivery.Customer" + customer.getCustomerName());
        System.out.println("FoodDelivery.Order with order id as " + order.getOrderId() + " being delivered.");
        System.out.println("FoodDelivery.Order is to be delivered to: " + customer.getCustomerAddress());
    }
}