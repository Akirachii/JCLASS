public class Carcel {
    String nombre;
    ArrayList presidiarios;

    public Carcel(String nombre){
        this.nombre=nombre;

    }

    public String getNombre() {return nombre;}

    public void meterCarcel(forajido f, Carcel c){
        presidiarios.add(f);
        capturas.remove(f);
        Pistolero.recompensa+=Forajido.precio;
    }

    
}