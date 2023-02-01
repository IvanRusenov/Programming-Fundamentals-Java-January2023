package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class f08CompanyUsers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LinkedHashMap <String, List<String>> employees = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("End")){


            String company = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];

            if (!employees.containsKey(company)){

                employees.put(company,new ArrayList<>());
            }


            if (!employees.get(company).contains(id)){

                employees.get(company).add(id);
            }
            input = scan.nextLine();


        }
        for (Map.Entry<String, List<String>> entry : employees.entrySet()) {
            System.out.printf("%s\n",entry.getKey());
            for (String item : entry.getValue()) {
                System.out.printf("-- %s\n",item);
            }
        }

    }
}
