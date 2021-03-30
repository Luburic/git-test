import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.price == o2.price) return 0;
        if(o1.price > o2.price) return 1;
        return -1;
    }
}
