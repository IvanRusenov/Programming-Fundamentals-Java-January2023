package ListsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class f03TakeSkipRope {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();
        List<Integer> intList = new ArrayList<>();
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < message.length(); i++) {

            char ch = message.charAt(i);

            if (ch >= '0' && ch <= '9') {

                String chToStr = "" + ch;
                int num = Integer.parseInt(chToStr);
                intList.add(num);

            } else {

                charList.add(message.charAt(i));

            }
        }

        List<Integer> skipList = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {

            if (i % 2 == 0) {

                takeList.add(intList.get(i));

            } else {

                skipList.add(intList.get(i));

            }
        }

        List<Character> resultList = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < takeList.size(); i++) {

            int take = takeList.get(i);
            int endindex = (take + index);

            if (endindex > charList.size()) {

                endindex = charList.size();

            }

            resultList.addAll(charList.subList(index, endindex));

            int skip = skipList.get(i);
            index += skip + take;

        }

        StringBuilder result = new StringBuilder();

        for (char item : resultList) {
            result.append(item);
        }

        System.out.println(result);
    }
}
