package ProgrammingFundamentalsFinalExam04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class F03HeroesOfCodeAndLogicVII {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, Integer> nameHpMap = new LinkedHashMap<>();
        Map<String, Integer> nameMpMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            int hp = Integer.parseInt(input[1]);
            int mp = Integer.parseInt(input[2]);

            nameHpMap.putIfAbsent(name, hp);
            nameMpMap.putIfAbsent(name, mp);

        }

        String input = scan.nextLine();

        while (!input.equals("End")) {

            String[] commands = input.split("\\s+\\-\\s+");
            String name = commands[1];


            if (commands[0].equals("CastSpell")) {

                int mpNeeded = Integer.parseInt(commands[2]);
                String spellName = commands[3];

                if (mpNeeded <= nameMpMap.get(name)){

                    nameMpMap.put(name,nameMpMap.get(name) - mpNeeded);
                    System.out.printf("%s has successfully cast %s and now has %d MP!\n"
                            , name, spellName, nameMpMap.get(name));

                }else {

                    System.out.printf("%s does not have enough MP to cast %s!\n", name, spellName);
                }

            } else if (commands[0].equals("TakeDamage")) {

                int damage = Integer.parseInt(commands[2]);
                String attacker = commands[3];

                if (nameHpMap.get(name) - damage > 0){

                    nameHpMap.put(name, nameHpMap.get(name) - damage);

                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n"
                            , name, damage, attacker, nameHpMap.get(name));

                }else {

                    nameHpMap.remove(name);
                    nameMpMap.remove(name);

                    System.out.printf("%s has been killed by %s!\n", name, attacker);
                }

            } else if (commands[0].equals("Recharge")) {

                int amountMp = Integer.parseInt(commands[2]);

                if (nameMpMap.get(name) + amountMp > 200){

                    System.out.printf("%s recharged for %d MP!\n", name, 200 - nameMpMap.get(name));
                    nameMpMap.put(name,200);

                }else{

                    nameMpMap.put(name, nameMpMap.get(name) + amountMp);

                    System.out.printf("%s recharged for %d MP!\n", name, amountMp);
                }

            } else if (commands[0].equals("Heal")) {

                int amountHp = Integer.parseInt(commands[2]);

                if (nameHpMap.get(name) + amountHp > 100){

                    System.out.printf("%s healed for %d HP!\n", name, 100 - nameHpMap.get(name));
                    nameHpMap.put(name,100);

                }else{

                    nameHpMap.put(name, nameHpMap.get(name) + amountHp);

                    System.out.printf("%s healed for %d HP!\n", name, amountHp);
                }

            }

            input = scan.nextLine();

        }

        for (Map.Entry<String, Integer> entry : nameHpMap.entrySet()) {

            System.out.printf("%s\n  HP: %d\n  MP: %d\n"
                    , entry.getKey(), entry.getValue(), nameMpMap.get(entry.getKey()));

        }

    }
}
