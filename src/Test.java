import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scanner je definisan.");
        System.out.println("Unesi prvi podatak:");

        String prviUnos = scanner.nextLine();
        System.out.println("Uneli ste:" + prviUnos);

        String drugiUnos = scanner.nextLine();
        System.out.println("Uneli ste:" + drugiUnos);

    }

}
