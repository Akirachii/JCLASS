
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
        double rate=0.0;
        if (getTarif().equalsIgnoreCase("plata")){
            rate=0.10;
        } else if (getTarif().equalsIgnoreCase("oro")) {
            rate=0.06;
        } else if (getTarif().equalsIgnoreCase("platinum")){
            rate= 0.03;
        }
        double costOfCall =(secsCall/60.0) *rate;
         
        this.cost+= costOfCall;
        super.llama(sim, secsCall);
    }

    
    @Override
    public String toString(){
        return super.toString() + " - " +  String.format("%.3f", cost) + " euros de gasto";
    }

}