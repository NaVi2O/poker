import java.util.*;

public class Cartas {
    String preflop1, preflop2;
    int jugadores;

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

    public void TomarJugadores(){
        while(jugadores <= 1 || jugadores > 9){
            System.out.println("Los jugadores sin contarte a ti = ");
            jugadores = sc.nextInt();
            sc.nextLine();
        }
    }

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
        while(preflop1.equals(preflop2)){
            System.out.println("Las dos cartas no pueden ser iguales");
            System.out.println("Introduce tu 2ª carta (ej: AC o KP): ");
            preflop2 = sc.nextLine();
            preflop2 = preflop2.toUpperCase();
        }

    }

    public int EvaluarPreFlop(String preflop1, String preflop2){
        String valor1, valor2;
        String palo1, palo2;
        String[] orden = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        valor1 = preflop1.substring(0, preflop1.length() - 1);
        valor2 = preflop2.substring(0, preflop2.length() - 1);

        palo1 = preflop1.substring(preflop1.length() - 1);
        palo2 = preflop2.substring(preflop2.length() - 1);

        boolean esPar = valor1.equals(valor2);
        boolean esSuited = palo1.equals(palo2);
        boolean esConector = sonConsecutivos(valor1, valor2);

        //condiciones
        if(esPar){
            return 5 + Arrays.asList(orden).indexOf(valor1);
        }
        if (esSuited && esConector) return 4;
        if (esSuited) return 3;
        if (esConector) return 2;
        return 1; // carta alta normal
    }

    public boolean sonConsecutivos(String v1, String v2){
        String[] orden = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        int pos1 = Arrays.asList(orden).indexOf(v1);
        int pos2 = Arrays.asList(orden).indexOf(v2);
        return Math.abs(pos1-pos2) == 1;
    }


    public double MonteCarloPreFlop(String preflop1, String preflop2, int jugadores){
        int simulaciones = 100000;
        int victorias = 0;

        for(int i = 0 ; i <= simulaciones; i++){
            List<String> cartasPreFlop = new ArrayList<>(Arrays.asList(todasCartas));
            cartasPreFlop.remove(preflop1);
            cartasPreFlop.remove(preflop2);

            //barajo
            Collections.shuffle(cartasPreFlop);

            //Quito cartas dependiendo de jugadores
            int cartasJugadores = jugadores*2;
            for (int j = 0; j < cartasJugadores; j++){
                cartasPreFlop.remove(0);
            }

            //Quito cartas de la mesa
            for (int j = 0; j < 5; j++){
                cartasPreFlop.remove(0);
            }

            int miScore = EvaluarPreFlop(preflop1, preflop2);

            victorias = victorias + 1;

        }

        return (double) (victorias/simulaciones) * 100;
    }
}







