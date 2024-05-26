package main.java.com.ecommerce.core.entity;
import java.time.Instant;
import java.util.List;


public class Order {
    private final long id;
    private OrderStatus status;
    private final Instant createdAt;
    private List<OrderItem> items;
    private float total;
    public Order(OrderStatus status, List<OrderItem> items) {
        this.createdAt = Instant.now();
        this.total = calculateTotal(items);
        this.id = 1;

        this.status = status;
        this.items = items;
    }

    public long getId() {
        return id;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }
    public List<OrderItem> getItems() {
        return items;
    }
    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
    public float getTotal() {
        return this.total;
    }
    public float calculateTotal(List<OrderItem> items) {
        return items.stream().mapToDouble(OrderItem::getPrice).sum();
    }
    
}
