import java.util.Scanner;

public class GameHandler {
    Scanner scan = new Scanner(System.in);

    public GameHandler() {

    }

    public void HealerCheck(Player p1, Player p2, Player p3) throws InterruptedException {
        if (p1.getC().equals("Healer") && !p1.isDead()) {
            System.out.println();
            System.out.println(p1.getNAME() + " heals all heroes!");
            Thread.sleep(900);
            p1.Heal((int) p1.getSPD()/2);
            p2.Heal((int) p1.getSPD()/2);
            p3.Heal((int) p1.getSPD()/2);
        }
        if (p2.getC().equals("Healer") && !p2.isDead()) {
            System.out.println();
            System.out.println(p2.getNAME() + " heals all heroes!");
            Thread.sleep(900);
            p1.Heal((int) p2.getSPD()/2);
            p2.Heal((int) p2.getSPD()/2);
            p3.Heal((int) p2.getSPD()/2);
        }
        if (p3.getC().equals("Healer") && !p3.isDead()) {
            System.out.println();
            System.out.println(p3.getNAME() + " heals all heroes!");
            Thread.sleep(900);
            p1.Heal((int) p3.getSPD()/2);
            p2.Heal((int) p3.getSPD()/2);
            p3.Heal((int) p3.getSPD()/2);
        }
        Thread.sleep(900);
    }

    public void Angel(Player p1, Player p2, Player p3) throws InterruptedException {

        Thread.sleep(900);
        PartyCheck(p1, p2, p3);
        boolean close = false;

        while (!close) {
            System.out.println("You have a chance to get a power up!");
            System.out.println("1: Revive a random fallen hero | 2: Heal all living heroes +10hp | 3: Level up a hero");
            String choice = scan.nextLine();

            if (choice.equals("1")) {
                if (p1.isDead()) {
                    p1.Revive();
                } else if (p2.isDead()) {
                    p2.Revive();
                } else if (p3.isDead()) {
                    p3.Revive();
                } else {
                    Thread.sleep(900);
                    System.out.println("No fallen heroes!");
                }
                close = true;
            } else if (choice.equals("2")) {
                p1.Heal(10);
                p2.Heal(10);
                p3.Heal(10);
                close = true;
            } else if (choice.equals("3")) {
                boolean chosen = false;
                while (!chosen) {
                    System.out.println("Which hero?");
                    System.out.println("1:" + p1.getNAME() + " | 2: " + p2.getNAME() + " | 3: " + p3.getNAME());
                    String x = scan.nextLine();
                    if (x.equals("1")) {
                        p1.levelUP();
                        chosen = true;
                    } else if (x.equals("2")) {
                        p2.levelUP();
                        chosen = true;
                    } else if (x.equals("3")) {
                        p3.levelUP();
                        chosen = true;
                    } else {
                        Thread.sleep(900);
                        System.out.println("invalid option");
                        Thread.sleep(900);
                    }
                }
                close = true;
            } else {
                Thread.sleep(900);
                System.out.println("invalid option");
                Thread.sleep(900);
            }
        }

        PartyCheck(p1, p2, p3);
    }

    public void UNILevel(Player p1, Player p2, Player p3) throws InterruptedException {
        if (Math.random() > 0.9) {
            p1.levelUP();
        }
        if (Math.random() > 0.9) {
            p2.levelUP();
        }
        if (Math.random() > 0.9) {
            p3.levelUP();
        }
    }

    public void PartyCheck(Player p1, Player p2, Player p3) {
        System.out.println("---------PARTY-CONDITION---------");
        System.out.println(p1.getNAME() + " Level: " + p1.getLEVEL() + "(" + p1.getC() + ")");
        System.out.println("    ATK: " + p1.getATK());
        System.out.println("    DEF: " + p1.getP1DEF());
        System.out.println("     SP: " + p1.getSPD());
        System.out.println("     HP: " + p1.getHP() + "/" + p1.getMAXHP());
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println(p2.getNAME() + " Level: " + p2.getLEVEL() + "(" + p2.getC() + ")");
        System.out.println("    ATK: " + p2.getATK());
        System.out.println("    DEF: " + p2.getP1DEF());
        System.out.println("     SP: " + p2.getSPD());
        System.out.println("     HP: " + p2.getHP() + "/" + p2.getMAXHP());
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println(p3.getNAME() + " Level: " + p3.getLEVEL() + "(" + p3.getC() + ")");
        System.out.println("    ATK: " + p3.getATK());
        System.out.println("    DEF: " + p3.getP1DEF());
        System.out.println("     SP: " + p3.getSPD());
        System.out.println("     HP: " + p3.getHP() + "/" + p3.getMAXHP());
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
    }
}
