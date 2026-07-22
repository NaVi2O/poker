import java.util.Scanner;


void main() {

    int numJugadores;
    int jugAbandona;
    String carta1P;
    String carta2P;
    String cartaPreFlop1;
    String cartaPreFlop2;
    String cartaPreFlop3;
    String cartaFlop;
    String cartaTurn;
    boolean validacion1 = false;


    Cartas cartas = new Cartas();
    Scanner sc = new Scanner(System.in);


    System.out.println("Cuantos Jugadores hay en tu mesa: ");
    numJugadores = sc.nextInt();
    sc.nextLine();
    Jugadores jugadores = new Jugadores(numJugadores);


    System.out.println("Pasa las dos cartas que te han tocado en la mano");
    System.out.println("Con este formato (3C, 6T, KP...)");
    System.out.println("CORAZONES = C \nTREBOLES = T\nPICAS = P\nROMBOS = R\n\n");

    //Carta MANO 1
    System.out.printf("CARTA-MANO-1 =");
    carta1P = sc.nextLine();
    while(cartas.validacionCarta1(carta1P) != true){
        System.out.printf("CARTA-MANO-1 =");
        carta1P = sc.nextLine();

    }

    //Carta MANO 2
    System.out.printf("CARTA-MANO-2 =");
    carta2P = sc.nextLine();
    while(cartas.validacionCarta2(carta2P) != true){
        System.out.printf("CARTA-MANO-2 =");
        carta1P = sc.nextLine();

    }










}
