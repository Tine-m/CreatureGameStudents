package simple;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Goblin implements Creature {

    private String name;
    private int health;
    private boolean isNight;



    public Goblin(String name) {
        this.name = name;
        this.health = 15;
        Random r = new Random();
        isNight = r.nextInt() % 2 == 0;
    }

    @Override
    public int attack() {
        if (isNight) {
            return 6;
        } else {
            return 2;
        }
    }

    @Override
    public String meet() {
        if (isNight) {
            return "The Giant Goblin King Dobby comes out of his UnderGround Kingdom to destoy your body";
        }
        else {
            return "it is dayLight and The Giant Goblin king feels a human scent and opens his eyes";
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isNight) {
            health -= damage;
        } else {
            health -= (damage+1);
        }

    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }
}
