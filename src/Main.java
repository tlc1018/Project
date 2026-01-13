//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner Scan = new Scanner(System.in);

        Player p1 = new Player(1);
        Player p2 = new Player(2);
        Player p3 = new Player(3);

        Thread.sleep(900);
        System.out.println();
        System.out.println("You embark on a journey with " + p1.getNAME() + ", " + p2.getNAME() + ", and " + p3.getNAME() + "!");

        Thread.sleep(900);
        Zombie z = new Zombie(1);
        System.out.println("The party encounters a ZOMBIE");
        System.out.println();

        while (!z.isDEAD()) {
            System.out.println();
            System.out.println("What Shall " + p1.getNAME() + " do?");
            System.out.println("1: Fight | 2: StatBoost | 3: Check | 4: Item");
            int input = Scan.nextInt();



            if (z.isDEAD()) {
                break;
            }

            System.out.println();
            System.out.println("What Shall " + p2.getNAME() + " do?");
            System.out.println("1: Fight | 2: StatBoost | 3: Check | 4: Item");
            int input2 = Scan.nextInt();

            if (z.isDEAD()) {
                break;
            }

            System.out.println();
            System.out.println("What Shall " + p3.getNAME() + " do?");
            System.out.println("1: Fight | 2: Block | 3: Check | 4: Item");
            int input3 = Scan.nextInt();

            if (input == 1) {
                z.takeDMG(p1.getATK(), p1.getNAME());
            }
            if (input2 == 1) {
                z.takeDMG(p2.getATK(), p2.getNAME());
            }
            if (input3 == 1) {
                z.takeDMG(p3.getATK(), p3.getNAME());
            }


        }



    }


}