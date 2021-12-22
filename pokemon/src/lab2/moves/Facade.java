package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    private boolean flag;

    public Facade(){super(Type.NORMAL, 70, 100);}

    @Override
    protected String describe(){
        if (flag) return "даёт двойного чапалаха";
        return "даёт чапалаха";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double b) {
        Status condition = pokemon.getCondition();
        if (condition.equals(Status.BURN) || condition.equals(Status.POISON) || condition.equals(Status.PARALYZE)) {
            flag = true;
            pokemon.setMod(Stat.HP, -2*(int) Math.round(b));
        }
    }
}
