import java.util.Scanner;

public class MenuVehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans;
        Bicicleta miBici = new Bicicleta();
        Coche miCoche = new Coche();

        do {
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda en bicicleta");
            System.out.println("2. Anda en coche");
            System.out.println("3. Ver kilometraje de la bicicleta");
            System.out.println("4. Ver kilometraje del coche");
            System.out.println("5. Ver kilometraje total");
            System.out.println("6. Ver vehículos totales");
            System.out.println("7. Salir");
            System.out.print("Elige una opción (1-7): ");
            
            ans = sc.nextInt();
            switch (ans) {
                case 1:
                    System.out.println("Me pregunto cuantos km deberiamos hacer..");
                    int kmvici =sc.nextInt();
                    miBici.RecorrerKm(kmvici);
                    break;
                case 2:
                    System.out.println("Me pregunto cuantos km deberiamos hacer..");
                    int kmchx = sc.nextInt();
                    miCoche.RecorrerKm(kmchx);
                    break;
                case 3:
                    System.out.println("Mostrando kilometraje de la bicicleta.");
                    miBici.getKilometrosRecoridos();
                    break;
                case 4:
                    System.out.println("Mostrando kilometraje del coche.");
                    miCoche.getKilometrosRecoridos();
                    break;
                case 5:
                    System.out.println("Mostrando kilometraje total.");
                    Vehiculo.getKilometrosTotales();
                    break;
                case 6:
                    System.out.println("Mostrando vehículos totales.");
                    Vehiculo.getVehiculosCreados();
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
            System.out.println();
        } while (ans != 7);
        
    }
}