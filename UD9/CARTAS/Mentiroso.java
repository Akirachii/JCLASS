
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Pau Gra

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
            System.out.println("Tu mano: " + actual.getMano());
            System.out.println("Declara cartas de valor: " + valoractual);

            System.out.println("Cuantas cartas vas a jugar? ");
            int cantidad = scanner.nextInt();
            scanner.next();

            List<Carta> cartasJugadas = new ArrayList<>();
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Elige el índice de la carta a jugar: ");
                int indice = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                if (indice >= 0 && indice < actual.getMano().size()) {
                    cartasJugadas.add(actual.jugalCalta(indice));
                } else {
                    System.out.println("Índice inválido. Intenta de nuevo.");
                    i--; // Repetir la selección
                }
            }

            pila.addAll(cartasJugadas);

            System.out.print(rival.getNombre() + " Es falso?? (si/no): ");
            String answ = scanner.nextLine().toLowerCase();
            scanner.next();

            if (answ.equals("si")){
                boolean mentira = false;
                for (Carta c : cartasJugadas){
                    if (c.getValor() != valoractual){
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
