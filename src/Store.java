import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        //Za svaki proizvod ukljuci i njegovu cenu i kolicinu

        ArrayList<HashMap<String, String>> inventory = createInventory();


        System.out.println("Unesi parametar pretrage:");
        Scanner scanner = new Scanner(System.in);
        String searchText = scanner.nextLine();

        for (HashMap<String, String> p : inventory) {
            if (p.get("name").toUpperCase().contains(searchText.toUpperCase())) {
                System.out.println("\n\nName: " + p.get("name"));
                System.out.println("\nPrice: " + p.get("price"));
                System.out.println("\nQuantity: " + p.get("quantity"));
            }
        }

    }

    private static ArrayList<HashMap<String, String>> createInventory() {
        ArrayList<HashMap<String, String>> inventory = new ArrayList<>();

        inventory.add(createProduct("Tastatura XZ", "3000", "3"));
        inventory.add(createProduct("Tastatura YY", "3999", "5"));
        inventory.add(createProduct("Televizor LG KY", "25000", "3"));
        inventory.add(createProduct("Televizor Samsung X1", "15000", "4"));
        return inventory;
    }

    private static HashMap<String, String> createProduct(String name, String price, String quantity) {
        HashMap<String, String> product = new HashMap<>();
        product.put("name", name);
        product.put("price", price);
        product.put("quantity", quantity);
        return product;
    }
}
