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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        // Encabezado de la tabla
        sb.append("+----+--------+--------+\n");
        sb.append("| #  | Valor  | Palo   |\n");
        sb.append("+----+--------+--------+\n");

        // Contenido de la tabla
        for (int i = 0; i < mano.size(); i++) {
            Carta c = mano.get(i);
            sb.append(String.format("| %-2d | %-6d | %-6s |\n", i + 1, c.getValor(), c.getPalo()));
        }

        // Línea final de la tabla
        sb.append("+----+--------+--------+\n");

        return sb.toString();
    }




}
