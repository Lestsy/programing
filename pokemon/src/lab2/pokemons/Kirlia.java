package lab2.pokemons;

import lab2.moves.*;

public class Kirlia extends Ralts {
    public Kirlia(String name, int level) {
        super(name, level);

        setStats(38, 55, 35, 65, 55, 50);
        setMove(new Charm());
    }
}
