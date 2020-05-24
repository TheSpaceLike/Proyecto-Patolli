/**
 *  JugadorIA.java
 *  Creada el 6/05/2020, 10:41:04 AM
 *  Clase Java desarrollada por Misael Mendoza Gtz     misaelmendozagtz@gmail.com como ejercicio educativo del programa
 *  ISW del Instituto Tecnológico de Sonora Unidad Nainarí
 *  Para información sobre el uso de esta clase, así como bugs, actualizaciones
 *  o mejoras enviar un email a misaelmendozagtz@gmail.com
**/

package patollimaster;

/**
 * @author Misael Mendoza Gtz     misaelmendozagtz@gmail.com
 * @version 1.0
 * @author-mail misaelmendozagtz@gmail.com
 * @date 6/05/2020
 */
public class JugadorIA implements ITipoJugador{
    public String ObtenerDescripcion() {
        return "Jugador IA";
    }
    public int eleccion(Color color, int fichaEnJuego){
        return Vista.eleccionFichaIA(color, fichaEnJuego);
    }
}
