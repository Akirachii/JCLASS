public class Viaje {
    private String nombre;
    private int nasientos;
    private String[] asientos;

    public Tren(){
        nombre = "Virtual";
        nasientos = 1;
    }

    public Tren(String nombre, int nasientos){
        this.nombre = nombre;
        this.nasientos = nasientos;
        this.asientos = new String[nasientos];
    }

}
