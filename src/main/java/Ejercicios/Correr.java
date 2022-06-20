/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import ClasesYObjetos.*;
/**
 *
 * @author j20vi
 */
public class Correr extends Ejercicio{

    public Correr(String Nombre, int horasAlDia) {
        super(Nombre, horasAlDia);
    }

    @Override
    public String calcularNivelDeIntensidad() {
        if(horasAlDia == 1){
            return "media";
        }else if(horasAlDia > 1){
            return "baja";
        }
        return null;
    }
    
}
