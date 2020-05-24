/**
 *  FabricaFichasAmarilla.java
 *  Creada el 5/05/2020, 03:48:18 PM
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
 * @date 5/05/2020
 */
public class FabricaFichasAmarilla implements FabricaAbstractaFichas{

    @Override
    public Ficha crearFicha() {
    Color c1 = Color.AMARILLO;
    Ficha f1 = new Ficha(c1);
    return f1;
    }

}
