/**
 *  Casilla.java
 *  Creada el 20/04/2020, 02:11:17 PM
 *  Clase Java desarrollada por Misael Mendoza Gtz     misaelmendozagtz@gmail.com como ejercicio educativo del programa
 *  ISW del Instituto Tecnológico de Sonora Unidad Nainarí
 *  Para información sobre el uso de esta clase, así como bugs, actualizaciones
 *  o mejoras enviar un email a misaelmendozagtz@gmail.com
 * */
package patollimaster;

import Dominio.Ficha;
import Dominio.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import java.util.ArrayList;

/**
 * @author Misael Mendoza Gtz misaelmendozagtz@gmail.com
 * @version 1.0
 * @author-mail misaelmendozagtz@gmail.com
 * @date 20/04/2020
 */
public class Casilla {
    //Variables
    private List<Ficha> fichas;
    private TipoCasilla tipoCasilla;
    private int posicionActual;
    private JPanel panel;

    /**
     * Construtcor de la clase casilla
     *
     * @param tipo1 El parametro tipo1 define el tipo de casilla al que
     * pertenece (SALIDA, SEGURO, COMIBLE, PASILLO, META, NORMAL)
     * @param posicion El parametro posicion indica la posicion de la casilla en
     * el tablero
     */
    public Casilla(TipoCasilla tipo1, int posicion) {
        this.tipoCasilla = tipo1;
        this.posicionActual = posicion;
        /*
        if (tipo1.equals(TipoCasilla.META)) {
            this.fichas = new ArrayList<Ficha>(4);
        } else {
            this.fichas = new ArrayList<Ficha>(2);
        }
        */
        this.fichas = new ArrayList<Ficha>();
    }// Cierre del constructor

    /**
     * Metodo para borrar una ficha
     *
     * @param ficha El parametro ficha de tipo Ficha iindica la ficha que hay
     * que eliminar
     */
    public void borrarFicha(Ficha ficha) {
        this.fichas.remove(ficha);
    }

    /**
     * Metodo para poner una ficha en el tablero
     *
     * @param ficha El parametro ficha de tipo Ficha indica la ficha que hay que
     * añadir
     */
    public boolean ponerFicha(Ficha ficha) {
        if (this.fichas.size() > 0) {
            if (this.fichas.get(0).getColor() != ficha.getColor()) {
                if (this.tipoCasilla == TipoCasilla.COMIBLE) {
                    if (this.fichas.size() > 0) {
                        this.fichas = new ArrayList<Ficha>();
                        this.fichas.add(ficha);
                    }
                } else {
                    return false;
                }
            } else {
                this.fichas.add(ficha);
            }
        } else {
            this.fichas.add(ficha);
        }
        
        this.panel.setBackground(this.getColorFicha(ficha.getColor()));
        return true;
    }
    
    private java.awt.Color getColorFicha(Color color) {
        switch(color) {
            case ROJO:  return java.awt.Color.RED;
            case AZUL:  return java.awt.Color.BLUE;
            case AMARILLO:  return java.awt.Color.YELLOW;
            case VERDE:  return java.awt.Color.GREEN;
            default:    return java.awt.Color.BLACK;
        }
    }
    /**
     * Metodo para devolver el array de fichas que tiene esa casilla
     * @return devuelve las fichas que se encuetran en esa casilla
     */
    public List<Ficha> getFichas() {
        return fichas;
    }
    /**
     * Metodo para instroducir un array de fichas en la casilla
     * @param fichas List<Ficha> fichas Array de fichas
     */
    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }
    /**
     * Metodo para obtener el tipo de casilla (Entrada, salida, pasillo...)
     * @return List<Ficha> fichas Array de fichas
     */
    public TipoCasilla getTipoCasilla() {
        return tipoCasilla;
    }
    /**
     * Metodo para definir el tipo de casilla (Entrada, salida...)
     * @param tipoCasilla El parametro tipoCasilla especifica de que tipo es la casilla que se va a definir
     */
    public void setTipoCasilla(TipoCasilla tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }
    /**
     * Metodo para obtener la posicion de una ficha
     * @return devuelve la posicion actual de la ficha
     */
    public int getPosicionActual() {
        return posicionActual;
    }
    /**
     * Metodo para introdducir la posicion de una ficha
     * @param posicionActual Indica cual es la posicion de la ficha en este momento
     */
    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    enum TipoCasilla{
        SALIDA, 
        APUESTA,
        ENTRADA,
        PASILLO,
        META,
        NORMAL,
        COMIBLE,
        DOBLE,
    }
}