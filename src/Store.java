import java.util.*;

public class Store {

    public static void main(String[] args) {
        List<Product> inventory = createInventory();

        //Sortiranje inventara po ceni
        /*for(int j = 0; j < inventory.size(); j++) {
            Product cheapestProduct = inventory.get(j);
            for (int i = j + 1; i < inventory.size(); i++) {
                if (inventory.get(i).price < cheapestProduct.price) {
                    inventory.set(j, inventory.get(i));
                    inventory.set(i, cheapestProduct);
                    cheapestProduct = inventory.get(j);
                }
            }
        }*/
        inventory.sort(new ProductPriceComparator());
        for (Product product :inventory) {
            System.out.println("Name: " + product.name + "; Price: " + product.price);
        }

        System.out.println("Name: ");
    }

    private static List<Product> createInventory() {
        List<Product> inventory = new ArrayList<>(10000);
        inventory.add(new Product("Tastatura XZ", 3999, 3));
        inventory.add(new Product("Tastatura YY", 3000, 5));
        inventory.add(new Product("Televizor LG KY", 100000, 3));
        inventory.add(new Product("Televizor Samsung X1", 50000, 4));
        return inventory;
    }

}
