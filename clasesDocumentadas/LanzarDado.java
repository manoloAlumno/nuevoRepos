package clasesDocumentadas;

/**
 * <h2>Clase LanzarDado</h2>
 * Esta clase sirve para generar un objeto que hereda de <strong>JuegoAzar</strong>.
 * <ul>
 *     <li>toString</li>
 *     <li>jugar</li>
 *     <li>lanzar</li>
 * </ul>
 * @author Manuel Palomo Pró
 * @version 1.01
 * @see JuegoAzar
 */

public class LanzarDado extends JuegoAzar{
    /**
     * Caras del Dado que inicializa en el método <i>jugar</i>.
     */
    private int carasDado;

    //CONSTRUCTOR
    /**
     * Constructor heredado de la clase <strong>JuegoAzar</strong>.
     */
    public LanzarDado()
    {
        super("Lanzar Dado");
    }

    //OTROS COMPORTAMIENTOS

    /**
     * Método que explica en qué consite el juego.
     * @return la descripción del juego.
     */
    public String toString()
    {
        return super.toString()+" consiste en hacer una tirada de dado y si el n�mero es mayor o igual que la tirada del programa...has ganado!";
    }

    /**
     * Método implementado de la interfaz <strong>IAccion</strong>,
     * pregunta las caras del dado y luego tira los dados, ganando el de tirada mayor.
     * Llama al método <i>lanzar</i> para realizar la tirada
     * Pregunta el número de caras del dado y da un número a cada una.
     * @return un booleano, si es true ganas y si es false, pierdes.
     */
    public boolean jugar()
    {
        System.out.println("¿Cuántas caras tiene el dado?");
        this.carasDado=Entrada.entero();
        System.out.println("\nPulsa una tecla para lanzar el dado...");
        Entrada.caracter();
        int miTirada=Integer.parseInt(this.lanzar());
        System.out.println("Has sacado un "+miTirada+"\n");

        int suTirada=Integer.parseInt(this.lanzar());
        System.out.println("He sacado un "+suTirada+"\n");

        if(miTirada>=suTirada)
        {
            System.out.println("¡Ganaste!");
            return true;
        }
        else
        {
            System.out.println("¡Perdiste!");
            return false;
        }
    }

    /**
     * Método heredado de la clase <strong>JuegoAzar</strong>
     * que simula una tirada de dados de forma aleatoria.
     * @return el número de una cara del dado.
     */
    public String lanzar()
    {
        int cara=(int)Math.floor(Math.random()*(this.carasDado-1+1)+1);
        return Integer.toString(cara);
    }
}

