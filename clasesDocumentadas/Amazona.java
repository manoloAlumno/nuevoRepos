package clasesDocumentadas;

/**
 * <h2>Clase Amazona</h2>
 * Esta clase hereda los atributos y métodos de la clase <i>Personaje</i>
 * e implementa los métodos de la interfaz <i>Cloneable</i>.
 * <ul>
 *     <li>cargar</li>
 *     <li>esquivar</li>
 *     <li>clone</li>
 * </ul>
 * @author Manuel Palomo Pró
 * @version 1.01
 * @see Personaje
 * @see Cloneable
 */

public class Amazona extends Personaje implements Cloneable{
    /**
     * <strong>Constructor con parámetros</strong>
     * para crear un objeto<strong>Amazona</strong>
     * Llama al constructor de la clase padre, <i>Personaje</i>.
     * @param nombre asigna un valor para el atributo <i>nombre</i> del objeto <i>Amazona</i>.
     * @param arma asigna un valor para el atributo <i>arma</i> del objeto <i>Amazona</i>.
     * @param vida asigna un valor para el atributo <i>vida</i> del objeto <i>Amazona</i>.
     * @param fuerza asigna un valor para el atributo <i>fuerza</i> del objeto <i>Amazona</i>.
     */
    Amazona(String nombre,String arma,double vida, double fuerza)
    {
        super(nombre,arma,vida*1.4,fuerza*0.6);
    }

    /**
     * Método <i>cargar</i>, para calcular la <i>fuerza</i>..
     * @return el atributo fuerza.
     */
    public double cargar()
    {
        return fuerza;
    }

    /**
     * Método suma una vida a la Amazona.
     */
    public void esquivar()
    {
        super.vida++;
    }

    /**
     * Método implementado de la interfaz <strong>Clonable</strong>
     * que crea un clon de un objeto <strong>Amazona</strong>.
     * @return un objeto Amazona.
     */
    public Amazona clone()
    {
        return new Amazona(super.getNombre(),super.getArma(),super.vida,super.fuerza);
    }
}

