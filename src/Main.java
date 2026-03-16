import java.util.Scanner;


void main() {

    int jugadores = 0;//solo contrincantes
    String preflop1;
    String preflop2;

    Scanner sc = new Scanner(System.in);

    System.out.println("Los jugadores sin contarte a ti = ");
    jugadores = sc.nextInt();
    sc.nextLine();

    System.out.println("Las cartas se deben representar = ");
    System.out.println("A   2   3   4\n5   6   7   8    + ( ❤=C // ♣=T // ♠=P // \uD83D\uDD36 =R )\n9   J   Q   K");

    System.out.println("Introduce tus 2 cartas (ej: AC KP): ");
    preflop1 = sc.nextLine();
    preflop2 = sc.nextLine();




}
