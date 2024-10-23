package simple;

import java.util.Random;

public class Skeleton implements Creature {
    private int health;
    private String name;
    private Random rand = new Random();

    public Skeleton(String name) {
        this.health = 5;
        this.name = name;
    }

    @Override
    public int attack() {
        return (int)rand.nextInt(10);
    }

    @Override
    public String meet() {
        return "a skeleton steps from the shadows, its hollow eyes glowing faintly as it gestures toward you with a bony hand, silent but menacing.";
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
