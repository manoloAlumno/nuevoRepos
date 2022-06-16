package clasesDocumentadas;


/**
 * <h2>Clase Interfaz Comparable</h2>
 * Esta clase crea métodos para implementar en las clases que queramos.
 * <ul>
 *     <li>ganadorRonda</li>
 * </ul>
 * @author Manuel Palomo Pró
 * @version 1.01
 */

public interface IComparable {
    /**
     * Este método se utiliza para decir quién es el ganador de cada partida o ronda.
     * @param usuario crea un usuario para utilizarlo en las otras clases.
     * @param programa crea una opción de programa para utilizarlo en las otras clases.
     * @return Devuelve un entero
     */
    public int ganadorRonda(String usuario,String programa);
}

