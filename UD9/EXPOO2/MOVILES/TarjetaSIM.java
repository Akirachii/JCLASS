

public class TarjetaSIM {
    private String num;
    private Integer sec;


    public TarjetaSIM (String num){
        this.num=num;
        this.sec=0;

        
    }

    public String getNum() {return num;}

    public void setNum(String num) {this.num = num;}

    public Integer getSec() {return sec;}

    public void setSec(Integer sec) {this.sec = sec;}


    public void llama(TarjetaSIM sim,int secsCall){
        this.sec+= secsCall;
        sim.sec+= secsCall;
    }
    
    public String toString(){
        return "Num. " + num + " - " + sec + "s de conexion";
    }

}


