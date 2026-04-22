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
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        if (!Objects.equals(customer, order.customer)) {
            return false;

        }
        if (basket == null || order.basket == null) {
            return basket == order.basket;
        }
        if (basket.length != order.basket.length) {
            return false;
        }
        for (int i = 0; i < basket.length; i++) {
            Product p1 = basket[i];
            Product p2 = order.basket[i];
            if (!Objects.equals(p1, p2)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {

        int result = Objects.hashCode(customer);

        if (basket != null) {

            for (Product product : basket) {
                result += Objects.hashCode(product);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer='" + customer + '\'' +
                ", basket=" + java.util.Arrays.toString(basket) +
                '}';
    }

}
