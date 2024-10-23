package simple;

import java.util.Random;

public class Daddy implements Creature {
    private int health;
    private String name;
    private boolean isMad;

    public Daddy(String name) {
        this.health = 25;
        this.name = name;
        Random r = new Random();
        if (r.nextInt() % 2 == 0) {
            isMad = true;
        } else {
            isMad = false;
        }

    }

    @Override
    public int attack() {
        if (isMad)
            return 7;
        else
            return 2;
    }

    public void takeDamage(int damage) {
        if (isMad)
            health -= damage;
        else
            health -= (damage + 1);
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return this.name;
    }


    @Override

    public String meet() {
        return "From the sky a Creature " + name + " with a size 50 sandal comes down yelling Shahada!!";
    }
}