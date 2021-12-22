package lab2_prog.pokemons;

import lab2_prog.moves.*;
import ru.ifmo.se.pokemon.*;

public class Togepi extends Pokemon {
    public Togepi(String name, int level) {
        super(name, level);

        setType(Type.FAIRY);
        setStats(35, 20, 65, 40, 65, 20);
        setMove(new Rest(), new Swagger());
    }
}