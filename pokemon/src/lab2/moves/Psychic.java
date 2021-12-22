package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic(){
        super(Type.POISON, 90, 100);
    }

    @Override
    protected String describe(){
        return "произносит заклинание Законус подлостус";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() <= 0.1) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
}
