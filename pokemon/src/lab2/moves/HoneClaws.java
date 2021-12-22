package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class HoneClaws extends StatusMove {
    public HoneClaws() {
        super(Type.DARK, 0, 0);
    }

    @Override
    protected String describe() {
        return "точит коготки";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 1);
        pokemon.setMod(Stat.ACCURACY, 1);
    }
}
