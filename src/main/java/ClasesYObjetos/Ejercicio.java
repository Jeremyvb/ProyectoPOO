package ClasesYObjetos;

public abstract class Ejercicio {
    
    public String Nombre;
    public int horasAlDia;

    public Ejercicio(String Nombre, int horasAlDia) {
        this.Nombre = Nombre;
        this.horasAlDia = horasAlDia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getHorasAlDia() {
        return horasAlDia;
    }

    public void setHorasAlDia(int horasAlDia) {
        this.horasAlDia = horasAlDia;
    } 
    
    public abstract String calcularNivelDeIntensidad();
    
   
    
}