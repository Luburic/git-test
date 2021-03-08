import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Store {
    //zatim omogucuje korisniku da pretrazi inventar (unos sa tastature)
    //ispisuje sve proizvode cije ime se poklapa sa rezultatima pretrage

    public static void main(String[] args) {
        ArrayList<String> inventory = new ArrayList<String>();
        inventory.add("Tastatura XZ");
        inventory.add("Tastatura YY");
        inventory.add("Televizor LG x1");
        inventory.add("Televizor LG GG");

        System.out.println("Unesi parametar pretrage:");
        Scanner scanner = new Scanner(System.in);
        String searchText = scanner.nextLine();

        for (String p : inventory) {
            if (p.toLowerCase().contains(searchText.toLowerCase())) {
                System.out.println(p);
            }
        }

    }
}
