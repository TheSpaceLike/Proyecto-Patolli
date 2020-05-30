/**
 *  Ficha.java
 *  Creada el 20/04/2020, 02:17:10 PM
 *  Clase Java desarrollada por Misael Mendoza Gtz     misaelmendozagtz@gmail.com como ejercicio educativo del programa
 *  ISW del Instituto Tecnológico de Sonora Unidad Nainarí
 *  Para información sobre el uso de esta clase, así como bugs, actualizaciones
 *  o mejoras enviar un email a misaelmendozagtz@gmail.com
**/

package Dominio;


public class Ficha {
    private Color color;
    private int userId;
    private int avance = 0;
     
    public Ficha(int userId, Color c1){
        this.color = c1;
        this.userId = userId;
    }

    public Color getColor() {
        return color;
    }
    
    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }
    
    public void addAvance(int avance) {
        this.avance += avance;
    }
    
}
    
