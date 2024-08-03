package com.nt.flipkart;

public class Order {
    private int orderId;
    private Product product;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        System.out.println("Setting OrderId");
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        System.out.println("Setting Product");
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", product=" + product +
                '}';
    }
}
