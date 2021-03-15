import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {
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

        inventory.add(new Product("Tastatura XZ", 3000, 3));
        inventory.add(new Product("Tastatura YY", 3999, 5));
        inventory.add(new Product("Televizor LG KY", 25000, 3));
        inventory.add(new Product("Televizor Samsung X1", 15000, 4));
        return inventory;
    }

}
