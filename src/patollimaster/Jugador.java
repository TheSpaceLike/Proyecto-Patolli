/**
 *  Jugador.java
 *  Creada el 6/05/2020, 10:20:54 AM
 *  Clase Java desarrollada por Misael Mendoza Gtz     misaelmendozagtz@gmail.com como ejercicio educativo del programa
 *  ISW del Instituto Tecnológico de Sonora Unidad Nainarí
 *  Para información sobre el uso de esta clase, así como bugs, actualizaciones
 *  o mejoras enviar un email a misaelmendozagtz@gmail.com
**/

package patollimaster;

import java.util.ArrayList;

/**
 * @author Misael Mendoza Gtz     misaelmendozagtz@gmail.com
 * @version 1.0
 * @author-mail misaelmendozagtz@gmail.com
 * @date 6/05/2020
 */
public class Jugador {
    public Color color;
    public Iterador iterador;
    public int fichasEnJuego;
    public ITipoJugador tipoJugador;
    public tipo tipoJ;
    
    /**
     * Constructor de clase jugador
     * @param c1 indica el color del jugador
     */
    public Jugador (Color c1){
        this.color =c1;
        this.iterador = new Iterador();
    }
    
    public void JugadorNormal(){
        tipoJ = tipo.Normal;
        ITipoJugador jugadorNormal = new JugadorNormal();
        setTipoJugador(jugadorNormal);
    }
    
    public void JugadorIA(){
        tipoJ = tipo.IA;
        ITipoJugador jugadorIA = new JugadorIA();
        setTipoJugador(jugadorIA);
    }
    
    public void Mover(){
        String descripcion = this.tipoJugador.ObtenerDescripcion();
        System.out.println("Tipo de jugador que se mueve " + descripcion);
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
     */
    public ArrayList<Casilla> getCasillasConFichas(){
      return this.iterador.recorrer(this.color);
    }
    
    /**
     * Metodo que imprime por consola la posicion de lass fichas de un jugador
     */
    public void imprimirLocalizacionFichasJugador(){
        ArrayList<Casilla> listaFichasJugador = getCasillasConFichas();
        this.fichasEnJuego = listaFichasJugador.size();
        Vista.mostrarFichasEnJuego(listaFichasJugador, fichasEnJuego);
    }
    
    /**
     * Metodo que pregunta al jugador que ficha quiere mover y devuelve la eleccion
     * @return devuelve la ficha elegida por el jugador
     */
    public int eleccion(){
        return this.tipoJugador.eleccion(this.color, this.fichasEnJuego);
    }
    
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

    public ITipoJugador getTipoJugador() {
        return tipoJugador;
    }

    public void setTipoJugador(ITipoJugador tipoJugador) {
        this.tipoJugador = tipoJugador;
    }
    
    enum tipo{
        Normal,
        IA
    }
}