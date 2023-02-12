package TextProcessingExercise;

import java.util.Scanner;

public class f05MultiplyBigNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();

        if (!num.isEmpty()){

           num = num.replaceAll("\\b0+","");
           // !!! checks if num starts with multiple zeros 0000000000000001234 !!!

        }else {

            num = "0";

        }

        byte multiplier = Byte.parseByte(scan.nextLine());

        if (multiplier == 0){

            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder(num);
        String reversedNum = sb.reverse().toString();
        StringBuilder result = new StringBuilder();
        byte reminder = 0;

        for (int i = 0; i < reversedNum.length(); i++) {

            byte factor = Byte.parseByte(reversedNum.charAt(i) + "");

            byte product = (byte) (factor * multiplier + reminder);

            if (product > 9){

                result.append(product % 10);
                reminder = (byte)(product/10);

            }else {

                result.append(product);
                reminder = 0;

            }
        }

        if (reminder != 0 ){

            result.append(reminder);

        }

        result.reverse();
        System.out.println(result);
    }
}
