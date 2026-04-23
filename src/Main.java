public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(30, "Альбом", 900, "");
        Product product2 = new Product(30, "Альбом", 900, "");
        Product product3 = new Product(30, "Альбом", 900, "Бумажная продукция");
        Product product4 = new Product(30, "Альбом", 900, "Бумажная продукция");

        Product[] basket = {product1, product2};
        Order order1 = new Order("Корзина", basket);
        System.out.println(product1.equals(product2));

        System.out.println(order1);
        Product[] basket2 = {product3, product4};
        Order order2 = new Order("Корзина", basket2);
        System.out.println(order1.equals(order2));

        System.out.println(order2);


    }
}