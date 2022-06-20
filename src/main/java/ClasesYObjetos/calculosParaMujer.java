/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author j20vi
 */
public class calculosParaMujer implements Calculadora{
    
    float harrisB = 0.0f;
    float imc = 0.0f;
    
    @Override
    public float calcularHB(String Genero, float Peso, float Altura, int Edad) {
        return harrisB = (float) ((10 * Peso) + (6.25 * Altura) - (5 * Edad) - 161);
    }
    
    @Override
    public float calcularImc(float Peso, float Altura) {
        return imc = (float) (Peso / (Math.pow(Altura, 2.0)));
    }
    
}
