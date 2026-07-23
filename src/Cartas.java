public class Cartas {

    private static final String[] RANGOS_VALIDOS = {
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"
    };
    private static final String[] PALOS_VALIDOS = {"C", "R", "T", "P"};

    public Cartas() {
    }

    // Valida una carta completa (rango + palo)
    private boolean validacionCartaGenerica(String carta) {
        if (carta == null || carta.length() != 2) {
            return false;
        }
        String rango = carta.substring(0, 1);
        String palo = carta.substring(1, 2);

        boolean rangoValido = false;
        for (String r : RANGOS_VALIDOS) {
            if (r.equals(rango)) {
                rangoValido = true;
                break;
            }
        }

        boolean paloValido = false;
        for (String p : PALOS_VALIDOS) {
            if (p.equals(palo)) {
                paloValido = true;
                break;
            }
        }

        return rangoValido && paloValido;
    }

    public boolean validacionCarta1(String carta1mano) {
        return validacionCartaGenerica(carta1mano);
    }

    public boolean validacionCarta2(String carta2mano) {
        return validacionCartaGenerica(carta2mano);
    }

    public boolean validacionCarta1Mesa(String carta1mesa) {
        return validacionCartaGenerica(carta1mesa);
    }

    public boolean validacionCarta2Mesa(String carta2mesa) {
        return validacionCartaGenerica(carta2mesa);
    }

    public boolean validacionCarta3Mesa(String carta3mesa) {
        return validacionCartaGenerica(carta3mesa);
    }
}