package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall(){
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected String describe() {
        return "использует силы природы в корыстных целях";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
        }
    }
}
