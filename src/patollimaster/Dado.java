/**
 *  Dado.java
 *  Creada el 5/05/2020, 05:05:19 PM
 *  Clase Java desarrollada por Misael Mendoza Gtz     misaelmendozagtz@gmail.com como ejercicio educativo del programa
 *  ISW del Instituto Tecnológico de Sonora Unidad Nainarí
 *  Para información sobre el uso de esta clase, así como bugs, actualizaciones
 *  o mejoras enviar un email a misaelmendozagtz@gmail.com
**/

package patollimaster;

import java.util.Date;
import java.util.Random;

/**
 * --------------PATRON MODELO VISTA CONTROLADOR-------------------
 * @author Misael Mendoza Gtz     misaelmendozagtz@gmail.com
 * @version 1.0
 * @author-mail misaelmendozagtz@gmail.com
 * @date 5/05/2020
 */
public class Dado {
    private static Dado _instanciaDado = null;
    Random random;
    
        private Dado(){
            random = new Random();
            random.setSeed(new Date().getTime());
        }
        
        public static Dado crearDado(){
            if (_instanciaDado == null) {
                _instanciaDado = new Dado();
            }
            return _instanciaDado;
        }
        /**
         * Metodo para obtener un numero aleatorio entre el 0 y el 1
         */
      public int tirarDado(){
          int n = random.nextInt(1)+1;
          Vista.resultadoDado(n);
          return n;
        }
}
