import javax.lang.model.element.Name;

public class Enemy {

    private String name;
    private int level;
    private int ATK = 0;
    private int DEF = 0;
    private int SPD = -1;
    private int HP = 8;

    private int BASE = 2;

    public Enemy(int L, String n) {

        if (n.equals("Zombie")) {

            ATK = 0;
            DEF = 0;
            SPD = -1;
            HP = 8;

            name = n;
            level = L;
            ATK += L;
            DEF += L;
            SPD += L;
            if (SPD >= 2) {
                SPD = 1;
            }
            HP += (L*2);
        } else if (n.equals("Skeleton")) {
            ATK = 1;
            DEF = 0;
            SPD = -1;
            HP = 6;

            name = n;
            level = L;
            ATK += L;
            DEF += L;
            SPD += L;
            if (SPD >= 2) {
                SPD = 1;
            }
            HP += (L*2);
        }  else if (n.equals("Ogre")) {
            ATK = 4;
            DEF = 2;
            SPD = 1;
            HP = 30;

            name = n;
            level = L;
            ATK += L;
            DEF += L;
            SPD += L;
            if (SPD >= 2) {
                SPD = 1;
            }
            HP += (L*2);
        }

    }

    public Enemy(int L) {
        int x = (int) ((Math.random() * 5) + 1);
        if (x < 2) {
            ATK = 0;
            DEF = 0;
            SPD = -1;
            HP = 8;

            name = "Zombie";
            level = L;
            ATK += L;
            DEF += L;
            SPD += L;
            if (SPD >= 2) {
                SPD = 1;
            }
            HP += (L*2);
        } else if (x < 4) {
            ATK = 1;
            DEF = 0;
            SPD = -1;
            HP = 6;

            name = "Skeleton";
            level = L;
            ATK += L;
            DEF += L;
            SPD += L;
            if (SPD >= 2) {
                SPD = 1;
            }
            HP += (L*2);
        } else {
            int y = (int) ((Math.random() * 5) + 1);
            if (y < 2) {
                ATK = 4;
                DEF = 2;
                SPD = 1;
                HP = 30;

                name = "Ogre";
                level = L;
                ATK += L;
                DEF += L;
                SPD += L;
                if (SPD >= 2) {
                    SPD = 1;
                }
                HP += (L*2);
            } else if(y < 4) {
                ATK = 6;
                DEF = 2;
                SPD = 1;
                HP = 25;

                name = "Ghoul";
                level = L;
                ATK += L;
                DEF += L;
                SPD += L;
                if (SPD >= 2) {
                    SPD = 1;
                }
                HP += (L*2);
            } else {
                ATK = 10;
                DEF = 3;
                SPD = 1;
                HP = 50;

                name = "DRAGON";
                level = L;
                ATK += L;
                DEF += L;
                SPD += L;
                if (SPD >= 2) {
                    SPD = 1;
                }
                HP += (L*2);
            }


        }
    }


    public int DealDMG() {
        if (Math.random() > 0.7) {
            System.out.println("Critical Hit!");
            return ATK * level * 2;
        } else {

            return ATK;
        }
    }

    public void Check(String n) throws InterruptedException {
        Thread.sleep(900);
        System.out.println(n + " checks enemy!");
        Thread.sleep(900);
        System.out.println();
        System.out.println(name + ": ");
        System.out.println("Atk: " + ATK);
        System.out.println("Def: " + DEF);
        System.out.println("HP: " + HP);
        System.out.println("Level: " + level);
        System.out.println();
        Thread.sleep(900);
    }

    public void takeDMG(int base, String n) throws InterruptedException {
        if (isDEAD()) {
            int DMG = (base - ((int) (DEF / 2)));
            if (DMG <= 0) {
                DMG = 1;
            }
            HP -= DMG;
            System.out.println(n + " attacks the corpse of " + name + "!");
            Thread.sleep(900);
            System.out.println(name + " takes " + DMG + " Damage!");
            Thread.sleep(900);
            System.out.println("Leaving it with " + HP + " health left!");
            Thread.sleep(900);
        } else {
            int DMG = (base - ((int) (DEF / 2)));
            if (DMG <= 0) {
                DMG = 1;
            }
            HP -= DMG;
            System.out.println(n + " attacks " + name + "!");
            Thread.sleep(900);
            System.out.println(name + " takes " + DMG + " Damage!");
            Thread.sleep(900);
            System.out.println("Leaving it with " + HP + " health left!");
            System.out.println();
            Thread.sleep(900);
        }


        if (isDEAD()) {
            System.out.println(name + " has fallen!");
            Thread.sleep(900);
        }
    }

    public boolean isDEAD() {
        return HP <= 0;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }




}