import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Carta> mano;

    public Jugador (String nombre){
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public void getmano(Carta carta){
        if (carta != null){
            mano.add(carta);
        }
    }

    public Carta jugalCalta(int indice){
        if (indice >= 0 && indice < mano.size()){
            return mano.remove(indice);
        }
        return null;
    }

    public String getNombre() {return nombre;}

    public List<Carta> getMano() {return mano;}

    




}
