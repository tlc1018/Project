import java.util.Scanner;

public class Player {
    private String P1name = "";
    private String Class = "";
    private int P1ATK = 0;
    private int P1DEF = 0;
    private int P1SPD = 0;
    private int P1HP = 0;
    private int LEVEL = 1;

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
            int input = Scan.nextInt();

            if (input == 1) {
                P1ATK = 3;
                P1DEF = 2;
                P1SPD = 1;
                P1HP = 20;
                Class = "F";
                System.out.println(P1name + " is now a FIGHTER");
                break;
            } else if (input == 2) {
                P1ATK = 2;
                P1DEF = 3;
                P1SPD = 0;
                P1HP = 25;
                Class = "T";
                System.out.println(P1name + " is now a TANK");
                break;
            } else if (input == 3) {
                P1ATK = 1;
                P1DEF = 1;
                P1SPD = 1;
                P1HP = 15;
                Class = "H";
                System.out.println(P1name + " is now a HEALER");
                break;
            } else if (input == 4) {
                P1ATK = 2;
                P1DEF = 1;
                P1SPD = 4;
                P1HP = 20;
                Class = "N";
                System.out.println(P1name + " is now a NINJA");
                break;
            } else if (input == 5) {
                P1ATK = 4;
                P1DEF = 1;
                P1SPD = 1;
                P1HP = 20;
                Class = "M";
                System.out.println(P1name + " is now a MAGE");
                break;
            } else if (input == 6) {
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

    public void Block(String n) {
        int heal = Math.random()


        System.out.println(n + " blocks, healing ");
    }

    public int getATK() {
        return P1ATK;
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

    public String getNAME() {
        return P1name;
    }

    public String getC() {
        return Class;
    }

    public int getLEVEL() {
        return LEVEL;
    }

}
