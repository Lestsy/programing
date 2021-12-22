package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Roost extends SpecialMove {
    public Roost() {
        super(Type.FLYING, 0, 0);
    }

    @Override
    protected String describe() {
        return "обаятельно стреляет глазками";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, -(int)pokemon.getHP()/2);

    }
}
