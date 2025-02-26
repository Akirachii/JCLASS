
public class Vehiculo{
    public static Integer VehiculosCreados=0;
    public static Integer KilometrosTotales=0;
    public Integer KilometrosRecoridos;


    public Vehiculo (){
        this.KilometrosRecoridos=0;
        VehiculosCreados++;
    }

    public void RecorrerKm(int km){
        if (km>0) {
            this.KilometrosRecoridos+=km;
            KilometrosTotales+=km;
        }

    }

    public static Integer getVehiculosCreados() {return VehiculosCreados;}

    public static Integer getKilometrosTotales() {return KilometrosTotales;}

    public Integer getKilometrosRecoridos() {return KilometrosRecoridos;}

}