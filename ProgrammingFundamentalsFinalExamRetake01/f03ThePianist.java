package ProgrammingFundamentalsFinalExamRetake01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class f03ThePianist {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, String> pieceComposerMap = new LinkedHashMap<>();
        Map<String, String> pieceKeyMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] input = scan.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];

            pieceComposerMap.putIfAbsent(piece, composer);
            pieceKeyMap.putIfAbsent(piece, key);

        }

        String input = scan.nextLine();

        while (!input.equals("Stop")) {

            String[] command = input.split("\\|");

            if (command[0].equals("Add")) {

                String piece = command[1];
                String composer = command[2];
                String key = command[3];

                if (pieceComposerMap.containsKey(piece)) {

                    System.out.printf("%s is already in the collection!\n", piece);

                } else {

                    pieceComposerMap.put(piece, composer);
                    pieceKeyMap.put(piece, key);

                    System.out.printf("%s by %s in %s added to the collection!\n", piece, composer, key);

                }

            } else if (command[0].equals("Remove")) {

                String piece = command[1];

                if (pieceComposerMap.containsKey(piece)) {

                    pieceComposerMap.remove(piece);
                    pieceKeyMap.remove(piece);

                    System.out.printf("Successfully removed %s!\n", piece);

                } else {

                    System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);

                }

            } else if (command[0].equals("ChangeKey")) {

                String piece = command[1];
                String newKey = command[2];


                if (pieceComposerMap.containsKey(piece)) {

                    pieceKeyMap.put(piece, newKey);

                    System.out.printf("Changed the key of %s to %s!\n", piece, newKey);

                } else {

                    System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                }

            }

            input = scan.nextLine();
        }

        for (Map.Entry<String, String> entry : pieceComposerMap.entrySet()) {

            System.out.printf("%s -> Composer: %s, Key: %s\n"
                    , entry.getKey(), entry.getValue(), pieceKeyMap.get(entry.getKey()));

        }
    }
}
