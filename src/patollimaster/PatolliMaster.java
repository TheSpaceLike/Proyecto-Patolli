/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patollimaster;


/**
 *
 * @author Misael Mendoza Gtz misaelmendozagtz@gmail.com
 */
public class PatolliMaster {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patolli patolli = new Patolli();
        patolli.addJugadores();
        patolli.play();
        
        /*Jugador asd = new Jugador(Color.ROJO);
		asd.JugadorIA();
		asd.Mover();
		
		asd.JugadorNormal();
		asd.Mover();*/
    }
    
}
