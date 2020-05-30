/**
 *  Jugador.java
 *  Creada el 6/05/2020, 10:20:54 AM
 *  Clase Java desarrollada por Misael Mendoza Gtz     misaelmendozagtz@gmail.com como ejercicio educativo del programa
 *  ISW del Instituto Tecnológico de Sonora Unidad Nainarí
 *  Para información sobre el uso de esta clase, así como bugs, actualizaciones
 *  o mejoras enviar un email a misaelmendozagtz@gmail.com
**/

package Dominio;

import java.util.ArrayList;
import java.util.List;
import patollimaster.Casilla;
import patollimaster.PuntajeJugador;

/**
 * @author Misael Mendoza Gtz     misaelmendozagtz@gmail.com
 * @version 1.0
 * @author-mail misaelmendozagtz@gmail.com
 * @date 6/05/2020
 */
public class Juego {
    public Color color;
    public int fichasEnJuego;
    public PuntajeJugador score;
    private int initPosition;
    private List<Ficha> fichas;
    
    /**
     * Constructor de clase jugador
     * @param c1 indica el color del jugador
     */
    public Juego(Color c1, int initPosition){
        this.color =c1;
        this.initPosition = initPosition;
        this.fichas = new ArrayList<Ficha>();
    }
    
    public void Mover(){
        //String descripcion = this.tipoJugador.ObtenerDescripcion();
        //System.out.println("Tipo de jugador que se mueve " + descripcion);
    }
    
    /**
     * Metodo que devuelve el color de un jugador
     * @return el color del jugador
     */
    public Color getColor(){
        return color;
    }
    
    /**
     * Metodo que devuelve las casillas que contienen fichas del color del jugador
     * @return  las casillas con fichas de un color
     *
    public ArrayList<Casilla> getCasillasConFichas(){
      return this.iterador.recorrer(this.color);
    }*/
    
    /**
     * Metodo que obtiene las fichas en juego
     * @return las fichas que se encuentran en juego
     */
    public int getFichasEnJuego() {
        return fichasEnJuego;
    }

    /**
     * Metodo que establece el numero de fichas en juego
     * @param fichasEnJuego cantidad de gichas que existen en el juego
     */
    public void setFichasEnJuego(int fichasEnJuego) {
        this.fichasEnJuego = fichasEnJuego;
    }
    
    public int getInitPosition() {
        return initPosition;
    }

    public void setInitPosition(int initPosition) {
        this.initPosition = initPosition;
    }
    
    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }
}