package lab2_prog.pokemons;

import lab2_prog.moves.*;

public class Togekiss extends Togetic {
    public Togekiss(String name, int level) {
        super(name, level);

        setStats(85, 50, 95, 120, 115, 80);
        addMove(new Tackle());
    }
}