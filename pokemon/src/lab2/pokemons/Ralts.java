package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class Ralts extends Pokemon {
    public Ralts(String name, int level) {
        super(name, level);

        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(28, 25, 25, 45, 35, 40);
        setMove(new Facade(), new Swagger());
    }
}
