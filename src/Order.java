import java.util.Arrays;
import java.util.Objects;

public class Order {
    String customer;
    Product[] basket;

    public Order(String customer, Product[] items) {
        this.customer = customer;
        this.basket = items;
    }

    public String getCustomer() {
        return customer;
    }

    public Product[] getBasket() {
        return basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(customer, order.customer) &&
                Arrays.equals(basket, order.basket);

    }

    @Override
    public String toString() {
        return "Заказ клиента " + customer + ": " + Arrays.toString(basket);
    }

}
