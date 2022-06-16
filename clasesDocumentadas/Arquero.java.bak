package clasesDocumentadas;

/**
 * <h2>Clase Arquero</h2>
 * Esta clase hereda los atributos y métodos de la clase <i>Personaje</i>
 * e implementa los métodos de la interfaz <i>Cloneable</i>
 * creando así un <strong>objeto Arquero</strong>.
 * <ul>
 *     <li>tirarFlechas</li>
 *     <li>clone</li>
 * </ul>
 * @author Manuel Palomo Pró
 * @version 1.01
 * @see Personaje
 * @see Cloneable
 */
public class Arquero extends Personaje implements Cloneable{
    /**
     * <strong>Constructor con parámetros</strong>
     * para crear un objeto <strong>Arquero</strong>.
     * Llama al constructor de la clase padre<i>Personaje</i>.
     * @param nombre asigna un valor para el atributo <i>nombre</i> del objeto <i>Arquero</i>.
     * @param arma asigna un valor para el atributo <i>arma</i> del objeto <i>Arquero</i>.
     * @param vida asigna un valor para el atributo <i>vida</i> del objeto <i>Arquero</i>.
     * @param fuerza asigna un valor para el atributo <i>fuerza</i> del objeto <i>Arquero</i>.
     */
    Arquero(String nombre,String arma,double vida, double fuerza)
    {
        super(nombre,arma,vida*1.5,fuerza*0.15);
    }

    /**
     * Método que indica el número de flechas tiradas.
     * @param num valor para la cantidad de flechas tiradas.
     * @return el resultado de multiplicar la <i>fuerza</i> por el número de flechas tiradas.
     */
    public double tirarFlechas(int num)
    {
        return num*fuerza;
    }

    /**
     * Método implementado de la interfaz <strong>Cloneable</strong>,
     * para crear un clon de un objeto<strong>Arquero</strong>
     * llamando al constructor de la clase padre, <i>Personaje</i>.
     * @return un nuevo objeto <i>Arquero</i>.
     */
    public Arquero clone()
    {
        return new Arquero(super.getNombre(),super.getArma(),super.vida,super.fuerza);
    }
}

