import javax.naming.Name;
import java.util.Scanner;

public class Player {
    private String P1name = "";
    private String Class = "";
    private int P1ATK = 0;
    private int P1DEF = 0;
    private int P1SPD = 0;
    private int P1HP = 0;
    private int MaxHP;
    private int LEVEL = 1;
    private boolean isDead = false;

    public Player(int num) throws InterruptedException {
        Scanner Scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Input party member " + num + " name:");
        P1name = Scan.nextLine();

        while(true) {
            System.out.println();
            System.out.println("What class shall " + P1name + " be?");
            Thread.sleep(900);
            System.out.println("--------------------");
            System.out.println("| 1: Fighter       |");
            System.out.println("| 2: Tank          |");
            System.out.println("| 3: Healer        |");
            System.out.println("| 4: Ninja         |");
            System.out.println("| 5: Mage          |");
            System.out.println("| 6: Learn more    |");
            System.out.println("--------------------");
            String input = Scan.nextLine();

            if (input.equals("1")) {
                P1ATK = 3;
                P1DEF = 2;
                P1SPD = 2;
                P1HP = 20;
                MaxHP = 20;
                Class = "F";
                System.out.println(P1name + " is now a FIGHTER");
                break;
            } else if (input.equals("2")) {
                P1ATK = 2;
                P1DEF = 3;
                P1SPD = 1;
                P1HP = 25;
                MaxHP = 25;
                Class = "T";
                System.out.println(P1name + " is now a TANK");
                break;
            } else if (input.equals("3")) {
                P1ATK = 1;
                P1DEF = 1;
                P1SPD = 3;
                P1HP = 15;
                MaxHP = 15;
                Class = "H";
                System.out.println(P1name + " is now a HEALER");
                break;
            } else if (input.equals("4")) {
                P1ATK = 2;
                P1DEF = 1;
                P1SPD = 2;
                P1HP = 25;
                MaxHP = 25;
                Class = "N";
                System.out.println(P1name + " is now a NINJA");
                break;
            } else if (input.equals("5")) {
                P1ATK = 4;
                P1DEF = 1;
                P1SPD = 2;
                P1HP = 20;
                MaxHP = 20;
                Class = "M";
                System.out.println(P1name + " is now a MAGE");
                break;
            } else if (input.equals("6")) {
                Thread.sleep(900);
                System.out.println("|Fighter: A strong attacker           |");
                System.out.println("|Tank: More defense, less attack      |");
                System.out.println("|Healer: Weak attacker, strong support|");
                System.out.println("|Ninja: Fast chip damage              |");
                System.out.println("|Mage: Stronger attacker, less defense|");
                break;
            } else {
                System.out.println("invalid option");
                Thread.sleep(900);
            }
        }
    }

    public void Block(String n) throws InterruptedException {
        Thread.sleep(900);
        int heal = (int) ((Math.random() * 2 * P1SPD) + 1);
        System.out.println(n + " blocks, healing " + heal + " HP!");
        P1HP += heal;

        if (P1HP > MaxHP) {
            P1HP = MaxHP;
        }

        Thread.sleep(900);
    }

    public void Heal(int amt) {
        if (!isDead) {
            System.out.println(P1name + " heals " + amt + " HP!");
            P1HP += amt;
            if (P1HP > MaxHP) {
                P1HP = MaxHP;
            }
        }

    }

    public void takeDMG(int d) {
        P1HP -= d;
        if (P1HP <= 0) {
            isDead = true;
        }
    }

    public void levelUP() throws InterruptedException {
        Thread.sleep(900);
        LEVEL++;
        System.out.println(P1name + " leveled up!");
        P1ATK += 1;
        P1DEF += 1;
        P1SPD += 1;
        MaxHP += 2;
        P1HP = MaxHP;
        System.out.println();
        Thread.sleep(900);
        System.out.println("Level --> " + LEVEL);
        System.out.println("Atk +1: " + P1ATK);
        System.out.println("Def +1: " + P1DEF);
        System.out.println("SP +1: " + P1SPD);
        System.out.println("Hp +2: " + MaxHP);
        Thread.sleep(900);
        System.out.println();
    }

    public int getATK() {
        return P1ATK;
    }

    public int Attack() {
        if (Math.random() > 0.7) {
            System.out.println("Critical Hit!");
            return P1ATK * 2;
        } else {

            return P1ATK;
        }

    }

    public void Revive() throws InterruptedException {
        Thread.sleep(900);
        System.out.println(P1name + "has been revived!");
        isDead = false;
        P1HP = (int) (MaxHP / 2);
    }

    public int getSPD() {
        return P1SPD;
    }

    public int getP1DEF() {
        return P1DEF;
    }

    public int getHP() {
        return P1HP;
    }
    public int getMAXHP() {
        return MaxHP;
    }

    public String getNAME() {
        return P1name;
    }

    public String getC() {
        return Class;
    }

    public int getLEVEL() {
        return LEVEL;
    }

    public boolean isDead() {
        return isDead;
    }

}