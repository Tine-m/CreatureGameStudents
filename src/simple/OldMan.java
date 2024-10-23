package simple;
import java.util.Random;

public class OldMan implements Creature {

    int health;
    String name;
    boolean kind;

    public OldMan(String name) {
        this.health = 20;
        this.name = name;
        Random r = new Random();
        if (r.nextInt() % 2 == 0) {
            kind = true;
        } else {
            kind = false;
        }
    }

    @Override
    public int attack() {
        if (kind) {
            return -1;
        }
        System.out.println("Foolish mortal Dare oppose ME!");
        return 10;
    }

    public void takeDamage(int damage) {
        if (kind){
            health -= damage*3;
            System.out.println("Why would you do this stranger?");
        }
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String meet() {
        return "down the road comes an old man";
    }
}

