package simple;

import java.util.Random;

public class Sigma implements Creature {
    private String name;
    private int health;
    private boolean isMewing;

    public Sigma(String name) {
        this.name = name;
        this.health = 69;
        Random r = new Random();
        if (r.nextInt() % 2 == 0) {
            isMewing = true;
        } else {
            isMewing = false;
        }
    }

    @Override
    public int attack() {
        if (isMewing) {
            return 1;
        } else {
            return 8;
        }
    }

    public String meet() {
        if (isMewing)
            return "You're on your mewing streak, and a challenger appears on your path... or should we say, his path. It is him... The Sigma";
        else
            return "Ehmm what the sigma?!?. You're not mewing, prepare yourself for defeat... The Sigma himself appears";

    }

    public void takeDamage(int damage) {
        if (isMewing) {
            health -= damage + 5;
        } else {
            health -= damage;

        }

    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}