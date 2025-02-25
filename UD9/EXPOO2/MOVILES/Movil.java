package MOVILES;

public class Movil extends TarjetaSIM {

    private String tarif;
    private Double cost;

    public Movil (String telf, String tarif){
        super(telf);
        this.tarif=tarif;
        this.cost=0.0;
    }

    public String getTarif() {return tarif;}
    public void setTarif(String tarif) {this.tarif = tarif;}
    public Double getCost() {return cost;}
    public void setCost(Double cost) {this.cost = cost;}


    @Override
    public void llama (TarjetaSIM sim , int secsCall){
        double rate = switch (tarif.toLowerCase()) {
            case "plata" -> 0.10;
            case "oro" -> 0.06;
            case "platinum" -> 0.03;
            default -> 0.00;  // Default case (if the tarif is unknown)
        };
        super.llama(sim, secsCall);
        double costOfCall =(secsCall/60.0) *rate;
        this.cost+= costOfCall;
        
    }

    
    @Override
    public String toString(){
        return super.toString() + " - " +  String.format("%.3f", cost) + " euros de gasto" + tarif;
    }

}