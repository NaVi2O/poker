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


    Scanner sc = new Scanner(System.in);


    System.out.println("Cuantos Jugadores hay en tu mesa: ");
    numJugadores = sc.nextInt();
    sc.nextLine();
    Jugadores jugadores = new Jugadores(numJugadores);











}
