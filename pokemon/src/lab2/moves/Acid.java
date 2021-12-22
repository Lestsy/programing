package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Acid extends SpecialMove {
    public Acid(){
        super(Type.POISON, 40, 100);
    }

    @Override
    protected String describe(){
        return "плюётся ядом";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() <= 0.1) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
}
