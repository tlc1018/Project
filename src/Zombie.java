import java.util.logging.Level;

public class Zombie {

    private int level;
    private int ATK = 0;
    private int DEF = 0;
    private int SPD = -1;
    private int HP = 8;

    private int BASE = 2;

    public Zombie(int L) {
        level = L;
        ATK += L;
        DEF += L;
        SPD += L;
        if (SPD >= 2) {
            SPD = 1;
        }
        HP += (L*2);
    }

    public int DealDMG() {
        return BASE * level;
    }

    public void LowerATK() {
        ATK -= 1;
        if (ATK == 0) {
            ATK = 1;
            System.out.println("Zombies Attack is at its minimum!");
        }
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




}
