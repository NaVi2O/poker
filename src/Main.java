import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numJugadores;
        int jugAbandona;
        String valoracionAbandona;
        String carta1P;
        String carta2P;
        String cartaPreFlop1;
        String cartaPreFlop2;
        String cartaPreFlop3;

        Cartas cartas = new Cartas();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos Jugadores hay en tu mesa: ");
        numJugadores = sc.nextInt();
        sc.nextLine();
        Jugadores jugadores = new Jugadores(numJugadores);

        System.out.println("Pasa las dos cartas que te han tocado en la mano");
        System.out.println("Con este formato (3C, 6T, KP...)");
        System.out.println("CORAZONES = C \nTREBOLES = T\nPICAS = P\nROMBOS = R\n\n");

        // Carta MANO 1
        System.out.printf("CARTA-MANO-1 = ");
        carta1P = sc.nextLine();
        while (!cartas.validacionCarta1(carta1P)) {
            System.out.printf("CARTA-MANO-1 = ");
            carta1P = sc.nextLine();
        }

        // Carta MANO 2
        System.out.printf("CARTA-MANO-2 = ");
        carta2P = sc.nextLine();
        while (!cartas.validacionCarta2(carta2P)) {
            System.out.printf("CARTA-MANO-2 = ");
            carta2P = sc.nextLine();
        }

        // SALE ALGUIEN?
        System.out.println("Hay algun jugador que abandona la partida (SI[S] O NO[N])");
        System.out.printf("Conteste aqui = ");
        valoracionAbandona = sc.nextLine();
        System.out.println(" ");
        while (!valoracionAbandona.equals("N") && !valoracionAbandona.equals("S")) {
            System.out.println("Hay algun jugador que abandona la partida (SI[S] O NO[N])");
            System.out.printf("Conteste aqui = ");
            valoracionAbandona = sc.nextLine();
            System.out.println(" ");
        }
        if (valoracionAbandona.equals("S")) {
            System.out.println("Cuantos abandonan = ");
            jugAbandona = sc.nextInt();
            sc.nextLine();
            jugadores.arregloJugadores(jugAbandona);
        }

        // AQUI ENTRA LA PRIMERA PREDICCION

        // PREFLOP
        System.out.println("Pasa las tres cartas que han salido en la mesa");
        System.out.println("Con este formato (3C, 6T, KP...)");
        System.out.println("CORAZONES = C \nTREBOLES = T\nPICAS = P\nROMBOS = R\n\n");

        // Carta MESA 1
        System.out.printf("CARTA-MESA-1 = ");
        cartaPreFlop1 = sc.nextLine();
        while (!cartas.validacionCarta1Mesa(cartaPreFlop1)) {
            System.out.printf("CARTA-MESA-1 = ");
            cartaPreFlop1 = sc.nextLine();
        }

        // Carta MESA 2
        System.out.printf("CARTA-MESA-2 = ");
        cartaPreFlop2 = sc.nextLine();
        while (!cartas.validacionCarta2Mesa(cartaPreFlop2)) {
            System.out.printf("CARTA-MESA-2 = ");
            cartaPreFlop2 = sc.nextLine();
        }

        // Carta MESA 3
        System.out.printf("CARTA-MESA-3 = ");
        cartaPreFlop3 = sc.nextLine();
        while (!cartas.validacionCarta3Mesa(cartaPreFlop3)) {
            System.out.printf("CARTA-MESA-3 = ");
            cartaPreFlop3 = sc.nextLine();
        }

        System.out.println("Cartas de mano: " + carta1P + ", " + carta2P);
        System.out.println("Flop: " + cartaPreFlop1 + ", " + cartaPreFlop2 + ", " + cartaPreFlop3);

        sc.close();
    }
}