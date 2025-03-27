import java.util.Scanner;
public class Forajido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt; // cnt= "cantidad" de lineas a leer
        cnt = sc.nextInt(); 
        do{
            for (int i=0;cnt >= i;i++){
                String linea = sc.nextLine();
                String[] nombre = linea.split(" ");
                System.out.println(nombre[1]);
            }


        }while(cnt != 0);
        

    }

}