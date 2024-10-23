package simple;

import java.util.ArrayList;
import java.util.Random;


public class CreatureGenerator {

    private ArrayList<Creature> creatures = new ArrayList<>();
    int counter = 0;
    public CreatureGenerator(){
        //generateCreatures();
    }

    public void generateCreatures() {
        //creatures.add(new Spider("Shelob"));
        //creatures.add(new Dragon("Puff"));
        //creatures.add(new Spider("Peter"));
        //creatures.add(new Dragon("Smaug"));
        creatures.add(new OldMan("Emil"));
        creatures.add(new Daddy("Abbas"));
        creatures.add(new Skeleton("Thomas"));
        creatures.add(new Goblin("Philip-Mikkel"));
        creatures.add(new Sigma("Jonas"));
        creatures.add(new Sigma("Marcus"));
        creatures.add(new Pdiddy("William"));
        creatures.add(new OldMan("Emil"));
    }

    public Creature getRandomCreature() {
        Random r = new Random();
        int i = r.nextInt(creatures.size());
        return creatures.get(i);
    }

    public Creature getNextCreature() {
        if (counter == creatures.size()) {
            counter = 0;
        }
       return creatures.get(counter++);
    }
}
