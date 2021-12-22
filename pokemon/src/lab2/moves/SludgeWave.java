package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class SludgeWave extends SpecialMove {
    public SludgeWave(){
        super(Type.POISON, 95, 100);
    }

    @Override
    protected String describe(){
        return "отправляет волны грязюки";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() <= 0.1) {
            Effect.poison(pokemon);
        }
    }
}