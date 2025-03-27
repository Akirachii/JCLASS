import java.util.Scanner;

public class Oeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Carceles
        Carcel ss = new Carcel("SingSing");
        Carcel alc = new Carcel("Alcatraz");

        //Forajidos
        Forajido f1 = new Forajido("PatxiPistolas",1000);
        Forajido f2 = new Forajido("ClintEastwood",5000);
        Forajido f3 = new Forajido("KillerTatay",7200);
        Forajido f4 = new Forajido("BerlanasBill",9400);
        Forajido f5 = new Forajido("BillyKid",7000);

        //Pistoleros
        Pistolero p1 = new Pistolero("JoeElRapido");
        Pistolero p2 = new Pistolero("SuperMaton");

        f1.setPrecio(2000);  //Cambia el precio de f1 a 2000$ 
        p1.captura(f1);  //p1 captura f1
        p1.captura(f2);  //p1 captura f2
        f2.setPrecio(8000); //No se puede cambiar el precio, ya ha sido capturado
        p2.captura(f4);  //p2 captura f4
        p2.captura(f2); //No puede capturarlo, ya lo capturó p1
        p1.captura(f5);  //p1 captura f5

        System.out.println(p1.getCapturas());
        p1.meterCarcel(f5,ss); //Mete en la carcel f5 y cobra la recompensa
        p2.meterCarcel(f2,ss); //No puede meterlo en la carcel porque no lo ha capturado él
        p1.meterCarcel(f1,ss); //Mete en la carcel f1 y cobra la recompensa
        p2.meterCarcel(f4,ss); //Mete en la carcel f4 y cobra la recompensa
        p1.meterCarcel(f5,alc); //No puede meter en la carcel, ya está en la carcel
        p1.meterCarcel(f2,alc); //Mete en la carcel f2 y cobra la recompensa

        //Imprime la información de los pistoleros
        System.out.println(p1.getRecompensa());
        System.out.println(p2.getRecompensa());

        //Imprime la información de las cárceles
        System.out.println(ss);
        System.out.println(alc);
        
    } //Fin del main
} //Fin del programa
   