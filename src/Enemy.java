import javax.lang.model.element.Name;

public class Enemy {

    private String name;
    private int level;
    private int ATK = 0;
    private int DEF = 0;
    private int SPD = -1;
    private int HP = 8;

    private int BASE = 2;
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
            ATK = 4;
            DEF = 2;
            SPD = 1;
            HP = 30;

            name = Ogre;
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

    public int DealDMG() {
        if (Math.random() > 0.7) {
            System.out.println("Critical Hit!");
            return ATK * level * 2;
        } else {

            return ATK * level;
        }
    }

    public void LowerATK() {
        ATK -= 1;
        if (ATK == 0) {
            ATK = 1;
            System.out.println("Zombies Attack is at its minimum!");
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

    public void RaiseATK() {
        ATK += 1;
    }

    public void LowerDEF() {
        DEF -= 1;
        if (DEF == 0) {
            DEF = 1;
            System.out.println("Zombies Defense is at its minimum!");
        }
    }

    public void RaiseDEF() {
        DEF += 1;
    }

    public void takeDMG(int base, String n) throws InterruptedException {
        int DMG = (base - DEF);
        if (DMG <= 0) {
            DMG = 1;
        }
        HP -= DMG;
        System.out.println(n + " attacks Zombie!");
        Thread.sleep(900);
        System.out.println("Zombie takes " + DMG + " Damage!");
        Thread.sleep(900);
        System.out.println("Leaving it with " + HP + " health left!");
        Thread.sleep(900);

        if (isDEAD()) {
            System.out.println("Zombie has fallen!");
            Thread.sleep(900);
        }
    }

    public boolean isDEAD() {
        return HP <= 0;
    }

    public int getDEF() {
        return DEF;
    }
    public int getSPD() {
        return SPD;
    }

    public int getHP() {
        return HP;
    }

    public String getName() {
        return name;
    }




}
