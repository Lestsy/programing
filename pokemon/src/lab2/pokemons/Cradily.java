package lab2.pokemons;

import lab2.moves.*;

public class Cradily extends Lileep {
    public Cradily(String name, int level) {
        super(name, level);

        setStats(86, 81, 97, 81, 107, 43);
        setMove(new SludgeWave());
    }
}
