package ListsLab;

import java.util.*;

public class f6ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String item = scan.nextLine();
           products.add(item);
        }
        Collections.sort(products);
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d.%s\n",i,products.get(i-1));
        }

    }

}
