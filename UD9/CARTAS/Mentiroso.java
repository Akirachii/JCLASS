
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Pau Gra
// no se como lo he hecho 

public class Mentiroso {
    private Jugador p1;
    private Jugador p2;
    private Baraja baraja;
    private Scanner scanner;
    private List<Carta> pila;
    private Integer valoractual;


    public Mentiroso(String n1,String n2){
        this.p1 = new Jugador(n1);
        this.p2 = new Jugador(n2);
        this.baraja = new Baraja();
        this.scanner = new Scanner(System.in);
        this.pila = new ArrayList<>();
        ReparCartas();
        this.valoractual = 1;

    }


    private void ReparCartas(){
        for (int i = 0; i < 5; i++) {
            p1.getmano(baraja.repartiCarta());
            p2.getmano(baraja.repartiCarta());
        }
    }

    public void juego(){
        Jugador actual = p1;
        Jugador rival = p2;

        while (!p1.getMano().isEmpty() && !p2.getMano().isEmpty()){
            System.out.println("turno de " + actual.getNombre());
            mostrarMano(actual);
            System.out.print("¿Qué valor de carta vas a jugar? ");
            int valorDeclarado = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea


            System.out.println("Cuantas cartas vas a jugar? ");
            int cantidad = scanner.nextInt();

            List<Carta> cartasJugadas = new ArrayList<>();
            for (int i = 0; i <= cantidad; i++) {
                System.out.print("Elige el índice de la carta a jugar: ");
                int indice = scanner.nextInt();
                scanner.nextLine(); //limpiar
                if (indice >= 0 && indice < actual.getMano().size()) {
                    cartasJugadas.add(actual.jugalCalta(indice));
                } else { 
                    System.out.println("Índice inválido. Intenta de nuevo.");
                    i--; // Repetir la selección
                }
            }

            pila.addAll(cartasJugadas);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print(rival.getNombre() + " Es falso?? (si/no): ");
            String answ = scanner.nextLine().toLowerCase();
            

            if (answ.equals("si")){
                boolean mentira = false;
                for (Carta c : cartasJugadas){
                    if (c.getValor() != valorDeclarado){
                        mentira = true;
                        break;
                    }
                }

                if (mentira){
                    System.out.println(actual.getNombre() + " Ha mentido! Aqui tienes las cartas de la pila: ");
                    actual.getMano().addAll(pila);
                } else {
                    System.out.println(rival.getNombre() + " se ha equivocado! Aqui tienes las cartas de la pila: ");
                    rival.getMano().addAll(pila);
                }
                pila.clear();
            }
            if (actual.getMano().isEmpty()){
                System.out.println(actual.getNombre() + " ha ganado ");
                break;
            }
            Jugador temp = actual;
            actual = rival;
            rival = temp;

            valoractual = (valoractual % 12)+1;
        }
    }


    private void mostrarMano(Jugador jugador) {
        System.out.println("Tu mano:");
        System.out.println("+---------------+");
        System.out.println("| Carta | Valor |");
        System.out.println("+---------------+");
        
        List<Carta> mano = jugador.getMano();
        for (int i = 0; i < mano.size(); i++) {
            System.out.printf("| %-5d | %-5s |\n", i , mano.get(i).getValor());
        }
        
        System.out.println("+---------------+");
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del Jugador 1: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese el nombre del Jugador 2: ");
        String nombre2 = scanner.nextLine();
        
        Mentiroso juego = new Mentiroso(nombre1, nombre2);
        juego.juego();
        scanner.close();
    }
}
