package ClasesYObjetos;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dieta {
    
    private String objetivo;
    private float totalCalorias;
    public ArrayList<Dieta> dieta = new ArrayList<>();
    public ArrayList<Alimento> alimentos = new ArrayList<>();
    Scanner Entrada = new Scanner(System.in);

    public Dieta() {
        
    }
    
    public Dieta(String objetivo, float totalCalorias, ArrayList<Alimento> alimentos) {
        this.objetivo = objetivo;
        this.totalCalorias = totalCalorias;
        this.alimentos = alimentos;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public float getTotalCalorias() {
        return totalCalorias;
    }

    public void setTotalCalorias(float totalCalorias) {
        this.totalCalorias = totalCalorias;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }
    
    public void InsertarDatosDieta(Persona p) throws ParseException{

        String Objetivo;
        float TotalCalorias = 0f;
        Calculadora calH = new calculosParaHombre();
        Calculadora calM = new calculosParaMujer();
        
        if("hombre".equals(p.getGenero())){
            TotalCalorias = calH.calcularHB(p.getGenero(), p.getPeso(), p.getAltura(), p.getEdad());
        }else if("mujer".equals(p.getGenero())){
            TotalCalorias = calM.calcularHB(p.getGenero(), p.getPeso(), p.getAltura(), p.getEdad());
        }
        
        
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Ingrese el objetivo de la dieta(mantener,subir,bajar): ");
        Objetivo = Entrada.next();
                
        if("mantener".equals(Objetivo)){
            System.out.println("El total de calorias que debe consumir es: "+TotalCalorias);
        }else if("subir".equals(Objetivo)){
            TotalCalorias += 600;
            System.out.println("El total de calorias que debe consumir es: "+TotalCalorias);
        }else if("bajar".equals(Objetivo)){
            TotalCalorias -= 500.0;
            System.out.println("El total de calorias que debe consumir es: "+TotalCalorias);
        }
                             
        System.out.println("¿Cuantos alimentos quiere?");
        int totalAlimentos = Entrada.nextInt();

        Alimento alimentosL = new Alimento();
        for(int i=0 ;i < totalAlimentos; i++){
            alimentosL.InsertarDatos();
        }  
                
        Dieta dietaNew = new Dieta(Objetivo,TotalCalorias,alimentosL.getLAlimento());
                
        dieta.add(dietaNew);
                
        System.out.println("!Dieta registrada!");
        
    }
    
    public void imprimirDatosDieta(){
    
        for (int i = 0; i < dieta.size(); i++) {
            System.out.println("Dieta "+(i+1)+":");
            System.out.println("-Objetivo dieta: "+dieta.get(i).getObjetivo());
            System.out.println("-Total calorias: "+dieta.get(i).getTotalCalorias());
            for (int j = 0; j < dieta.get(i).alimentos.size(); j++) {
                System.out.println("Lista de alimentos:");
                System.out.println("("+(j+1)+")Nombre alimento: "+dieta.get(i).alimentos.get(j).getNombre()+" - Tipo: "+dieta.get(i).alimentos.get(j).getTipo()+" - Calorias: "+dieta.get(i).alimentos.get(j).getCalorias());
            }  
        }
                  
    }
    
    public void actualizarDieta(String objetivoDieta){
        
        for (int i = 0; i < dieta.size(); i++) {
            if (dieta.get(i).getObjetivo().equals(objetivoDieta)) {
                String Objetivo;
                int TotalCalorias;

                System.out.println("¡Para actualizar datos de la dieta ingreselos nuevamente!");
                System.out.println("Ingrese el objetivo de la dieta(mantener,subir,bajar): ");
                Objetivo = Entrada.next();

                System.out.println("Ingrese el total de calorias: ");
                TotalCalorias = Entrada.nextInt();

                System.out.println("¿Cuantos alimentos quiere?");
                int totalAlimentos = Entrada.nextInt();

                Alimento alimentosL = new Alimento();
                for(int j=0 ;j < totalAlimentos; j++){
                    alimentosL.InsertarDatos();
                }  

                Dieta dietaActualizada = new Dieta(Objetivo,TotalCalorias,alimentosL.getLAlimento());

                dieta.set(i, dietaActualizada);

                System.out.println("!Dieta actualizada!");
            }
        }
    }
    
    public void eliminarDieta(String nombreDieta){
    
        for (int i = 0; i < dieta.size(); i++) {
            if(dieta.get(i).getObjetivo().equals(nombreDieta)){
                dieta.remove(i);
            }
        }
    }
    
    public boolean buscarDieta(String nombreDieta){
    
        for (int i = 0; i < dieta.size(); i++) {
            if(dieta.get(i).getObjetivo().equals(nombreDieta)){
                return true;
            }
        }
        return false;
    }
    
    public void reporteTxtDietas(){
        ArchivosTxt txt = new ArchivosTxt();
        txt.crearArchivo("ReporteDietas.txt");
        
        for(int i=0; i<dieta.size(); i++){
            txt.anexarArchivo("ReporteDietas.txt", "--------------(Dieta N°"+(i+1)+")--------------");
            txt.anexarArchivo("ReporteDietas.txt", "--(Objetivo: " + dieta.get(i).getObjetivo()+ ")--");
            txt.anexarArchivo("ReporteDietas.txt", "--(Total calorias: " + dieta.get(i).getTotalCalorias()+ ")--");
            txt.anexarArchivo("ReporteDietas.txt", "-----------Lista de alimentoss-----------");
            for(int j=0; j<dieta.get(i).alimentos.size(); j++){
                txt.anexarArchivo("ReporteDietas.txt","--(Alimento: "+dieta.get(i).alimentos.get(j).getNombre()+")--");
                txt.anexarArchivo("ReporteDietas.txt","--(Tipo: "+dieta.get(i).alimentos.get(j).getTipo()+")--");
                txt.anexarArchivo("ReporteDietas.txt","--(Calorias: "+dieta.get(i).alimentos.get(j).getCalorias()+")--");
            }  
            txt.anexarArchivo("ReporteDietas.txt", "-----------------------------------------");
            txt.anexarArchivo("ReporteDietas.txt", " ");
        }
        System.out.println("¡Reporte de dietas creado exitosamente!");
    }
     
    public void imprimirAlimentos(){

        System.out.println("Lista de alimentos");
        for (int i = 0; i < alimentos.size(); i++) {
            System.out.println("("+(i+1)+") Nombre: "+alimentos.get(i).getNombre()+", tipo: "+alimentos.get(i).getTipo());
        }
    }
       
}