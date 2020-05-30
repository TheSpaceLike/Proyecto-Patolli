
package patollimaster;

import Dominio.Ficha;
import Dominio.Color;
import Dominio.Juego;
import Dominio.Jugador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JPanel;
import patollimaster.Casilla.TipoCasilla;

/**
 * @author Misael Mendoza Gtz misaelmendozagtz@gmail.com
 * @version 1.0
 * @author-mail misaelmendozagtz@gmail.com
 * @date 20/04/2020
 */
public class ControlTablero {

    private static ControlTablero _instanciaTablero = null;
    //Array de las casillas comunes a todos los jugadores
    private List<Casilla> casillasBlancas;
    //Jugadores
    public ArrayList<Jugador> jugadores;
    //Init positions
    private int[] initPositions = {2, 17, 32, 47};
    //Turno
    private int turno = 0;

    //Constructor po defecto que realiza llamadas
    ControlTablero() {
        crearBlancas();
        //Set jugadores
        this.jugadores = global.Global.jugadores;
        //Set games
        this.addGames();
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
     * Metodo estatico que implementa el patron Singleton haciendo posible la
     * creacion de una instancia de la clase Tablero unicamente si no hay una
     * instancia ya creada
     *
     * @return devuelve el tablero
     */
    public static ControlTablero crearInstancia() {
        if (_instanciaTablero == null) {
            _instanciaTablero = new ControlTablero();
        }
        return _instanciaTablero;
    }

    /**
     * Metodo para aniadir jugadores a la partida El metodo pide por consola el
     * color de cada jugador
     */
    public void addGames() {
        ArrayList<Color> colores = new ArrayList<Color>(Arrays.asList(Color.values()));
        for (int i = 0; i < this.jugadores.size(); i++) {

            //int opcion = vista.askColor(j, colores);
            int n = 0;
            for (Color color : colores) {
                //if (n == opcion) {
                if (n == i) {
                    this.jugadores.get(i).setJuego(new Juego(color, this.initPositions[i]));
                    this.jugadores.get(i).getJuego().getFichas().add(new Ficha(this.jugadores.get(i).getId(), color));
                    colores.remove(color);
                    break;
                }
                n++;
            }
        }
       
    }
    
    /**
     * Inicia el array de las casillas comunes y cambia su tipo y fincion del
     * numero que sea
     */
    public void crearBlancas() {
        casillasBlancas = new ArrayList<Casilla>(60);
        for (int i = 1; i <= 60; i++) {
            Casilla aux;
            if (i == 2 || i == 17 || i == 32 || i == 47) {
                aux = new Casilla(TipoCasilla.SALIDA, i);
            } 
            /*
            else if (i == 3 || i == 5 || i == 6 || i == 7 || i == 9 || i == 10
                    || i == 11 || i == 13 || i == 18 || i == 20
                    || i == 21 || i == 22 || i == 24 || i == 25 || i == 26
                    || i == 28 || i == 33 || i == 35 || i == 26
                    || i == 37 || i == 39 || i == 40 || i == 41 || i == 43
                    || i == 48 || i == 50 || i == 51 || i == 52
                    || i == 54 || i == 55 || i == 55 || i == 56 || i == 58) {
                aux = new Casilla(TipoCasilla.NORMAL, i + 1);
            }
            */else if (i == 8 || i == 23 || i == 38 || i == 53) {
                aux = new Casilla(TipoCasilla.COMIBLE, i);
            } else if (i == 4 || i == 12 || i == 19 || i == 27 || i == 34 || i == 42
                    || i == 49 || i == 57) {
                aux = new Casilla(TipoCasilla.APUESTA, i);
            } else if (i == 15 || i == 30 || i == 45 || i == 60) {
                aux = new Casilla(TipoCasilla.META, i);
            } else if (i == 14 || i == 29 || i == 44 || i == 59) {
                aux = new Casilla(TipoCasilla.ENTRADA, i);
            } else if (i == 1 || i == 15 || i == 16 || i == 30 || i == 31 || i == 45 || i == 46
                    || i == 60) {
                aux = new Casilla(TipoCasilla.DOBLE, i);
            } else {
                aux = new Casilla(TipoCasilla.NORMAL, i);
            }
            casillasBlancas.add(aux);
        }
    }
    
    /**
     * A;ade una ficha nueva al jugador haciendo uso del patro Facctory usando 
     * diferentes fabricas en funcion del color de la ficha a crear
     */
    public void addFichaAlJuego(Jugador jugador, Color color){
        FabricaAbstractaFichas fabrica;
        Ficha ficha;
        
        switch(color){
            case ROJO:
                fabrica = new FabricaFichasRojo();
                ficha = fabrica.crearFicha(jugador.getId());
                jugador.getJuego().getFichas().add(ficha);
                this.casillasBlancas.get(jugador.getJuego().getInitPosition()-1).ponerFicha(ficha);
                break;
            case AMARILLO:
                fabrica = new FabricaFichasAmarilla();
                ficha = fabrica.crearFicha(jugador.getId());
                jugador.getJuego().getFichas().add(ficha);
                this.casillasBlancas.get(jugador.getJuego().getInitPosition()-1).ponerFicha(ficha);
                break;
            case VERDE:
                fabrica = new FabricaFichasVerde();
                ficha = fabrica.crearFicha(jugador.getId());
                jugador.getJuego().getFichas().add(ficha);
                this.casillasBlancas.get(jugador.getJuego().getInitPosition()-1).ponerFicha(ficha);
                break;
            case AZUL:
                fabrica = new FabricaFichasAzul();
                ficha = fabrica.crearFicha(jugador.getId());
                jugador.getJuego().getFichas().add(ficha);
                this.casillasBlancas.get(jugador.getJuego().getInitPosition()-1).ponerFicha(ficha);
                break;
            default:
                break;
        }
    }
    
    public void nextTurn() {
        if (this.turno == (this.jugadores.size()-1)) {
            this.turno = 0;
        } else {
            this.turno++;
        }
    }
    
    
    /**
     * Metodo utilizado para mover las fichas
     */
    //posicion por casilla en la que esta la ficha
    // cambiar constructor con posicion y next devuelve y luego incremento

    public boolean moverFicha(Ficha ficha, Casilla casillaActual, int nDado){
        int indexNextBox = (casillaActual.getPosicionActual()-1) + nDado;        
        Casilla casillaDestino = this.casillasBlancas.get(indexNextBox);
        boolean complete = casillaDestino.ponerFicha(ficha);
                
        return complete;
    }
	
    /**
    * Metodo utilizado para borrar las fichas. REVISAR
    */	
    /*public void borrarFicha(int posicion) {
            this.casillasBlancas.get(posicion-1).borrarFicha(this.casillasBlancas.get(posicion-1).getFichas().get(0));
    }*/

    public void cleanBox(int position, Ficha ficha) {
        this.casillasBlancas.get(position).getPanel().setBackground(java.awt.Color.gray);
        this.casillasBlancas.get(position).borrarFicha(ficha);
    }
    
    /**
     * Metoddo utilizado para modificar el numero de fichas en juego
     * @param fichasEnJuego indica el numero de fichas que hay en juego
     */
    /*public void SetFichasEnJuego(int fichasEnJuego){
        this.fichasEnJuego = fichasEnJuego;
    }*/
        
        
    public void setPanelCasilla(int indexCasilla, JPanel panel) {
        this.casillasBlancas.get(indexCasilla).setPanel(panel);
    }

    public int getTurno() {
    return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
