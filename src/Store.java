import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {
        //Ispisi totalnu vrednost inventara

        ArrayList<Product> inventory = createInventory();


        //System.out.println("Unesi parametar pretrage:");
        //Scanner scanner = new Scanner(System.in);
        //String searchText = scanner.nextLine();

        //for (HashMap<String, String> p : inventory) {
        //    if (p.get("name").toUpperCase().contains(searchText.toUpperCase())) {
        //        System.out.println("\n\nName: " + p.get("name"));
        //        System.out.println("\nPrice: " + p.get("price"));
        //        System.out.println("\nQuantity: " + p.get("quantity"));
        //    }
        //}

        int sum = 0;
        for (Product p : inventory) {
            double price = p.price;
            double quantity = p.quantity;

            sum += price * quantity;
        }

        System.out.println("Total value is: " + sum);

    }

    private static ArrayList<Product> createInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(createProduct("Tastatura XZ", 3000, 3));
        inventory.add(createProduct("Tastatura YY", 3999, 5));
        inventory.add(createProduct("Televizor LG KY", 25000, 3));
        inventory.add(createProduct("Televizor Samsung X1", 15000, 4));
        return inventory;
    }

    private static Product createProduct(String name, double price, double quantity) {
        Product product = new Product();
        product.name = name;
        product.price = price;
        product.quantity = quantity;
        return product;
    }
}
