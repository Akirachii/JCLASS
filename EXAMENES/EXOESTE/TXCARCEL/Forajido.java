public class Forajido{
    String nombre;
    Integer precio;
    boolean capturado=false;

    public Forajido(String nombre, int precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre() {return nombre;}
    public String getPrecio() {return precio;}
    public boolean getCapturado() {return capturado;}
    public void setcapturado(boolean capturado) {this.capturado = capturado;}

    public void captura(Forajido f){
        if (!getCapturado){
            capturas.add(getNombre);
            setcapturado(true);
        }
    }

}