import java.util.Scanner;

public class Forajido {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int carteles = Integer.valueOf(sc.next());

        while (carteles != 0){
            String elMejorF="malono";
            int mayor=0;
            int peor=10;

            for (int i=0;i<carteles;i++){
                String nombre=sc.next();
                int recompensa=Integer.parseInt(sc.next());
                int punteria=Integer.parseInt(sc.next());
                if(recompensa > mayor || (recompensa == mayor && peor > punteria)){
                    elMejorF=nombre;
                    mayor=recompensa;
                    peor=punteria;
                }
            }
            carteles = Integer.valueOf(sc.next());
        }  
    }
}
