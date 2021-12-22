package lab2_prog;

import lab2_prog.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon regirock = new Regirock("Regi", 1);
        Pokemon carvanha = new Carvanha("Car", 1);
        Pokemon sharpedo = new Sharpedo("Shar", 1);
        Pokemon togepi = new Togepi("Gepi", 1);
        Pokemon togetic = new Togetic("Geti", 1);
        Pokemon togekiss = new Togekiss("Kis", 1);

        b.addAlly(regirock);
        b.addAlly(carvanha);
        b.addAlly(togepi);

        b.addFoe(togekiss);
        b.addFoe(togetic);
        b.addFoe(sharpedo);

        b.go();
    }
}