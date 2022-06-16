package clasesDocumentadas;

/**
 * <h2>Clase Piedra, Papel, Tijera, Lagarto, Spock</h2>
 * Clase abstracta que sirve para declarar atributos y métodos de un objeto <strong>Personaje</strong>.
 * <ul>
 *     <li>toString</li>
 *     <li>lanzar</li>
 *     <li>jugar</li>
 *     <li>ganadorRonda</li>
 * </ul>
 * @author Manuel Palomo Pró
 * @version 1.01
 * @see JuegoAzar
 * @see IComparable
 */

public class PiedraPapelTijeraLagartoSpock extends JuegoAzar implements IComparable {
    /**
     * Tiene un atributo de clase de tipo array con las opciones disponibles.
     */
    private final static String[] posibles = { "PIEDRA", "PAPEL", "TIJERAS", "LAGARTO", "SPOCK" };

    /**
     * <strong>Constructor sin parámetros</strong> que te dice la descripción o frase del juego.
     */
    public PiedraPapelTijeraLagartoSpock()
    {
        super("Piedra Papel Tijera Lagarto Spock");
    }

    /**
     * Método implementado de la clase <strong>Object</strong>
     * Aporta la descripción del juego.
     * @return la descripción del juego.
     */
    public String toString() {
        return super.toString() + " consiste en ganar 3 rondas a PIEDRA PAPEL TIJERA LAGARTO y SPOCK";
    }

    /**
     * Método que saca aleatoriamente una opción del array.
     * @return una opción del array.
     */
    public String lanzar()
    {
        return posibles[(int) (Math.random() *posibles.length)];
    }

    /**
     * Método que pide al usuario que saque una opción del array.
     * Si sacan lo mismo, empatan.
     * Se comparan los resultados. Quien gane la ronda,
     * gana un punto.
     * Este proceso se repite hasta que alguno de los dos llegue a los 3 puntos.
     * Al final del método sacan al ganador.
     * @return el ganador o si han empatado.
     */
    public boolean jugar() {
        int puntosUs = 0, puntosPr = 0;
        String tiradaUs, tiradaPr;

        while (puntosUs < 3 && puntosPr < 3) {
            System.out.println("Elige: PIEDRA PAPEL TIJERAS LAGARTO SPOCK.... ¡UNA, DOS Y TRES!");
            tiradaUs = Entrada.cadena().toUpperCase();
            tiradaPr = this.lanzar();
            System.out.println("Tu has sacado " + tiradaUs + " y yo he sacado " + tiradaPr);

            if(this.ganadorRonda(tiradaUs,tiradaPr)==-1) {
                System.out.println("¡GANASTE!");
                puntosUs++;
            }
            else if(this.ganadorRonda(tiradaUs, tiradaPr)==0) {
                System.out.println("¡EMPATAMOS!");
            }
            else if(this.ganadorRonda(tiradaUs,tiradaPr)==1) {
                System.out.println("¡GANÓ!");
                puntosPr++;
            }
            else
                System.out.println("Jugada incorrecta");

            System.out.println("Llevas " + puntosUs + " rondas ganadas y yo " + puntosPr + " rondas ganadas...\n\n");

        }

        if (puntosUs == 3) {
            System.out.println("¡¡HAS GANADO 3 RONDAS!! ¡Ganaste!");
            return true;
        } else {
            System.out.println("¡¡HE GANADO 3 RONDAS!! ¡Perdiste!");
            return false;
        }
    }

    /**
     * Método que compara lo que han sacado el jugador y el programa.
     * Comparan el resultado con los anteriores.
     * Hace con cada proceso: un -1 si ha ganado el usuario, un 0 si se empata, un 1 si ha ganado el programa y un -2 si la ronda está mal hecha.
     * @param usuario indica el valor que haya metido el jugador.
     * @param programa indica el valor que haya metido el programa.
     * @return  si ha ganado el usuario o el programa, han perdido o empatado.
     */
    public int ganadorRonda(String usuario, String programa)
    {
        if (usuario.compareTo("TIJERAS") == 0)
            if (programa.compareTo("TIJERAS") == 0)
                return 0;
            else if (programa.compareTo("PAPEL") == 0)
                return -1;
            else if (programa.compareTo("PIEDRA") == 0)
                return 1;
            else if (programa.compareTo("LAGARTO") == 0)
                return -1;
            else if (programa.compareTo("SPOCK") == 0)
                return 1;

        if (usuario.compareTo("PIEDRA") == 0)
            if (programa.compareTo("PIEDRA") == 0)
                return 0;
            else if (programa.compareTo("PAPEL") == 0)
                return 1;
            else if (programa.compareTo("TIJERAS") == 0)
                return -1;
            else if (programa.compareTo("LAGARTO") == 0)
                return -1;
            else if (programa.compareTo("SPOCK") == 0)
                return 1;


        if (usuario.compareTo("PAPEL") == 0)
            if (programa.compareTo("PAPEL") == 0)
                return 0;
            else if (programa.compareTo("TIJERAS") == 0)
                return 1;
            else if (programa.compareTo("PIEDRA") == 0)
                return -1;
            else if (programa.compareTo("LAGARTO") == 0)
                return 1;
            else if (programa.compareTo("SPOCK") == 0)
                return -1;


        if (usuario.compareTo("LAGARTO") == 0)
            if (programa.compareTo("LAGARTO") == 0)
                return 0;
            else if (programa.compareTo("PAPEL") == 0)
                return -1;
            else if (programa.compareTo("PIEDRA") == 0)
                return 1;
            else if (programa.compareTo("TIJERAS") == 0)
                return 1;
            else if (programa.compareTo("SPOCK") == 0)
                return -1;


        if (usuario.compareTo("SPOCK") == 0) {
            if (programa.compareTo("SPOCK") == 0)
                return 0;
            else if (programa.compareTo("PAPEL") == 0)
                return 1;
            else if (programa.compareTo("PIEDRA") == 0)
                return -1;
            else if (programa.compareTo("LAGARTO") == 0)
                return 1;
            else if (programa.compareTo("TIJERAS") == 0)
                return -1;
        }

        return -2;
    }
}

