package ClasesYObjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Alimento {
    
    private String nombre;
    private String tipo;
    private int calorias;
    public ArrayList<Alimento> LAlimentos = new ArrayList<>();
    
    public Alimento(){
    
    }
    
    public ArrayList<Alimento> getLAlimento() {
        return LAlimentos;
    }

    public Alimento(String nombre, String tipo, int calorias) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    
    public void InsertarDatos(){

         String Nombre;
         String Tipo;
         int Calorias;

         Scanner Entrada = new Scanner(System.in);
         System.out.println("Inserte los siguientes datos del alimento");
         System.out.println("Nombre del alimento: ");
         Nombre = Entrada.next();

         System.out.println("Tipo de alimento: ");
         Tipo = Entrada.next();
         
         System.out.println("Cantidad de calorias por unidad: ");
         Calorias = Entrada.nextInt();

         Alimento ali = new Alimento(Nombre,Tipo,Calorias);
         LAlimentos.add(ali);

    }
    
    public void eliminarAlimento(String nombreAlimento){
    
        for (int i = 0; i < LAlimentos.size(); i++) {
            if(LAlimentos.get(i).getNombre().equals(nombreAlimento)){
                LAlimentos.remove(i);
            }
        }
    }
    
    public boolean buscarAlimento(String nombreAlimento){
    
        for (int i = 0; i < LAlimentos.size(); i++) {
            if(LAlimentos.get(i).getNombre().equals(nombreAlimento)){
                return true;
            }
        }
        return false;
    }
    
}
