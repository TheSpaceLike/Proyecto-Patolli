/**
 *  Tablero.java
 *  Creada el 20/04/2020, 02:04:16 PM
 *  Clase Java desarrollada por Misael Mendoza Gtz     misaelmendozagtz@gmail.com como ejercicio educativo del programa
 *  ISW del Instituto Tecnológico de Sonora Unidad Nainarí
 *  Para información sobre el uso de esta clase, así como bugs, actualizaciones
 *  o mejoras enviar un email a misaelmendozagtz@gmail.com
 * */
package patollimaster;

import java.util.ArrayList;
import java.util.List;
import patollimaster.Casilla.TipoCasilla;

/**
 * @author Misael Mendoza Gtz misaelmendozagtz@gmail.com
 * @version 1.0
 * @author-mail misaelmendozagtz@gmail.com
 * @date 20/04/2020
 */
public class Tablero {

    private static Tablero _instanciaTablero = null;
    //Array de las casillas comunes a todos los jugadores
    private List<Casilla> casillasBlancas;
    //Array de las casillas del color elegido por el judagor
    private List<Casilla> pasillo;
    //Numero de fichas que el jugador tiene en juego
    private int fichasEnJuego;

    //Constructor po defecto que realiza llamadas
    Tablero() {
        crearBlancas();
        fichasEnJuego = 0;
    }

    //Setters and Getters
    /**
     * Metodo que devuelve el array del pasillo principal
     *
     * @return el array de casillas blancas
     */
    public List<Casilla> getCasillasBlancas() {
        return casillasBlancas;
    }

    /**
     * Metodo que crea el pasillo de casillas blancas
     *
     * @param casillasBlancas define el numero de casillas blancas
     */
    public void setCasillasBlancas(List<Casilla> casillasBlancas) {
        this.casillasBlancas = casillasBlancas;
    }

    /**
     * Metodo que devuelve el array de las celdas de tipo padillo
     *
     * @return devuelve celdas de tipo pasillo
     */
    public List<Casilla> getPasillo() {
        return pasillo;
    }

    /**
     * Metodo que crea el array de tipo pasillo
     *
     * @param pasillo define el array de casillas de tipo pasillo
     */
    public void setPasillo(List<Casilla> pasillo) {
        this.pasillo = pasillo;
    }

    /**
     * Metodo estatico que implementa el patron Singleton haciendo posible la
     * creacion de una instancia de la clase Tablero unicamente si no hay una
     * instancia ya creada
     *
     * @return devuelve el tablero
     */
    public static Tablero crearInstancia() {
        if (_instanciaTablero == null) {
            _instanciaTablero = new Tablero();
        }
        return _instanciaTablero;
    }

    /**
     * Inicia el array de las casillas comunes y cambia su tipo y fincion del
     * numero que sea
     */
    public void crearBlancas() {
        casillasBlancas = new ArrayList<Casilla>(60);
        for (int i = 0; i < 60; i++) {
            Casilla aux;
            if (i == 2 || i == 17 || i == 32 || i == 47) {
                aux = new Casilla(TipoCasilla.SALIDA, i + 1);
            } else if (i == 3 || i == 5 || i == 6 || i == 7 || i == 9 || i == 10
                    || i == 11 || i == 13 || i == 18 || i == 20
                    || i == 21 || i == 22 || i == 24 || i == 25 || i == 26
                    || i == 28 || i == 33 || i == 35 || i == 26
                    || i == 37 || i == 39 || i == 40 || i == 41 || i == 43
                    || i == 48 || i == 50 || i == 51 || i == 52
                    || i == 54 || i == 55 || i == 55 || i == 56 || i == 58) {
                aux = new Casilla(TipoCasilla.NORMAL, i + 1);
            } else if (i == 8 || i == 23 || i == 38 || i == 53) {
                aux = new Casilla(TipoCasilla.COMIBLE, i + 1);
            } else if (i == 4 || i == 12 || i == 19 || i == 27 || i == 34 || i == 42
                    || i == 49 || i == 57) {
                aux = new Casilla(TipoCasilla.APUESTA, i + 1);
            } else if (i == 15 || i == 30 || i == 45 || i == 60) {
                aux = new Casilla(TipoCasilla.META, i + 1);
            } else if (i == 14 || i == 29 || i == 44 || i == 59) {
                aux = new Casilla(TipoCasilla.ENTRADA, i + 1);
            } else if (i == 1 || i == 17 || i == 18 || i == 30 || i == 31 || i == 45 || i == 46
                    || i == 60) {
                aux = new Casilla(TipoCasilla.DOBLE, i + 1);
            } else {
                aux = new Casilla(TipoCasilla.NORMAL, i + 1);
            }
            casillasBlancas.add(aux);
        }
    }
/**
 * A;ade una ficha nueva al jugador haciendo uso del patro Facctory usando 
 * diferentes fabricas en funcion del color de la ficha a crear
 */
    public void addFichaAlJuego(Color color){
        FabricaAbstractaFichas fabrica;
        Ficha ficha;
        
        switch(color){
            case ROJO:
                fabrica = new FabricaFichasRojo();
                ficha = fabrica.crearFicha();
                this.casillasBlancas.get(2).ponerFicha(ficha);
                break;
            case AMARILLO:
                fabrica = new FabricaFichasAmarilla();
                ficha = fabrica.crearFicha();
                this.casillasBlancas.get(19).ponerFicha(ficha);
                break;
            case VERDE:
                fabrica = new FabricaFichasVerde();
                ficha = fabrica.crearFicha();
                this.casillasBlancas.get(32).ponerFicha(ficha);
                break;
            case AZUL:
                fabrica = new FabricaFichasAzul();
                ficha = fabrica.crearFicha();
                this.casillasBlancas.get(47).ponerFicha(ficha);
                break;
            default:
                break;
        }
        this.fichasEnJuego++;
    }
    /**
     * Metodo utilizado para mover las fichas
     */
    //posicion por casilla en la que esta la ficha
    // cambiar constructor con posicion y next devuelve y luego incremento

    public void moverFicha(Ficha ficha, Casilla casillaActual, int nDado){
        Iterador iterator = new Iterador (casillaActual.getPosicionActual(), casillaActual.getTipoCasilla());
        Casilla casillaDestino = null;
    while(iterator.hayMas()&& nDado >= 0){
        casillaDestino =  iterator.siguienteCasilla();
        nDado--;
    }
    casillaDestino.ponerFicha(ficha);
    casillaActual.borrarFicha(ficha);
    }
    /*public void moverFicha(Casilla casilla, int nDado){
		Ficha ficha = casilla.getFichas().get(0);
		Iterador iterator = new Iterador(casilla.getPosicionActual(), casilla.getTipoCasilla());
		/*this.casillasBlancas.get(posicion-1+nDado).ponerFicha(ficha);
		this.casillasBlancas.get(posicion-1).borrarFicha(ficha);*/
		
	//}*/
	
	/**
	* Metodo utilizado para borrar las fichas. REVISAR
	*/	
	/*public void borrarFicha(int posicion) {
		this.casillasBlancas.get(posicion-1).borrarFicha(this.casillasBlancas.get(posicion-1).getFichas().get(0));
	}*/
	
	public void borrarFicha() {
		this.fichasEnJuego--;
	}
        
        /**
         * Metodo utilizado para obtener las fichas
         * @return las fichas que hay en juego
         */
        public int getFichasEnJuego(){
            return fichasEnJuego;
        }
        /**
         * Metoddo utilizado para modificar el numero de fichas en juego
         * @param fichasEnJuego indica el numero de fichas que hay en juego
         */
        /*public void SetFichasEnJuego(int fichasEnJuego){
            this.fichasEnJuego = fichasEnJuego;
        }*/
        
}
