
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
        Enemy z = new Enemy(1, "Zombie");
        System.out.println();
        System.out.println("The party encounters a ZOMBIE");

        //zombie fight
        while (!z.isDEAD()) {
            String input;
            String input2;
            String input3;

            if (p1.isDead()) {
                input = "0";
            } else {
                System.out.println();
                System.out.println("What Shall " + p1.getNAME() + " do?");
                System.out.println("1: Fight | 2: Block | 3: Check | 4: Item");
                input = Scan.nextLine();
            }

            if (p2.isDead()) {
                input2 = "0";
            } else {
                System.out.println();
                System.out.println("What Shall " + p2.getNAME() + " do?");
                System.out.println("1: Fight | 2: Block | 3: Check | 4: Item");
                input2 = Scan.nextLine();
            }

            if (p3.isDead()) {
                input3 = "0";
            }else {
                System.out.println();
                System.out.println("What Shall " + p3.getNAME() + " do?");
                System.out.println("1: Fight | 2: Block | 3: Check | 4: Item");
                input3 = Scan.nextLine();
            }

            if (input.equals("1")) {
                z.takeDMG(p1.Attack(), p1.getNAME());
                System.out.println();
            } else if (input.equals("2")) {
                p1.Block(p1.getNAME());
                System.out.println(p1.getNAME() + " now has " + p1.getHP() + " HP!");
                System.out.println();
            } else if (input.equals("3")) {
                z.Check(p1.getNAME());
            } else {

            }

            if (z.isDEAD()) {
                break;
            }

            if (input2.equals("1")) {
                z.takeDMG(p2.Attack(), p2.getNAME());
                System.out.println();
            } else if (input2.equals("2")) {
                p2.Block(p2.getNAME());
                System.out.println(p2.getNAME() + " now has " + p2.getHP() + " HP!");
                System.out.println();
            } else if (input2.equals("3")) {
                z.Check(p2.getNAME());
            } else {

            }

            if (z.isDEAD()) {
                break;
            }

            if (input3.equals("1")) {
                z.takeDMG(p3.Attack(), p3.getNAME());
                System.out.println();
            } else if (input3.equals("2")) {
                p3.Block(p3.getNAME());
                System.out.println(p3.getNAME() + " now has " + p3.getHP() + " HP!");
                System.out.println();
            } else if (input3.equals("3")) {
                z.Check(p3.getNAME());
            } else {

            }

            if (z.isDEAD()) {
                break;
            }

            int choice = (int) ((Math.random() * 3) + 1);

            if (choice == 1) {
                int Dmg = z.DealDMG();
                System.out.println(z.getName() + " attacks " + p1.getNAME() + "!");
                Thread.sleep(900);
                System.out.println("Deals " + Dmg + " damage!");
                Thread.sleep(900);
                p1.takeDMG(Dmg);
                if (p1.isDead()) {
                    System.out.println(p1.getNAME() + " has fallen!");
                } else {
                    System.out.println(p1.getNAME() + " has " + p1.getHP() + " HP!");
                }
            } else if (choice == 2) {
                int Dmg = z.DealDMG();
                System.out.println(z.getName() + " attacks " + p2.getNAME() + "!");
                Thread.sleep(900);
                System.out.println("Deals " + Dmg + " damage!");
                Thread.sleep(900);
                p2.takeDMG(Dmg);
                if (p2.isDead()) {
                    System.out.println(p2.getNAME() + " has fallen!");
                } else {
                    System.out.println(p2.getNAME() + " has " + p2.getHP() + " HP!");
                }
            } else if (choice == 3) {
                int Dmg = z.DealDMG();
                System.out.println(z.getName() + " attacks " + p3.getNAME() + "!");
                Thread.sleep(900);
                System.out.println("Deals " + Dmg + " damage!");
                Thread.sleep(900);
                p3.takeDMG(Dmg);
                if (p3.isDead()) {
                    System.out.println(p3.getNAME() + " has fallen!");
                } else {
                    System.out.println(p3.getNAME() + " has " + p3.getHP() + " HP!");
                }
            }




        }

        //level ups
        p1.levelUP();
        p2.levelUP();
        p3.levelUP();

        int L = 3;

        int choice = (int) ((Math.random() * 3) + 1);

        if (choice == 1) {
            int x = (int) ((Math.random() * 5) + 1);
            if (x < 2) {
                Enemy e = new Enemy(L, "Zombie");
            } else if (x < 4) {
                Enemy e = new Enemy(L, "Skeleton");
            } else {
                Enemy e = new Enemy(L, "Ogre");
            }
            while (!e.isDEAD()) {
                String input;
                String input2;
                String input3;

                if (p1.isDead()) {
                    input = "0";
                } else {
                    System.out.println();
                    System.out.println("What Shall " + p1.getNAME() + " do?");
                    System.out.println("1: Fight | 2: Block | 3: Check | 4: Item");
                    input = Scan.nextLine();
                }

                if (p2.isDead()) {
                    input2 = "0";
                } else {
                    System.out.println();
                    System.out.println("What Shall " + p2.getNAME() + " do?");
                    System.out.println("1: Fight | 2: Block | 3: Check | 4: Item");
                    input2 = Scan.nextLine();
                }

                if (p3.isDead()) {
                    input3 = "0";
                }else {
                    System.out.println();
                    System.out.println("What Shall " + p3.getNAME() + " do?");
                    System.out.println("1: Fight | 2: Block | 3: Check | 4: Item");
                    input3 = Scan.nextLine();
                }

                if (input.equals("1")) {
                    z.takeDMG(p1.Attack(), p1.getNAME());
                    System.out.println();
                } else if (input.equals("2")) {
                    p1.Block(p1.getNAME());
                    System.out.println(p1.getNAME() + " now has " + p1.getHP() + " HP!");
                    System.out.println();
                } else if (input.equals("3")) {
                    z.Check(p1.getNAME());
                } else {

                }

                if (z.isDEAD()) {
                    break;
                }

                if (input2.equals("1")) {
                    z.takeDMG(p2.Attack(), p2.getNAME());
                    System.out.println();
                } else if (input2.equals("2")) {
                    p2.Block(p2.getNAME());
                    System.out.println(p2.getNAME() + " now has " + p2.getHP() + " HP!");
                    System.out.println();
                } else if (input2.equals("3")) {
                    z.Check(p2.getNAME());
                } else {

                }

                if (z.isDEAD()) {
                    break;
                }

                if (input3.equals("1")) {
                    z.takeDMG(p3.Attack(), p3.getNAME());
                    System.out.println();
                } else if (input3.equals("2")) {
                    p3.Block(p3.getNAME());
                    System.out.println(p3.getNAME() + " now has " + p3.getHP() + " HP!");
                    System.out.println();
                } else if (input3.equals("3")) {
                    z.Check(p3.getNAME());
                } else {

                }

                if (z.isDEAD()) {
                    break;
                }

                int ch = (int) ((Math.random() * 3) + 1);

                if (ch == 1) {
                    int Dmg = z.DealDMG();
                    System.out.println(z.getName() + " attacks " + p1.getNAME() + "!");
                    Thread.sleep(900);
                    System.out.println("Deals " + Dmg + " damage!");
                    Thread.sleep(900);
                    p1.takeDMG(Dmg);
                    if (p1.isDead()) {
                        System.out.println(p1.getNAME() + " has fallen!");
                    } else {
                        System.out.println(p1.getNAME() + " has " + p1.getHP() + " HP!");
                    }
                } else if (ch == 2) {
                    int Dmg = z.DealDMG();
                    System.out.println(z.getName() + " attacks " + p2.getNAME() + "!");
                    Thread.sleep(900);
                    System.out.println("Deals " + Dmg + " damage!");
                    Thread.sleep(900);
                    p2.takeDMG(Dmg);
                    if (p2.isDead()) {
                        System.out.println(p2.getNAME() + " has fallen!");
                    } else {
                        System.out.println(p2.getNAME() + " has " + p2.getHP() + " HP!");
                    }
                } else if (ch == 3) {
                    int Dmg = z.DealDMG();
                    System.out.println(z.getName() + " attacks " + p3.getNAME() + "!");
                    Thread.sleep(900);
                    System.out.println("Deals " + Dmg + " damage!");
                    Thread.sleep(900);
                    p3.takeDMG(Dmg);
                    if (p3.isDead()) {
                        System.out.println(p3.getNAME() + " has fallen!");
                    } else {
                        System.out.println(p3.getNAME() + " has " + p3.getHP() + " HP!");
                    }
                }




            }
        } else if (choice == 2) {
            int x = (int) ((Math.random() * 5) + 1);
            if (x < 2) {
                Enemy e = new Enemy(L, "Zombie");
            } else if (x < 4) {
                Enemy e = new Enemy(L, "Skeleton");
            } else {
                Enemy e = new Enemy(L, "Ogre");
            }
            x = (int) ((Math.random() * 5) + 1);
            if (x < 2) {
                Enemy e2 = new Enemy(L, "Zombie");
            } else if (x < 4) {
                Enemy e2 = new Enemy(L, "Skeleton");
            } else {
                Enemy e2 = new Enemy(L, "Ogre");
            }
        } else {
            int x = (int) ((Math.random() * 5) + 1);
            if (x < 2) {
                Enemy e = new Enemy(L, "Zombie");
            } else if (x < 4) {
                Enemy e = new Enemy(L, "Skeleton");
            } else {
                Enemy e = new Enemy(L, "Ogre");
            }
            x = (int) ((Math.random() * 5) + 1);
            if (x < 2) {
                Enemy e2 = new Enemy(L, "Zombie");
            } else if (x < 4) {
                Enemy e2 = new Enemy(L, "Skeleton");
            } else {
                Enemy e2 = new Enemy(L, "Ogre");
            }
            x = (int) ((Math.random() * 5) + 1);
            if (x < 2) {
                Enemy e3 = new Enemy(L, "Zombie");
            } else if (x < 4) {
                Enemy e3 = new Enemy(L, "Skeleton");
            } else {
                Enemy e3 = new Enemy(L, "Ogre");
            }
        }


    }


}
