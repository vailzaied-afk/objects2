import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] items;

    public Order(String customer, Product[] items) {
        this.customer = customer;
        this.items = items;
    }

    public String getCustomer() {
        return customer;
    }

    public Product[] getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(customer, order.customer) &&
                Arrays.equals(items, order.items);

    }

    @Override
    public String toString() {
        return "Заказ клиента " + customer + ": " + Arrays.toString(items);
    }

}
