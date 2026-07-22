public class Jugadores {

    int numJugadores;

    public Jugadores(int numJugadores){
        this.numJugadores = numJugadores;
    }

    public void prueba(){
        System.out.println(numJugadores);
    }

    public void arregloJugadores(int numJugAband){
        int numJugadoresArr = numJugadores - numJugAband;
        System.out.println("NUMERO DE JUGADORES ACTUALIZADO DE "+numJugadores+ " A "+numJugadoresArr);
    }
}
