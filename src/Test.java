import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();
        nizBrojeva.add(3);
        nizBrojeva.add(1);
        nizBrojeva.add(5);
        nizBrojeva.add(4);
        nizBrojeva.add(2);

        Collections.reverse(nizBrojeva);

        for (Integer integer : nizBrojeva) {
            System.out.println(integer);
        }

    }

}
