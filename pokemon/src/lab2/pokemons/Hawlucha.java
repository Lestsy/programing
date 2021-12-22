package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class Hawlucha extends Pokemon {
    public Hawlucha(String name, int level) {
        super(name, level);

        setType(Type.FIGHTING, Type.FLYING);
        setStats(78, 92, 75, 74, 63, 118);
        setMove(new SteelWing(), new FocusBlast(), new HoneClaws(), new Roost());
    }
}
