/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alan Acatictla M.
 */
public class Preferencia {
    
       private List<String> colores;

    public Preferencia(String color2, String color3, String color4) {
        colores = new ArrayList<>();
        colores.add(color2);
        colores.add(color3);
        colores.add(color4);
    }

    public List<String> getColores() {
        return colores;
    }

    public void setColores(List<String> colores) {
        this.colores = colores;
    }
    
}
