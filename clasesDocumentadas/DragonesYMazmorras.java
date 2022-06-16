package clasesDocumentadas;


/**
 * <h2>Clase DragonesYMazmorras</h2>
 * Esta clase hereda los atributos y métodos de la clase <i>JuegoAzar</i>
 * y crea un objeto <strong>DragonesYMazmorras</strong>.
 * <ul>
 *  <li>toString</li>
 *  <li>cargarPersona</li>
 *  <li>lanzar</li>
 *  <li>recuperar</li>
 *  <li>recuperarVida</li>
 *  <li>jugar</li>
 * </ul>
 * @author Manuel Palomo Pró
 * @version 1.01
 * @see JuegoAzar
 */

public final class DragonesYMazmorras extends JuegoAzar{
    /**
     * Atributo <strong>estático</strong>. Es un array de <i>Personaje</i>.
     */
    private static Personaje [] personajes=new Personaje[4];

    /**
     * <strong>Constructor sin parámetros</strong>
     * Para poner el título. Inicializa el método<i>cargarPersonajes</i>, implementado en esta misma clase.
     * Solo puede ser usado por esta clase.
     */
    public DragonesYMazmorras()
    {
        super("Dragones y Mazmorras");
        this.cargarPersonajes();
    }

    /**
     * Método heredado de la clase <strong>JuegoAzar</strong>
     * que explica las reglas del juego.
     * @return la descripción del juego.
     */
    public String toString()
    {
        return super.toString()+" es un combate entre dos personajes, hasta que uno gane.";
    }

    /**
     * Este método asigna a cada posición del array un personaje definido o predeterminado por el programa.
     * Crea un nuevo personaje de tipo: <i>Hechicera</i>, <i>Arquero</i>, <i>Barbaro</i> y <i>Amazona</i>.
     */
    private void cargarPersonajes()
    {
        personajes[0]=new Hechicera("Sheila","encantamientos",6,4);
        personajes[1]=new Arquero("Hank","arco y flechas",5,5);
        personajes[2]=new Barbaro("Bobby","puños",9,3);
        personajes[3]=new Amazona("Diana","latigo",7,4);
    }

    /**
     * Método heredado de la clase <strong>JuegoAzar</strong>
     * y se utiliza para ver si el usuario ha acertado en el ataque o no.
     * Crea y devuelve un número aleatorio. Si éste es igual a 0, devuelve un booleano.
     * @return acierto o fallo si acierta o no en el objetivo.
     */
    public String lanzar()
    {
        int numAle=(int)Math.round(Math.random());
        if(numAle==0)
            return "acierto";
        else
            return "fallo";
        
        if(numAle==1)
            return "¡Aumentas tu fuerza en 1 punto!"
    }

    /**
     * Método implementado de la interfaz <strong>IAccion</strong>.
     * Se utiliza para recuperarse de los ataques.
     * Crea y devuelve un número aleatorio. Si éste es igual a 0, acierta.
     * @return acierto o fallo, si se recupera o no.
     */
    public String recuperar()
    {
        int numAle=(int)Math.round(Math.random());
        if(numAle==0)
            return "acierto";
        else
            return "fallo";
    }

    /**
     * Método en el que el Personaje <i>p2</i> pierde vida.
     * Utiliza getters y setters.
     * Si es <i>Hechicera</i> la pierde con un conjuro.
     * Si es <i>Arquero</i> hay que lanzarle dos flechas.
     * Si es <i>Amazona</i> hay que cargar.
     * Si <i>Barbaro</i>, hay que golpear.
     * @param p1 asigna un nuevo personaje al objeto <i>Personaje</i> sustituyendo el que tenía.
     * @param p2 asigna un nuevo personaje al objeto <i>Personaje</i> sustituyendo el que tenía.
     */
    private void ataque(Personaje p1,Personaje p2)
    {
        if(p1 instanceof Hechicera)
            p2.setVida(p2.getVida()-((Hechicera)p1).conjurar());
        else if(p1 instanceof Arquero)
            p2.setVida(p2.getVida()-((Arquero)p1).tirarFlechas(2));
        else if(p1 instanceof Amazona)
            p2.setVida(p2.getVida()-((Amazona)p1).cargar());
        else if(p1 instanceof Barbaro)
            p2.setVida(p2.getVida()-((Barbaro)p1).golpear());
    }

    /**
     * Este método se utiliza para recuperar vidas.
     * Si el personaje es una <i>Hechicera</i> tomará su pócima
     * Si es una <i>Amazona</i>, esquivará las flechas para recuperar las vidas.
     * @param pers es un objeto  <i>Personaje</i>
     */
    private void recuperarVida(Personaje pers)
    {
        if(pers instanceof Hechicera)
            ((Hechicera)pers).tomarPocima();
        else if(pers instanceof Amazona)
            ((Amazona)pers).esquivar();
    }

    /**
     * Método que se usa para comenzar el juego e indica si ganas o pierdes.
     * Se eligen los personajes aleatoriamente del usuario y del programa.
     * Las condiciones son que si los dos personajes están vivos,
     * los turnos se intercalan y al final de cada uno, se mostrará las vidas.
     * En un turno se puede atacar o recuperar la vida,
     * aunque si es el turno del programa, solamente atacará.
     * Tendremos dos opciones: acertar o fallar la acción.
     * Cuando te quedes sin vidas, saldrá un mensaje diciendo si ganas o pierdes.
     * @return un booleano donde true se gana  y false se pierde.
     */
    public boolean jugar()
    {
        int turno=0;
        String opcion="";
        int posUs=0,posPr=0;

        posUs=(int)Math.floor(Math.random()*(3-0+1));
        posPr=(int)Math.floor(Math.random()*(3-0+1));

        while(posPr==posUs)
            posPr=(int)Math.floor(Math.random()*(3-0+1));

        Personaje personajeUs=personajes[posUs];
        System.out.println("Tu personaje es....."+personajeUs.getNombre()+"!!!!!");
        personajeUs.mostrarDatosPersonaje();

        Personaje personajePr=personajes[posPr];
        System.out.println("\n\nMi personaje es....."+personajePr.getNombre()+"!!!!!");
        personajePr.mostrarDatosPersonaje();

        System.out.println("\n\n-------EMPIEZA LA PARTIDA!---------");
        while(personajeUs.getVida()>0 && personajePr.getVida()>0)
        {
            if(turno%2==0)
            {
                System.out.println("¡Es tu turno! ¿Lanzas ataque o recuperas? (lanzar/recuperar)");
                opcion=Entrada.cadena();

                if(opcion.compareTo("lanzar")==0)
                {
                    if(this.lanzar().compareTo("acierto")==0)
                    {
                        System.out.println("¡Acierto en el ataque!");
                        this.ataque(personajeUs,personajePr);
                    }
                    else
                        System.out.println("¡Fallaste en el ataque!");
                }
                else if(opcion.compareTo("recuperar")==0)
                {
                    if(this.recuperar().compareTo("acierto")==0 &&
                            (personajeUs instanceof Hechicera || personajeUs instanceof Amazona))
                    {
                        System.out.println("¡Acierto en la recuperación!");
                        this.recuperarVida(personajeUs);
                    }
                    else
                        System.out.println("¡Fallaste en la recuperación!");
                }

                System.out.println("Vida de "+personajeUs.getNombre()+" es de "+personajeUs.getVida()+
                        " puntos y la vida de "+personajePr.getNombre()+" es de "+personajePr.getVida()+" puntos\n\n");
            }
            else //turno al programa
            {
                if(this.lanzar().compareTo("acierto")==0)
                {
                    System.out.println("¡Acertó en el ataque!");
                    this.ataque(personajePr, personajeUs);
                }
                else
                    System.out.println("¡Falló en el ataque!");
                System.out.println("Vida de "+personajeUs.getNombre()+" es de "+personajeUs.getVida()+
                        " puntos y la vida de "+personajePr.getNombre()+" es de "+personajePr.getVida()+" puntos\n\n");
            }
            turno++;
        }
        if(personajeUs.getVida()<=0)
        {
            System.out.println("¡Perdiste el juego!");
            return false;
        }
        else
        {
            System.out.println("¡Ganaste el juego!");
            return true;
        }
    }
}

