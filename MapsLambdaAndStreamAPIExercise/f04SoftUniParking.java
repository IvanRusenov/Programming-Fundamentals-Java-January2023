package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class f04SoftUniParking {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String,String> register = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] data = input.split(" ");
            String command = data[0];
            String name = data[1];


            if (command.equals("register")){
                String regNum = data[2];
                if (!register.containsKey(name)){
                    register.put(name,regNum);
                    System.out.printf("%s registered %s successfully\n",name,regNum);
                }else {

                    System.out.printf("ERROR: already registered with plate number %s\n",regNum);
                }


            } else if(command.equals("unregister")){

                if (!register.containsKey(name)){
                    System.out.printf("ERROR: user %s not found\n",name);
                }else {
                    register.remove(name);
                    System.out.printf("%s unregistered successfully\n",name);
                }

            }
        }

        for (Map.Entry<String, String> entry : register.entrySet()) {
            System.out.printf("%s => %s\n",entry.getKey(),entry.getValue());
        }

    }
}
