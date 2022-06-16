package clasesDocumentadas;

/**
 * <h2>Clase Barbaro</h2>
 * Esta clase hereda los atributos y métodos de la clase <i>Personaje</i>
 * e implementa los métodos de la interfaz <i>Cloneable</i>
 * <ul>
 *     <li>golpear</li>
 *     <li>clone</li>
 * </ul>
 * @author Manuel Palomo Pró
 * @version 1.01
 * @see Personaje
 * @see Cloneable
 */
public class Barbaro extends Personaje implements Cloneable{

    /**
     * <strong>Constructor con parámetros</strong>
     * para crear un objeto <strong>Barbaro</strong>.
     * Llama al constructor de la clase padre, <i>Personaje</i>.
     * @param nombre asigna un <i>nombre</i> al objeto <i>Barbaro</i>.
     * @param arma asigna un <i>arma</i> al objeto <i>Barbaro</i>.
     * @param vida asigna un <i>vida</i> al objeto <i>Barbaro</i>.
     * @param fuerza asigna un <i>fuerza</i> al objeto <i>Barbaro</i>.
     */
    Barbaro(String nombre,String arma,double vida, double fuerza)
    {
        super(nombre,arma,vida*0.6,fuerza*1.7);
    }

    /**
     * Método <i>golpear</i> para calcular la fuerza necesaria.
     * @return el atributo <i>fuerza</i>.
     */
    public double golpear()
    {
        return fuerza;
    }

    /**
     * Método heredado de la interfaz <strong>Clonable</strong>
     * que crea un clon de un objeto <strong>Barbaro</strong>, llamando al constructor de la clase padre, <i>Personaje</i>.
     * @return un objeto <i>Barbaro</i>.
     */
    public Barbaro clone()
    {
        return new Barbaro(super.getNombre(),super.getArma(),super.vida,super.fuerza);
    }
}
