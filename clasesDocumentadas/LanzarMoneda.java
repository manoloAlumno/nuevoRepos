package clasesDocumentadas;


/**
 * <h2>Clase Lanzar Moneda</h2>
 * Esta clase sirve para crear un objeto LanzarMoneda y simula la acción del juego.
 * <lu>
 *     <li>toString</li>
 *     <li>jugar</li>
 *     <li>lanzar</li>
 * </lu>
 * @author Manuel Palomo Pró
 * @version 1.01
 * @see JuegoAzar
 */


public final class LanzarMoneda extends JuegoAzar{

    /**
     * Método constructor que llama al constructor de la clase padre, JuegoAzar.
     */
    public LanzarMoneda()
    {
        super("Lanzamiento de moneda");
    }

    /**
     * Método heredado de la clase <strong>JuegoAzar</strong>
     * Explica en qué consiste el juego.
     * @return la descripción del juego.
     */
    public String toString()
    {
        return super.toString()+" consiste en acertar el resultado de lanzar una moneda";
    }

    /**
     * Método heredado de la clase <strong>JuegoAzar</strong>.
     * Utiliza el método <i>Lanzar</i>, implementado en esta misma clase, para "activar" la moneda.
     * Hay que adivinar si saldrá cara o cruz.
     * @return si has acertado o no.
     */
    public boolean jugar()
    {
        System.out.println("Indica si va a salir cara o cruz: ");
        String apuesta=Entrada.cadena().toLowerCase();
        String result=this.lanzar();
        if(apuesta.compareTo(result)==0)
        {
            System.out.println("Ha salido "+result+".... Ganaste!");
            return true;
        }
        else
        {
            System.out.println("Ha salido "+result+".... Perdiste!");
            return false;
        }

    }

    /**
     * Método heredado de la clase <strong>JuegoAzar</strong>
     * que lanzará una moneda aleatoriamente.
     * @return cara o cruz.
     */
    public String lanzar()
    {
        int numAle=(int)Math.round(Math.random());
        if(numAle==0)
            return new String("cara");
        else
            return new String("cruz");
    }
}

