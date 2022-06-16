package clasesDocumentadas;

/**
 * <h2>Clase Hechicera</h2>
 * Esta clase hereda los atributos y métodos de la clase <i>Personaje</i>
 * e implementa los métodos de la interfaz <i>Cloneable</i>
 * y crea un objeto <strong>Hechicera.</strong>
 * <ul>
 *     <li>conjurar</li>
 *     <li>tomarPocima</li>
 *     <li>clone</li>
 * </ul>
 * @author Manuel Palomo Pró
 * @version 1.01
 * @see Personaje
 * @see Cloneable
 */

public class Hechicera extends Personaje implements Cloneable{
    /**
     * <strong>Constructor con parámetros</strong>
     * para crear un objeto <strong>Barbaro</strong>.
     * Llama al constructor de la clase padre, <i>Personaje</i>.
     * @param nombre asigna un <i>nombre</i>. al objeto <i>Hechicera</i>.
     * @param arma asigna un <i>arma</i> al objeto <i>Hechicera</i>.
     * @param vida asigna un <i>vida</i> al objeto <i>Hechicera</i>.
     * @param fuerza asigna un <i>fuerza</i> al objeto <i>Hechicera</i>.
     */
    Hechicera(String nombre,String arma,double vida, double fuerza)
    {
        super(nombre,arma,vida*1.2,fuerza*0.8);
    }

    /**
     * Método <i>conjurar</i> para determinar la fuerza.
     * @return el atributo fuerza.
     */
    public double conjurar()
    {
        return fuerza;
    }

    /**
     * Método <i>tomarPocima</i>, que le suma 2 puntos a la vida que tenga la <i>Hechicera</i>.
     */
    public void tomarPocima()
    {
        super.vida+=2;
    }

    /**
     * Método heredado de la interfaz <strong>Clonable</strong>
     * que crea un clon de un objeto <strong>Hechicera</strong>.
     * @return un nuevo objeto <i>Hechicera</i>.
     */
    public Hechicera clone()
    {
        return new Hechicera(super.getNombre(),super.getArma(),super.vida,super.fuerza);
    }
}

