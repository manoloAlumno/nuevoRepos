package clasesDocumentadas;

/**
 * <h2>Clase Personaje</h2>
 * Clase abstracta con atributos y métodos del objeto <strong>Personaje</strong>.
 * <ul>
 *     <li>mostrarDatosPersonaje</li>
 * </ul>
 * @author Manuel Palomo Pró
 * @version 1.01
 * @see Personaje
 */

public abstract class Personaje {
    /**
     * nombre, arma, vida restante y fuerza del Personaje
     */
    private String nombre;
    private String arma;
    protected double vida;
    protected double fuerza;

    /**
     * <strong>Constructor con parámetros</strong> para crear un objeto <strong>Personaje</strong>.
     * @param nombre asigna un valor para el atributo <i>nombre</i> del objeto <i>Personaje</i>
     * @param arma asigna un valor para el atributo <i>arma</i> del objeto <i>Personaje</i>
     * @param vida asigna un valor para el atributo <i>vida</i> del objeto <i>Personaje</i>
     * @param fuerza asigna un valor para el atributo <i>fuerza</i> del objeto <i>Personaje</i>
     */
    public Personaje(String nombre, String arma, double vida, double fuerza)
    {
        this.nombre=nombre;
        this.arma=arma;
        this.vida=vida;
        this.fuerza=fuerza;
    }

    /**
     *Constructor copia con parámetros para crear un objeto <strong>Personaje</strong> idéntico al primero.
     * @param p parámetro de tipo <i>Personaje</i> que accede a los atributos de la clase <i>Personaje</i>.
     */
    public Personaje(Personaje p)
    {
        this.nombre=p.nombre;
        this.arma=p.arma;
        this.vida=p.vida;
        this.fuerza=p.fuerza;
    }

    /**
     * Getter del atributo <i>nombre</i>.
     * @return el <i>nombre</i> del <i>Personaje</i>.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para modificar el atributo <i>nombre</i>.
     * @param nombre nuevo valor del atributo <i>nombre</i>.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo <i>arma</i>.
     * @return el <i>arma</i> del <i>Personaje</i>.
     */
    public String getArma() {
        return arma;
    }

    /**
     * Setter para modificar el atributo <i>arma</i>.
     * @param arma nuevo valor del atributo <i>arma</i>.
     */
    public void setArma(String arma) {
        this.arma = arma;
    }

    /**
     * Getter del atributo <i>vida</i>.
     * @return la cantidad de <i>vida</i> que le queda al <i>Personaje</i>.
     */

    public double getVida() {
        return Math.rint(vida*100)/100;
    }

    /**
     * Setter para modificar el atributo <i>vida</i>.
     * @param vida nuevo valor del atributo <i>vida</i>.
     */
    public void setVida(double vida) {
        this.vida = vida;
    }

    /**
     * Getter del atributo <i>fuerza</i>.
     * @return la <i>fuerza</i> del <i>Personaje</i>.
     */
    public double getFuerza() {
        return Math.rint(fuerza*100)/100;
    }

    /**
     * Setter para modificar el atributo <i>fuerza</i>.
     * @param fuerza nuevo valor del atributo <i>fuerza</i>.
     */
    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * Este método muestra por pantalla el arma, la vida y la fuerza del objeto<strong>Personaje</strong> con <i>dos decimales</i>.
     */
    public void mostrarDatosPersonaje()
    {
        System.out.println("ARMA: "+this.arma);
        System.out.println("VIDA: "+Math.rint(this.vida*100)/100);
        System.out.printf("FUERZA: "+Math.rint(this.fuerza*100)/100);
    }
}
