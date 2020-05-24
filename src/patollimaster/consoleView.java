/**
 *  consoleView.java
 *  Creada el 16/05/2020, 12:07:42 PM
 *  Clase Java desarrollada por Misael Mendoza Gtz     misaelmendozagtz@gmail.com como ejercicio educativo del programa
 *  ISW del Instituto Tecnológico de Sonora Unidad Nainarí
 *  Para información sobre el uso de esta clase, así como bugs, actualizaciones
 *  o mejoras enviar un email a misaelmendozagtz@gmail.com
**/

package patollimaster;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Misael Mendoza Gtz     misaelmendozagtz@gmail.com
 * @version 1.0
 * @author-mail misaelmendozagtz@gmail.com
 * @date 16/05/2020
 * ------------------MVC-----------------
 */
public class consoleView implements Vista {

    @Override
    public void welcome() {
        System.out.println("Bienvenido al juego PATOLLI");    }

    @Override
    public int askNumeroJugadores() {
        Scanner scan = new Scanner(System.in);
        int nJugadores = -1;
        while(nJugadores < 1 || nJugadores > 4){
            System.out.println("Cuantos jugadores son? ( de 1 a 4)");
            nJugadores = scan.nextInt();
        }
        return nJugadores;
        }

    @Override
    public int askColor(int numJugador, ArrayList<Color> colores) {
        Scanner sc = new Scanner(System.in);
		System.out.println("El jugador-" + numJugador );
        System.out.println("¿Con que color jugara?");
        int n = 1;
        for(Color color: colores) {
            System.out.println(n+"-"+color.toString());
            n++;
        }
        int opcion = sc.nextInt();
		return opcion;
    }

    @Override
    public int askTipoJugador() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sera un jugador o un IA?");
        System.out.println("1 para Humano y 2 para IA");
        int opcion = scan.nextInt();
        return opcion;
    }

    @Override
    public void pressAnyKeyToContinue() {
        System.out.println("Pulsa ENTER para tirar el dado.\n");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}
    }

    @Override
    public void turnoJugador(Jugador jugador) {
        System.out.println("Turno jugador " + jugador.tipoJ.toString() + "-" + jugador.color.toString());
    }
    
}
