package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class SteelWing extends PhysicalMove {
    public SteelWing(){
        super(Type.STEEL, 70, 90);
    }

    @Override
    protected String describe(){
        return "махает стальными крыльями";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        if (Math.random() <= 0.1) {
            pokemon.setMod(Stat.DEFENSE, 1);
        }
    }
}
