/**
 *  Vista.java
 *  Creada el 5/05/2020, 05:20:51 PM
 *  Clase Java desarrollada por Misael Mendoza Gtz     misaelmendozagtz@gmail.com como ejercicio educativo del programa
 *  ISW del Instituto Tecnológico de Sonora Unidad Nainarí
 *  Para información sobre el uso de esta clase, así como bugs, actualizaciones
 *  o mejoras enviar un email a misaelmendozagtz@gmail.com
**/

package patollimaster;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Misael Mendoza Gtz     misaelmendozagtz@gmail.com
 * @version 1.0
 * @author-mail misaelmendozagtz@gmail.com
 * @date 5/05/2020
 */
public interface Vista {

    public void welcome();
    public int askNumeroJugadores();
    public int askColor(int numJugador, ArrayList<Color> colores);
    public int askTipoJugador();
    public void pressAnyKeyToContinue();
    public void turnoJugador(Jugador jugador);
    
    public static int eleccionFicha(Color color, int fichaEnJuego){
        System.out.println("Cual quieres mover?" + "-" + color.toString());    
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i <= fichaEnJuego) {
            System.out.println("Jugador-" + color + "-muevo la ficha numero: " + i);
            return i;
        } else {
            return 0;
        }
    }
    
    public static int eleccionFichaIA(Color color, int fichaEnJuego){
        // Empieza aqui
        Random random = new Random();
        random.setSeed(new Date().getTime());
        int rNumber = random.nextInt(fichaEnJuego)+1;
        System.out.println("IA-" + color + "-muevo la ficha numero: " + rNumber);
        return rNumber;
    }
    
    public static void resultadoDado (int result){
        System.out.println("?Has sacado: " + result);
    }
    
    public static void mostrarFichasEnJuego(ArrayList<Casilla> listaFichasJugador, int size) {
        for (int i = 0; i < listaFichasJugador.size(); i++) {
            System.out.println("Ficha " + (i+1) + " en casilla: " + listaFichasJugador.get(i).getPosicionActual() + "\n");
        }
    }
}
