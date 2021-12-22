package lab2;

import lab2.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon ralts = new Ralts("Китти", 1);
        Pokemon lileep = new Lileep("Вжик", 1);
        Pokemon cradily = new Cradily("Чертополох", 1);
        Pokemon kirlia = new Kirlia("Киришима", 1);
        Pokemon gardevoir = new Gardevoir("Мать-природа", 1);
        Pokemon hawlucha = new Hawlucha("Орёль", 1);

        b.addAlly(ralts);
        b.addAlly(cradily);
        b.addAlly(gardevoir);

        b.addFoe(hawlucha);
        b.addFoe(lileep);
        b.addFoe(kirlia);

        b.go();
    }
}
