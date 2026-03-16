import java.util.Scanner;
import java.util.Arrays;

public class Cartas {
    String preflop1, preflop2;
    String palo;
    String valor;

    Scanner sc = new Scanner(System.in);


    String[] todasCartas = {
            // Corazones (C)
            "AC","2C","3C","4C","5C","6C","7C","8C","9C","JC","QC","KC","10C",
            // Tréboles (T)
            "AT","2T","3T","4T","5T","6T","7T","8T","9T","JT","QT","KT","10T",
            // Picas (P)
            "AP","2P","3P","4P","5P","6P","7P","8P","9P","JP","QP","KP","10P",
            // Rombos (R)
            "AR","2R","3R","4R","5R","6R","7R","8R","9R","JR","QR","KR","10R"
    };

    public void PreFlopTomarDatosYValido(){
        System.out.println("Introduce tu 1º carta (ej: AC o KP): ");
        preflop1 = sc.nextLine();
        preflop1 = preflop1.toUpperCase();
        while(!Arrays.asList(todasCartas).contains(preflop1)){
            System.out.println("Ha habido un fallo en la escritura de la carta 1º");
            System.out.println("Introduce tu 1º carta (ej: AC o KP): ");
            preflop1 = sc.nextLine();
            preflop1 = preflop1.toUpperCase();
        }

        System.out.println("Introduce tu 2ª carta (ej: AC o KP): ");
        preflop2 = sc.nextLine();
        preflop2 = preflop2.toUpperCase();
        while(!Arrays.asList(todasCartas).contains(preflop2)){
            System.out.println("Ha habido un fallo en la escritura de la carta 2ª");
            System.out.println("Introduce tu 2ª carta (ej: AC o KP): ");
            preflop2 = sc.nextLine();
            preflop2 = preflop2.toUpperCase();

        }

    }




}
