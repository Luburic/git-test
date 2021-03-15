import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("Tastatura XZ");
        inventory.add("Televizor LG KY");
        inventory.add("Ves masina 12");
        inventory.add("Ves masina YY");
        inventory.add("Ves masina X4");
        inventory.add("Pegla TT");
        inventory.add("Pegla TX");

        System.out.println("Unesi parametar pretrage:");
        Scanner scanner = new Scanner(System.in);
        String searchText = scanner.nextLine();

        for (String p : inventory) {
            if (p.toUpperCase().contains(searchText.toUpperCase())) {
                System.out.println(p);
            }
        }

    }
}
