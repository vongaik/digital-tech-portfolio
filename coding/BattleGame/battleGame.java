import java.util.*;

public class battleGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String[] actions = {"a", "d"}; // attack or defend
        String[] cpuNames = {"Arthur", "Charlemagne", "Camelot"};
        int[] classIDs = {1, 2, 3};

        System.out.println("-------------------[RPG Battle System]-------------------");
        System.out.print("Enter your name: ");
        String playerName = scan.next();
        System.out.print("Enter your battle class (1: Sword Fighter, 2: Unicorn Sorcerer, 3: Dance Battler): ");
        int playerClassID = scan.nextInt();

        NPC player = new NPC(playerName, playerClassID);

        int cpuIndex = rand.nextInt(cpuNames.length);
        String cpuName = cpuNames[cpuIndex];
        int cpuClassID = classIDs[rand.nextInt(classIDs.length)];
        NPC cpu = new NPC(cpuName, cpuClassID);

        System.out.println(playerName + " the " + player.getBattleClass() +
                ", your opponent is " + cpu.getName() + " the " + cpu.getBattleClass() + "!");

        int round = 1;
        while(player.isStillAlive() && cpu.isStillAlive()) {
            System.out.println("\n-Round " + round + "-");
            System.out.print("Do you (a)ttack or (d)efend? ");
            String playerMove = scan.next();
            String cpuMove = actions[rand.nextInt(actions.length)];

            if(playerMove.equals("a") && cpuMove.equals("a")) {
                cpu.calculateDefense(player.calculateAttack(cpu.getDefense()));
                player.calculateDefense(cpu.calculateAttack(player.getDefense()));
                System.out.println(player.getName() + " attacks! " + cpu.getName() + " HP: " + cpu.getHP());
                System.out.println(cpu.getName() + " attacks! " + player.getName() + " HP: " + player.getHP());
            } else if(playerMove.equals("a") && cpuMove.equals("d")) {
                cpu.calculateDefense(player.calculateAttack(cpu.getDefense()));
                System.out.println(player.getName() + " attacks! " + cpu.getName() + " HP: " + cpu.getHP());
                System.out.println(cpu.getName() + " is on guard.");
            } else if(playerMove.equals("d") && cpuMove.equals("a")) {
                player.calculateDefense(cpu.calculateAttack(player.getDefense()));
                System.out.println(player.getName() + " is on guard.");
                System.out.println(cpu.getName() + " attacks! " + player.getName() + " HP: " + player.getHP());
            } else {
                System.out.println(player.getName() + " is on guard.");
                System.out.println(cpu.getName() + " is on guard.");
            }

            round++;
        }

        System.out.println("\n---Game Over---");
        if(player.isStillAlive()) {
            System.out.println(player.getName() + " wins!");
        } else {
            System.out.println(cpu.getName() + " wins!");
        }

        scan.close();
    }
}
