package lab2_prog.pokemons;

import lab2_prog.moves.*;
import ru.ifmo.se.pokemon.*;

public class Togetic extends Togepi {
    public Togetic(String name, int level) {
        super(name, level);

        addType(Type.FLYING);
        setStats(55, 40, 85, 80, 105, 40);
        addMove(new Waterfall());
    }
}