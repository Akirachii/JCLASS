// Pau Gra


public class Carta {
    private String palo;
    private Integer valor;



    public Carta (String palo, int valor){
        this.palo=palo;
        this.valor=valor;
    }


    public String getPalo() {return palo;}

    public Integer getValor() {return valor;}


    @Override
    public String toString() {
        return "Carta [palo=" + palo + ", valor=" + valor + "]";
    }


}