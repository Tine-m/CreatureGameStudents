package simple;

import java.util.Random;

public class Pdiddy implements Creature{
        private String name;
        private int health;
        private boolean isOiledUp;

        public Pdiddy(String name) {
            this.name = name;
            this.health = 25;
            Random r = new Random();
            if (r.nextInt() % 5 == 0) {
                isOiledUp = true;
            } else {
                isOiledUp = false;
            }
        }

        @Override
        public int attack() {

            if (isOiledUp)
                return 20;
            else
                return 2;
        }

        public String getName() {
            return name;
        }

        public void takeDamage(int damage) {
            if (isOiledUp)
                health -= damage;
            else
                health -= (damage + 1);
        }

        public int getHealth() {
            return health;
        }

        @Override
        public String meet() {
            if (isOiledUp)
                return "Diddy is oiled up and ready!";
            else
                return "Diddy is out of baby oil, now's your chance to attack!";
        }
    }
