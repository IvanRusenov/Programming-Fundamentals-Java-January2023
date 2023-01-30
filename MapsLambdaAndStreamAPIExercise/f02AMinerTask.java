package MapsLambdaAndStreamAPIExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class f02AMinerTask {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String resource = scan.nextLine();

        LinkedHashMap<String,Integer> resourceMap = new LinkedHashMap<>();

        while (!resource.equals("stop")){

            int quantity = Integer.parseInt(scan.nextLine());

            if (!resourceMap.containsKey(resource)){

                resourceMap.put(resource,quantity);

            }else {

                resourceMap.put(resource, resourceMap.get(resource) + quantity);

            }

            resource = scan.nextLine();

        }

        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {

            System.out.printf("%s -> %d\n",entry.getKey(),entry.getValue());
        }

    }
}
