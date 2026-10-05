package javaInheritance.multilevelInheritance;

/**
 * Problem 1: Online Retail Order Management
 * Demonstrates multilevel inheritance.
 *
 * Author : Mithun
 * Date : 02-10-2026
 */

class Order {

    int orderId;
    String orderDate;

    // Constructor to initialize order details
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Return current order status
    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {

    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Return shipped status
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate,
                   String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Return delivered status
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }

    // Display complete order information
    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

public class OnlineRetailOrder {

    public static void main(String[] args) {

        // Create object of the lowest-level subclass
        DeliveredOrder order = new DeliveredOrder(
                1001,
                "02-10-2026",
                "TRK12345",
                "05-10-2026"
        );

        // Display order details
        order.displayOrderDetails();
    }
}