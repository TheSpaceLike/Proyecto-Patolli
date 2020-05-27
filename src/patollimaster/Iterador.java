/**
 *  Iterador.java
 *  Creada el 5/05/2020, 04:35:02 PM
 *  Clase Java desarrollada por Misael Mendoza Gtz     misaelmendozagtz@gmail.com como ejercicio educativo del programa
 *  ISW del Instituto Tecnológico de Sonora Unidad Nainarí
 *  Para información sobre el uso de esta clase, así como bugs, actualizaciones
 *  o mejoras enviar un email a misaelmendozagtz@gmail.com
 * */
package patollimaster;

import java.util.ArrayList;
import patollimaster.Casilla.TipoCasilla;

/**
 * @author Misael Mendoza Gtz misaelmendozagtz@gmail.com
 * @version 1.0
 * @author-mail misaelmendozagtz@gmail.com
 * @date 5/05/2020
 */
public class Iterador {

    private ControlTablero tablero;
    private int indice;

    /**
     * Constructor por defecto para crear una instancia de tablero
     */
    public Iterador() {
        this.tablero = ControlTablero.crearInstancia();
        this.indice = 0;
    }
    // Revisar este metodo por lo de pasillo

    public Iterador(int posicion, TipoCasilla tipo) {
        this.tablero = ControlTablero.crearInstancia();
        if (tipo.equals(TipoCasilla.PASILLO)) {
            this.indice = this.tablero.getCasillasBlancas().size() + posicion - 1;
        } else {
            this.indice = posicion - 1;
        }
    }

    public ArrayList<Casilla> recorrer(Color color) {
        ArrayList<Casilla> casillas = new ArrayList<Casilla>();
        Casilla casillaActual = null;
        this.indice = 0;

        while (hayMas()) {
            casillaActual = siguienteCasilla();
            if (casillaActual.getFichas().size() != 0) {
                if (casillaActual.getFichas().get(0).getColor().equals(color)) {
                    casillas.add(casillaActual);
                }
            }
        }
        return casillas;
    }

    /**
     * Metodo devuelve la siguiente casilla del tablero
     *
     * @ return devuelve la siguiente casilla
     */
    public Casilla siguienteCasilla() {
        Casilla aux = null;
        int indicePasillo = this.indice - this.tablero.getCasillasBlancas().size() + 1;
        int sizeAll = this.tablero.getCasillasBlancas().size() + this.tablero.getPasillo().size();

        if (this.indice < this.tablero.getCasillasBlancas().size()) {
            aux = this.tablero.getCasillasBlancas().get(this.indice);
        } else if (this.indice >= this.tablero.getCasillasBlancas().size() && this.indice < sizeAll) {
            aux = this.tablero.getPasillo().get(indicePasillo);
        }
        this.indice++;
        return aux;
    }

    /**
     * Metodo que comprueba si una ficha le quedan casillas por recorrer
     *
     * @return devuelve un booleano indicando si quedan mas casillas por
     * recorrer
     */
    public boolean hayMas() {
        boolean haymas;
        int sizeAll = this.tablero.getCasillasBlancas().size();
        if (this.indice < sizeAll - 1) {
            haymas = true;
        } else {
            haymas = false;
            this.indice = -1;
        }
        return haymas;
    }
}
