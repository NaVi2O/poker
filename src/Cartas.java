import java.util.*;

public class Cartas {
    boolean validacion;
    public Cartas() {
    }
    public boolean validacionCarta1(String carta1mano) {
        if(carta1mano.length() != 2){
            return false;
        }
        String[] letras = carta1mano.split("");
        if(!letras[0].equals("A") && !letras[0].equals("2") && !letras[0].equals("3") && !letras[0].equals("4") && !letras[0].equals("5") && !letras[0].equals("6") && !letras[0].equals("7") && !letras[0].equals("8")
                && !letras[0].equals("9") && !letras[0].equals("J") && !letras[0].equals("Q") && !letras[0].equals("K")){
            return false;
        }
        else{
            return true;
        }

    }

    public boolean validacionCarta2(String carta2mano) {
        if(carta2mano.length() != 2){
            return false;
        }
        String[] letras = carta2mano.split("");
        if(!letras[1].equals("C") && !letras[1].equals("R") && !letras[1].equals("T") && !letras[1].equals("P") ){
            return false;
        }
        else{
            return true;
        }

    }






}







