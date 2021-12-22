package lab2_prog.pokemons;

import lab2_prog.moves.*;

public class Sharpedo extends Carvanha {
    public Sharpedo(String name, int level) {
        super(name, level);

        setStats(70, 120, 40, 95, 40, 95);
        addMove(new BubbleBeam());
    }
}