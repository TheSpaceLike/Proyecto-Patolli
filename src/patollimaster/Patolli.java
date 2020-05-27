/**
 *  Patolli.java
 *  Creada el 7/05/2020, 04:32:20 PM
 *  Clase Java desarrollada por Misael Mendoza Gtz     misaelmendozagtz@gmail.com como ejercicio educativo del programa
 *  ISW del Instituto Tecnológico de Sonora Unidad Nainarí
 *  Para información sobre el uso de esta clase, así como bugs, actualizaciones
 *  o mejoras enviar un email a misaelmendozagtz@gmail.com
 * */
package patollimaster;

import java.awt.Event;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javafx.scene.control.TableRow;
import global.Global;

/**
 * @author Misael Mendoza Gtz misaelmendozagtz@gmail.com
 * @version 1.0
 * @author-mail misaelmendozagtz@gmail.com
 * @date 7/05/2020 --------------- MVC----------------
 */
public class Patolli {

    private ControlTablero tablero;
    private int nJugadores;
    private Jugador jugadorActual;
    private ArrayList<Jugador> jugadores;
    private Dado dado;
    private Iterador iterador;
    private int resultadoDado;
    private int cantidadDe1;
    //private Vista vista;

    /**
     * Constructor por defecto de la clase patolli
     */
    public Patolli() {
        tablero = new ControlTablero();
        dado = Dado.crearDado();
        this.iterador = new Iterador();
        this.jugadores = new ArrayList();
        this.nJugadores = Global.jugadores.size();
        //this.vista = new consoleView();
    }

    /**
     * Metodo para aniadir jugadores a la partida El metodo pide por consola el
     * color de cada jugador
     */
    public void addJugadores() {
        //vista.welcome();
        //Scanner scan = new Scanner(System.in);
        //nJugadores = vista.askNumeroJugadores();
        ArrayList<Color> colores = new ArrayList<Color>(Arrays.asList(Color.values()));
        for (int i = 0; i < nJugadores; i++) {
            Jugador jugadorAux = null;
            int j = i + 1;

            //int opcion = vista.askColor(j, colores);
            int n = 1;
            for (Color color : colores) {
                //if (n == opcion) {
                if (n == i) {
                    jugadorAux = new Jugador(color);
                    colores.remove(color);
                    break;
                }
                n++;
            }
            jugadorAux.JugadorNormal();
            /*
            opcion = vista.askTipoJugador();
            if (opcion == 1) {
                jugadorAux.JugadorNormal();
            } else if (opcion == 2) {
                jugadorAux.JugadorIA();
            }*/
            jugadores.add(jugadorAux);
        }
        //IA
        for (int i = this.nJugadores+1; i <= 4; i++) {
           Jugador jugadorAux = null;
            //int opcion = vista.askColor(j, colores);
            int n = 1;
            for (Color color : colores) {
                //if (n == opcion) {
                if (n == i) {
                    jugadorAux = new Jugador(color);
                    colores.remove(color);
                    break;
                }
                n++;
            }
            jugadorAux.JugadorIA();
            jugadores.add(jugadorAux);
        }
    }
        
    /**
     * Bucle principal del juego en el cual se suceden las tiradas del dado y se piden 
     * por consola las decisiones que el jugador puede tomar.
     */
    public void play() {
        ArrayList<Casilla> listaCasillasConFichas;

        while (!end()) {
            for (Jugador jugador : jugadores) {
                jugadorActual = jugador;
                //vista.turnoJugador(jugadorActual);
                if (jugador.tipoJ.toString() == "Normal") {
                    //Scanner sc = new Scanner(System.in);
                    //vista.pressAnyKeyToContinue();
                    resultadoDado = dado.tirarDado();

                    if (resultadoDado == 1 && this.tablero.getFichasEnJuego() <= 1) {
                        this.tablero.addFichaAlJuego(jugadorActual.getColor());
                    } else {
                        listaCasillasConFichas = this.iterador.recorrer(jugadorActual.getColor());
                        if (listaCasillasConFichas.size() > 0) {
                            jugadorActual.imprimirLocalizacionFichasJugador();

                            int eleccion = this.jugadorActual.eleccion();
                            this.tablero.moverFicha(listaCasillasConFichas.get(eleccion - 1).getFichas().get(0), listaCasillasConFichas.get(eleccion - 1), resultadoDado);

                        }

                        //this.tablero.moverFicha(listaFichasJugador.get(jugador.eleccion()-1).getPosicionActual(), jugador.getColor(), resultadoDado);
                    }
                }
            }
        }
    }

    /**
     * Funcion que comprueba si el jugador ha ganado
     *
     */
    public boolean end() {
        if (this.tablero.getPasillo().get(7).getFichas().size() == 4) {
            System.out.println();
            return true;
        } else {
            return false;
        }
    }
}
