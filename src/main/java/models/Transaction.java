package main.java.models;

public class Transaction {

    private int id;
    private int userId;
    private int productId;
    private int orderId;

    public Transaction(int userId, int productId, int orderId) {
        this.userId = userId;
        this.productId = productId;
        this.orderId = orderId;
    }

    public Transaction(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
