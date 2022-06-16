package clasesDocumentadas;

/**
 * <h2>Clase Interfaz Acción</h2>
 * Esta interfaz crea métodos para que se implementen en las clases que queramos.
 * <ul>
 *  <li>lanzar</li>
 *  <li>recuperar</li>
 * </ul>
 * @author Manuel Palomo Pró
 * @version 1.01
 */

public interface IAccion{
    /**
     * Método abstracto que implementarón otras clases
     * Sirve para lanzar un ataque.
     * @return acierto o fallo si has dado en el objetivo o no.
     */
    public abstract String lanzar();

    /**
     * Método abstracto que implementarán otras clases
     * Sirve para recuperar las vidas que tenías.
     * @return Devuelve un String.
     */
    public abstract String recuperar();
}

