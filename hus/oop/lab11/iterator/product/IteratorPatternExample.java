package lab11.iterator.product;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Iterator iterator = productCatalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
