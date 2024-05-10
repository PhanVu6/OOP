package lab11.iterator.product;

public class ProductCatalog implements Iterable {
    public String[] product;

    public ProductCatalog() {
        this.product = new String[] { "David", "Scott", "Thett", "Indrew", "Jessica" };
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {

            if (index < product.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return product[index++];
            }
            return null;
        }
    }

}
