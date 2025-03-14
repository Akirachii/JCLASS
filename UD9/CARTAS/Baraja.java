// Pau Gra
// Clase Baraja, para determinar las cartas, hacer mazos

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> cartas;
    private static final String[] PALOS = {"Oros", "Copas", "Espadas", "Bastos"};

    public Baraja(){
        cartas = new ArrayList<>();
        for (String palo : PALOS){
            for (int valor = 1; valor <=12; valor++) {
                cartas.add(new Carta(palo, valor));
            }
        }
        barajar();
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta repartiCarta(){
        if (!cartas.isEmpty()){
            return cartas.remove(0);
        }
        return null; // me he quedao sin cartas
    }

    public boolean estaVacia(){
        return cartas.isEmpty();
    }

}
