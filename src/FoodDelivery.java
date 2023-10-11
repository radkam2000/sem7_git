public class FoodDelivery {
    public void delivery(Order order, Customer customer){
        System.out.println("Delivering the order for Customer" + customer.getCustomerName());
        System.out.println("Order with order id as " + order.getOrderId() + " being delivered.");
        System.out.println("Order is to be delivered to: " + customer.getCustomerAddress());
    }
}