public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(154, "Альбом", 900, "Бумажная продукция");
        Product product2 = new Product(154, "Альбом", 900, "Бумажная продукция");
        Product product3 = new Product(30, "Альбом", 900, "Бумажная продукция");
        Product product4 = new Product(15, "Книга", 900, "Бумажная продукция");

        Product[] items = {product1, product2};
        Order order1 = new Order("Корзина 1", items);
        System.out.println(product1.equals(product2));

        System.out.println(order1);
        Product[] items2 = {product3, product4};
        Order order2 = new Order("Корзина 2", items2);
        System.out.println(product3.equals(product4));

        System.out.println(order2);


    }
}