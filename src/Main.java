import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner Scan = new Scanner(System.in);

        Player p1 = new Player(1);
        Player p2 = new Player(2);
        Player p3 = new Player(3);
        GameHandler W = new GameHandler();

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
                System.out.println("1: Fight | 2: Block | 3: Check");
                input = Scan.nextLine();
            }

            if (p2.isDead()) {
                input2 = "0";
            } else {
                System.out.println();
                System.out.println("What Shall " + p2.getNAME() + " do?");
                System.out.println("1: Fight | 2: Block | 3: Check");
                input2 = Scan.nextLine();
            }

            if (p3.isDead()) {
                input3 = "0";
            } else {
                System.out.println();
                System.out.println("What Shall " + p3.getNAME() + " do?");
                System.out.println("1: Fight | 2: Block | 3: Check");
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
                W.PartyCheck(p1, p2, p3);
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
                W.PartyCheck(p1, p2, p3);
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
                W.PartyCheck(p1, p2, p3);
                z.Check(p3.getNAME());
            } else {

            }

            if (z.isDEAD()) {
                break;
            }

            boolean able = false;
            while (!able) {
                int ch = (int) ((Math.random() * 3) + 1);
                if (ch == 1) {
                    if (p1.isDead()) {

                    } else {
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
                        able = true;
                    }
                } else if (ch == 2) {
                    if (p2.isDead()) {

                    } else {
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
                        able = true;
                    }

                } else if (ch == 3) {
                    if (p3.isDead()) {

                    } else {
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
                        able = true;
                    }

                }
            }
            if (p1.isDead() && p2.isDead() && p3.isDead()) {
                System.out.println("All party members have fallen!");
                Thread.sleep(900);
                System.out.println("------------------");
                System.out.println("    GAME  OVER    ");
                System.out.println("------------------");
            }
            W.HealerCheck(p1, p2, p3);
        }

        //level ups
        p1.levelUP();
        p2.levelUP();
        p3.levelUP();

        int L = 2;

        while (!(p1.isDead() && p2.isDead() && p3.isDead())) {

            W.Angel(p1, p2, p3);

            int choice = (int) ((Math.random() * 2) + 1);

            if (choice == 1) {
                Enemy e = new Enemy(L);
                System.out.println("The party encounters a level " + e.getLevel() + " " + e.getName() + "!");
                System.out.println();
                while (!e.isDEAD()) {
                    String input;
                    String input2;
                    String input3;

                    if (p1.isDead()) {
                        input = "0";
                    } else {
                        System.out.println();
                        System.out.println("What Shall " + p1.getNAME() + " do?");
                        System.out.println("1: Fight | 2: Block | 3: Check");
                        input = Scan.nextLine();
                    }

                    if (p2.isDead()) {
                        input2 = "0";
                    } else {
                        System.out.println();
                        System.out.println("What Shall " + p2.getNAME() + " do?");
                        System.out.println("1: Fight | 2: Block | 3: Check");
                        input2 = Scan.nextLine();
                    }

                    if (p3.isDead()) {
                        input3 = "0";
                    } else {
                        System.out.println();
                        System.out.println("What Shall " + p3.getNAME() + " do?");
                        System.out.println("1: Fight | 2: Block | 3: Check");
                        input3 = Scan.nextLine();
                    }

                    if (input.equals("1")) {
                        e.takeDMG(p1.Attack(), p1.getNAME());
                        System.out.println();
                    } else if (input.equals("2")) {
                        p1.Block(p1.getNAME());
                        System.out.println(p1.getNAME() + " now has " + p1.getHP() + " HP!");
                        System.out.println();
                    } else if (input.equals("3")) {
                        W.PartyCheck(p1, p2, p3);
                        e.Check(p1.getNAME());
                    } else {

                    }

                    if (e.isDEAD()) {
                        break;
                    }

                    if (input2.equals("1")) {
                        e.takeDMG(p2.Attack(), p2.getNAME());
                        System.out.println();
                    } else if (input2.equals("2")) {
                        p2.Block(p2.getNAME());
                        System.out.println(p2.getNAME() + " now has " + p2.getHP() + " HP!");
                        System.out.println();
                    } else if (input2.equals("3")) {
                        W.PartyCheck(p1, p2, p3);
                        e.Check(p2.getNAME());
                    } else {

                    }

                    if (e.isDEAD()) {
                        break;
                    }

                    if (input3.equals("1")) {
                        e.takeDMG(p3.Attack(), p3.getNAME());
                        System.out.println();
                    } else if (input3.equals("2")) {
                        p3.Block(p3.getNAME());
                        System.out.println(p3.getNAME() + " now has " + p3.getHP() + " HP!");
                        System.out.println();
                    } else if (input3.equals("3")) {
                        W.PartyCheck(p1, p2, p3);
                        e.Check(p3.getNAME());
                    } else {

                    }

                    if (e.isDEAD()) {
                        break;
                    }

                    boolean able = false;
                    while (!able) {
                        int ch = (int) ((Math.random() * 3) + 1);
                        if (ch == 1) {
                            if (p1.isDead()) {

                            } else {
                                int Dmg = e.DealDMG();
                                System.out.println(e.getName() + " attacks " + p1.getNAME() + "!");
                                Thread.sleep(900);
                                System.out.println("Deals " + (Dmg - (p1.getP1DEF()/2)) + " damage!");
                                Thread.sleep(900);
                                p1.takeDMG(Dmg);
                                if (p1.isDead()) {
                                    System.out.println(p1.getNAME() + " has fallen!");
                                } else {
                                    System.out.println(p1.getNAME() + " has " + p1.getHP() + " HP!");
                                }
                                able = true;
                            }
                        } else if (ch == 2) {
                            if (p2.isDead()) {

                            } else {
                                int Dmg = e.DealDMG();
                                System.out.println(e.getName() + " attacks " + p2.getNAME() + "!");
                                Thread.sleep(900);
                                System.out.println("Deals " + (Dmg - (p1.getP1DEF()/2)) + " damage!");
                                Thread.sleep(900);
                                p2.takeDMG(Dmg);
                                if (p2.isDead()) {
                                    System.out.println(p2.getNAME() + " has fallen!");
                                } else {
                                    System.out.println(p2.getNAME() + " has " + p2.getHP() + " HP!");
                                }
                                able = true;
                            }

                        } else if (ch == 3) {
                            if (p3.isDead()) {

                            } else {
                                int Dmg = e.DealDMG();
                                System.out.println(e.getName() + " attacks " + p3.getNAME() + "!");
                                Thread.sleep(900);
                                System.out.println("Deals " + (Dmg - (p1.getP1DEF()/2)) + " damage!");
                                Thread.sleep(900);
                                p3.takeDMG(Dmg);
                                if (p3.isDead()) {
                                    System.out.println(p3.getNAME() + " has fallen!");
                                } else {
                                    System.out.println(p3.getNAME() + " has " + p3.getHP() + " HP!");
                                }
                                able = true;
                            }

                        }
                    }
                    if (p1.isDead() && p2.isDead() && p3.isDead()) {
                        System.out.println("All party members have fallen!");
                        Thread.sleep(900);
                        System.out.println("------------------");
                        System.out.println("    GAME  OVER    ");
                        System.out.println("------------------");
                        Thread.sleep(900);
                        System.out.println("------FINAL STATS------");
                        W.PartyCheck(p1, p2, p3);
                    }
                    W.HealerCheck(p1, p2, p3);
                }

            } else if (choice == 2) {
                Enemy e = new Enemy(L);
                Enemy e2 = new Enemy(L);
                System.out.println("The party encounters a level " + e.getLevel() + " " + e.getName() + " and a level " + e.getLevel() + " " + e2.getName() + "!");
                System.out.println();

                while (!(e.isDEAD() && e2.isDEAD())) {
                    String input;
                    String input2;
                    String input3;

                    if (p1.isDead()) {
                        input = "0";
                    } else {
                        System.out.println();
                        System.out.println("What Shall " + p1.getNAME() + " do?");
                        System.out.println("1: Fight | 2: Block | 3: Check");
                        input = Scan.nextLine();
                    }

                    if (p2.isDead()) {
                        input2 = "0";
                    } else {
                        System.out.println();
                        System.out.println("What Shall " + p2.getNAME() + " do?");
                        System.out.println("1: Fight | 2: Block | 3: Check");
                        input2 = Scan.nextLine();
                    }

                    if (p3.isDead()) {
                        input3 = "0";
                    } else {
                        System.out.println();
                        System.out.println("What Shall " + p3.getNAME() + " do?");
                        System.out.println("1: Fight | 2: Block | 3: Check");
                        input3 = Scan.nextLine();
                    }

                    if (input.equals("1")) {
                        boolean temp = false;
                        while (!temp) {
                            System.out.println("Which enemy should " + p1.getNAME() + " attack?");
                            System.out.println("1: " + e.getName() + " | 2: " + e2.getName());
                            String y = Scan.nextLine();
                            if (y.equals("1")) {
                                e.takeDMG(p1.Attack(), p1.getNAME());
                                System.out.println();
                                temp = true;
                            } else if (y.equals("2")) {
                                e2.takeDMG(p1.Attack(), p1.getNAME());
                                System.out.println();
                                temp = true;
                            } else {
                                System.out.println("invalid option");
                            }
                        }
                    } else if (input.equals("2")) {
                        p1.Block(p1.getNAME());
                        System.out.println(p1.getNAME() + " now has " + p1.getHP() + " HP!");
                        System.out.println();
                    } else if (input.equals("3")) {
                        W.PartyCheck(p1, p2, p3);
                        e.Check(p1.getNAME());
                        e2.Check(p1.getNAME());
                    } else {

                    }

                    if (e.isDEAD() && e2.isDEAD()) {
                        break;
                    }

                    if (input2.equals("1")) {
                        boolean temp = false;
                        System.out.println("Which enemy should " + p2.getNAME() + " attack?");
                        System.out.println("1: " + e.getName() + " | 2: " + e2.getName());
                        String y = Scan.nextLine();
                        if (y.equals("1")) {
                            e.takeDMG(p2.Attack(), p2.getNAME());
                            System.out.println();
                            temp = true;
                        } else if (y.equals("2")) {
                            e2.takeDMG(p2.Attack(), p2.getNAME());
                            System.out.println();
                            temp = true;
                        } else {
                            System.out.println("invalid option");
                        }
                    } else if (input2.equals("2")) {
                        p2.Block(p2.getNAME());
                        System.out.println(p2.getNAME() + " now has " + p2.getHP() + " HP!");
                        System.out.println();
                    } else if (input2.equals("3")) {
                        W.PartyCheck(p1, p2, p3);
                        e.Check(p2.getNAME());
                        e2.Check(p2.getNAME());
                    } else {

                    }

                    if (e.isDEAD() && e2.isDEAD()) {
                        break;
                    }

                    if (input3.equals("1")) {
                        boolean temp = false;
                        System.out.println("Which enemy should " + p3.getNAME() + " attack?");
                        System.out.println("1: " + e.getName() + " | 2: " + e2.getName());
                        String y = Scan.nextLine();
                        if (y.equals("1")) {
                            e.takeDMG(p3.Attack(), p3.getNAME());
                            System.out.println();
                            temp = true;
                        } else if (y.equals("2")) {
                            e2.takeDMG(p3.Attack(), p3.getNAME());
                            System.out.println();
                            temp = true;
                        } else {
                            System.out.println("invalid option");
                        }
                    } else if (input3.equals("2")) {
                        p3.Block(p3.getNAME());
                        System.out.println(p3.getNAME() + " now has " + p3.getHP() + " HP!");
                        System.out.println();
                    } else if (input3.equals("3")) {
                        W.PartyCheck(p1, p2, p3);
                        e.Check(p3.getNAME());
                        e2.Check(p3.getNAME());
                    } else {

                    }

                    if (e.isDEAD() && e2.isDEAD()) {
                        break;
                    }

                    boolean able = false;
                    if (!e.isDEAD()) {
                        while (!able) {
                            int ch = (int) ((Math.random() * 3) + 1);
                            if (ch == 1) {
                                if (p1.isDead()) {

                                } else {
                                    int Dmg = e.DealDMG();
                                    System.out.println(e.getName() + " attacks " + p1.getNAME() + "!");
                                    Thread.sleep(900);
                                    System.out.println("Deals " + (Dmg - (p1.getP1DEF()/2)) + " damage!");
                                    Thread.sleep(900);
                                    p1.takeDMG(Dmg);
                                    if (p1.isDead()) {
                                        System.out.println(p1.getNAME() + " has fallen!");
                                    } else {
                                        System.out.println(p1.getNAME() + " has " + p1.getHP() + " HP!");
                                    }
                                    able = true;
                                }
                            } else if (ch == 2) {
                                if (p2.isDead()) {

                                } else {
                                    int Dmg = e.DealDMG();
                                    System.out.println(e.getName() + " attacks " + p2.getNAME() + "!");
                                    Thread.sleep(900);
                                    System.out.println("Deals " + (Dmg - (p1.getP1DEF()/2)) + " damage!");
                                    Thread.sleep(900);
                                    p2.takeDMG(Dmg);
                                    if (p2.isDead()) {
                                        System.out.println(p2.getNAME() + " has fallen!");
                                    } else {
                                        System.out.println(p2.getNAME() + " has " + p2.getHP() + " HP!");
                                    }
                                    able = true;
                                }

                            } else if (ch == 3) {
                                if (p3.isDead()) {

                                } else {
                                    int Dmg = e.DealDMG();
                                    System.out.println(e.getName() + " attacks " + p3.getNAME() + "!");
                                    Thread.sleep(900);
                                    System.out.println("Deals " + (Dmg - (p1.getP1DEF()/2)) + " damage!");
                                    Thread.sleep(900);
                                    p3.takeDMG(Dmg);
                                    if (p3.isDead()) {
                                        System.out.println(p3.getNAME() + " has fallen!");
                                    } else {
                                        System.out.println(p3.getNAME() + " has " + p3.getHP() + " HP!");
                                    }
                                    able = true;
                                }

                            }
                        }
                    }

                    able = false;
                    if (!e2.isDEAD()) {
                        while (!able) {
                            int ch = (int) ((Math.random() * 3) + 1);
                            if (ch == 1) {
                                if (p1.isDead()) {

                                } else {
                                    int Dmg = e2.DealDMG();
                                    System.out.println(e2.getName() + " attacks " + p1.getNAME() + "!");
                                    Thread.sleep(900);
                                    System.out.println("Deals " + (Dmg - (p1.getP1DEF()/2)) + " damage!");
                                    Thread.sleep(900);
                                    p1.takeDMG(Dmg);
                                    if (p1.isDead()) {
                                        System.out.println(p1.getNAME() + " has fallen!");
                                    } else {
                                        System.out.println(p1.getNAME() + " has " + p1.getHP() + " HP!");
                                    }
                                    able = true;
                                }
                            } else if (ch == 2) {
                                if (p2.isDead()) {

                                } else {
                                    int Dmg = e2.DealDMG();
                                    System.out.println(e2.getName() + " attacks " + p2.getNAME() + "!");
                                    Thread.sleep(900);
                                    System.out.println("Deals " + (Dmg - (p1.getP1DEF()/2)) + " damage!");
                                    Thread.sleep(900);
                                    p2.takeDMG(Dmg);
                                    if (p2.isDead()) {
                                        System.out.println(p2.getNAME() + " has fallen!");
                                    } else {
                                        System.out.println(p2.getNAME() + " has " + p2.getHP() + " HP!");
                                    }
                                    able = true;
                                }

                            } else if (ch == 3) {
                                if (p3.isDead()) {

                                } else {
                                    int Dmg = e2.DealDMG();
                                    System.out.println(e2.getName() + " attacks " + p3.getNAME() + "!");
                                    Thread.sleep(900);
                                    System.out.println("Deals " + (Dmg - (p1.getP1DEF()/2)) + " damage!");
                                    Thread.sleep(900);
                                    p3.takeDMG(Dmg);
                                    if (p3.isDead()) {
                                        System.out.println(p3.getNAME() + " has fallen!");
                                    } else {
                                        System.out.println(p3.getNAME() + " has " + p3.getHP() + " HP!");
                                    }
                                    able = true;
                                }

                            }


                        }
                    }
                    if (p1.isDead() && p2.isDead() && p3.isDead()) {
                        System.out.println("All party members have fallen!");
                        Thread.sleep(900);
                        System.out.println("------------------");
                        System.out.println("    GAME  OVER    ");
                        System.out.println("------------------");
                        Thread.sleep(900);
                        System.out.println("------FINAL STATS------");
                        W.PartyCheck(p1, p2, p3);
                    }
                    W.HealerCheck(p1, p2, p3);
                }

            }
            if (Math.random() > 0.2) {
                if (Math.random() > 0.5) {
                    L++;
                }
                L++;
            }
            W.UNILevel(p1, p2, p3);
        }
    }
}
