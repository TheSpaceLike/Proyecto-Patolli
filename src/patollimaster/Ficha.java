/**
 *  Ficha.java
 *  Creada el 20/04/2020, 02:17:10 PM
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
 * @date 20/04/2020
 */
class Ficha {
    private Color color;
     
    public Ficha(Color c1){
        this.color = c1;
    }

    public Color getColor() {
        return color;
    }
}
  enum Color{
      AMARILLO,
      ROJO,
      VERDE,
      AZUL,
  }
    
