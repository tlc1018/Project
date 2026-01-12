import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String P1name = "";
        int P1ATK = 0;
        int P1DEF = 0;
        int P1SPD = 0;
        int P1HP = 0;

        String P2name = "";
        int P2ATK = 0;
        int P2DEF = 0;
        int P2SPD = 0;
        int P2HP = 0;

        String P3name = "";
        int P3ATK = 0;
        int P3DEF = 0;
        int P3SPD = 0;
        int P3HP = 0;


        Scanner Scan = new Scanner(System.in);
        System.out.println("Input party member 1 name:");
        P2name = Scan.nextLine();

        System.out.println();
        System.out.println("Input party member 2 name:");
        P2name = Scan.nextLine();

        System.out.println();
        System.out.println("Input party member 3 name:");
        P3name = Scan.nextLine();

        System.out.println();
        System.out.println("What class will you make " + P1name + "?");
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
        } else if (input == 2) {
            P1ATK = 2;
            P1DEF = 3;
            P1SPD = 0;
            P1HP = 25;
        } else if (input == 3) {
            P1ATK = 1;
            P1DEF = 1;
            P1SPD = 1;
            P1HP = 15;
        } else if (input == 4) {
            P1ATK = 2;
            P1DEF = 1;
            P1SPD = 4;
            P1HP = 20;
        } else if (input == 5) {
            P1ATK = 4;
            P1DEF = 1;
            P1SPD = 1;
            P1HP = 20;
        } else if (input == 6) {
            System.out.println("|Fighter: A strong attacker           |");
            System.out.println("|Tank: More defense, less attack      |");
            System.out.println("|Healer: Weak attacker, strong support|");
            System.out.println("|Ninja: Fast chip damage              |");
            System.out.println("|Mage: Stronger attacker, less defense|");

        }
    }
}