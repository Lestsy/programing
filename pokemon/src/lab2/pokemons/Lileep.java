package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class Lileep extends Pokemon {
    public Lileep(String name, int level) {
        super(name, level);

        setType(Type.ROCK, Type.GRASS);
        setStats(66, 41, 77, 61, 87, 23);
        setMove(new Acid(), new Rest(), new EnergyBall());
    }
}
