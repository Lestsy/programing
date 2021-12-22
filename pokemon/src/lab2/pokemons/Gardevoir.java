package lab2.pokemons;

import lab2.moves.*;

public class Gardevoir extends Kirlia {
    public Gardevoir (String name, int level) {
        super(name, level);

        setStats(68, 65, 65, 125, 115, 80);
        setMove(new Psychic());
    }
}
