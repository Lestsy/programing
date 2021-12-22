package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Charm extends StatusMove {
    public Charm() {
        super(Type.FAIRY, 0, 100);
    }

    @Override
    protected String describe() {
        return "обаятельно стреляет глазками";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -2);
    }
}
