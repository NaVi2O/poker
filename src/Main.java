import java.util.Scanner;


void main() {
    Scanner sc = new Scanner(System.in);
    Cartas cartas = new Cartas();


    cartas.TomarJugadores();

    System.out.println("Las cartas se deben representar = ");
    System.out.println("A   2   3   4       ||\n5   6   7   8       ||+ ( ❤=C // ♣=T // ♠=P // \uD83D\uDD36 =R )\n9   10  J   Q   K   ||");

    cartas.PreFlopTomarDatosYValido();

    cartas.MonteCarloPreFlop();

    cartas.tomarDatosDeFlop();






}
