package clasesDocumentadas;


/**
 * <h2>Clase Juego Azar</h2>
 * Esta clase abstracta implementa los métodos de la interfaz <i>IAccion</i>.
 * <ul>
 *     <li>toString</li>
 *     <li>recuperar</li>
 *     <li>jugar</li>
 * </ul>
 * @author Manuel Palomo Pró
 * @version 1.01
 * @see IAccion
 */

public abstract class JuegoAzar implements IAccion{
    /**
     * Atributo de visibilidad protegida que indica el nombre del juego
     * y que solo podrán ver sus clases hijas.
     */
    protected String nombreJuego;

    /**
     * <strong>Constructor con parámetros</strong> para la clase <strong>JuegoAzar</strong>.
     * @param nomJue da un valor para el atributo <i>nombreJuego</i> del objeto JuegoAzar.
     */
    public JuegoAzar(String nomJue)
    {
        this.nombreJuego=nomJue;
    }

    /**
     * Método heredado de la clase <strong>Object</strong>,
     * Devuelve una cadena, en este caso con el nombre del juego.
     * @return un String con el nombre del juego.
     */
    public String toString()
    {
        return new String("Nombre del juego:   "+this.nombreJuego);
    }

    /**
     * Método implementado de la interfaz <strong>IAccion</strong>
     * @return un String que te dice que no tiene acción.
     */
    public String recuperar()
    {
        return "Sin acción";
    }

    /**
     * Método que al heredarlo de la clase <strong>JuegoAzar</strong>,
     * devuelve true si el usuario ha ganado y false si ha perdido.
     * @return verdadero o falso dependiendo de si el jugador gana o pierde.
     */
    protected abstract boolean jugar();

    /**
     * Getter del atributo <i>nombre</i> del juego.
     * @return el <i>nombre</i> del juego.
     */
    public String getNombreJuego()
    {
        return this.nombreJuego;
    }
}

