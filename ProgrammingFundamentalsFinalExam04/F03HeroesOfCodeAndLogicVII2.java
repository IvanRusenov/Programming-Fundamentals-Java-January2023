package F04ProgrammingFundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class F03HeroesOfCodeAndLogicVII2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, int[]> nameHpMpMap = new LinkedHashMap<>();

        while (n-- > 0) {

            String[] data = scan.nextLine().split("\\s+");

            String name = data[0];
            int hp = Integer.parseInt(data[1]);
            int mp = Integer.parseInt(data[2]);

            nameHpMpMap.putIfAbsent(name, new int[2]);
            nameHpMpMap.get(name)[0] = hp;
            nameHpMpMap.get(name)[1] = mp;

        }

        String input = scan.nextLine();

        while (!input.equals("End")) {

            String[] commands = input.split("\\s+-\\s+");

            if (commands[0].equals("CastSpell")) {

                String name = commands[1];
                int mpNeeded = Integer.parseInt(commands[2]);
                String spellName = commands[3];

                if (nameHpMpMap.get(name)[1] >= mpNeeded) {

                    nameHpMpMap.get(name)[1] -= mpNeeded;
                    System.out.printf("%s has successfully cast %s and now has %d MP!\n"
                            , name, spellName, nameHpMpMap.get(name)[1]);

                } else {

                    System.out.printf("%s does not have enough MP to cast %s!\n", name, spellName);

                }

            } else if (commands[0].equals("TakeDamage")) {

                String name = commands[1];
                int damage = Integer.parseInt(commands[2]);
                String attacker = commands[3];

                if (nameHpMpMap.get(name)[0] - damage > 0) {

                    nameHpMpMap.get(name)[0] -= damage;
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n"
                            , name, damage, attacker, nameHpMpMap.get(name)[0]);

                } else {

                    System.out.printf("%s has been killed by %s!\n", name, attacker);
                    nameHpMpMap.remove(name);

                }

            } else if (commands[0].equals("Recharge")) {

                String name = commands[1];
                int amount = Integer.parseInt(commands[2]);

                if (nameHpMpMap.get(name)[1] + amount > 200) {

                    System.out.printf("%s recharged for %d MP!\n", name, 200 - nameHpMpMap.get(name)[1]);
                    nameHpMpMap.get(name)[1] = 200;

                } else {

                    nameHpMpMap.get(name)[1] += amount;
                    System.out.printf("%s recharged for %d MP!\n", name, amount);

                }

            } else if (commands[0].equals("Heal")) {

                String name = commands[1];
                int amount = Integer.parseInt(commands[2]);

                if (nameHpMpMap.get(name)[0] + amount > 100) {

                    System.out.printf("%s healed for %d HP!\n", name, 100 - nameHpMpMap.get(name)[0]);
                    nameHpMpMap.get(name)[0] = 100;

                } else {

                    nameHpMpMap.get(name)[0] += amount;
                    System.out.printf("%s healed for %d HP!\n", name, amount);
                }

            }

            input = scan.nextLine();

        }

        nameHpMpMap.forEach((k, v) -> {
            System.out.printf("%s\n  HP: %d\n  MP: %d\n", k, v[0], v[1]);

        });

    }
}
