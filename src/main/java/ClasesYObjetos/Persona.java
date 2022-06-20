package ClasesYObjetos;

import static ClasesYObjetos.Main.Entrada;
import Ejercicios.Caminar;
import Ejercicios.Correr;
import java.util.ArrayList;

public class Persona {
    
    private String Nombre;
    private String Apellido;
    private String Rut;
    private String Email;
    private String Contrasenia;   
    private String Tipo;
    private String Genero;
    private float Peso;
    private float Altura;
    private int Edad;
    private int ActividadFisica;
    
    public ArrayList<Persona> personas = new ArrayList<>();
    public ArrayList<Ejercicio> LEjercicios = new ArrayList<>();

    public Persona(){
    
    }
    
    public Persona(String Nombre, String Apellido, String Rut, String Email, String Contrasenia, String tipo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Rut = Rut;
        this.Email = Email;
        this.Contrasenia = Contrasenia;
        this.Tipo = tipo;
    }

    public Persona(String Nombre, String Apellido, String Rut, String Email, String Contrasenia, String tipo, String Genero, float Peso, float Altura, int Edad, int ActividadFisica, ArrayList<Ejercicio> ejercicios) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Rut = Rut;
        this.Email = Email;
        this.Contrasenia = Contrasenia;
        this.Tipo = tipo;
        this.Genero = Genero;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Edad = Edad;
        this.ActividadFisica = ActividadFisica;
        this.LEjercicios = ejercicios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getActividadFisica() {
        return ActividadFisica;
    }

    public void setActividadFisica(int ActividadFisica) {
        this.ActividadFisica = ActividadFisica;
    }
    
    public void insertarDatosPersona(){
    
        String nombre;
        String apellido;
        String rut;
        String email;
        String contrasenia;   
        String tipo;
        String genero;
        float peso;
        float altura;
        int edad;
        int actividadFisica;
        
        System.out.println("Ingrese su nombre: ");
        nombre = Entrada.next();
                
        System.out.println("Ingrese su apellido: ");
        apellido = Entrada.next();
        
        System.out.println("Ingrese su rut (ej:20.390.405-1): ");
        rut = Entrada.next();
                
        System.out.println("Ingrese su email: ");
        email = Entrada.next();
                
        System.out.println("Ingrese su contraseña: ");
        contrasenia = Entrada.next();
                
        tipo = "usuario";
                
        System.out.println("Ingrese su genero: ");
        genero = Entrada.next();
                
        System.out.println("Ingrese su peso en kilos: ");
        peso = Entrada.nextFloat();
                
        System.out.println("Ingrese su altura en cm: ");
        altura = Entrada.nextFloat();
                
        System.out.println("Ingrese su edad: ");
        edad = Entrada.nextInt();
                
        System.out.println("Ingrese su actividad fisica en horas diarias: ");
        actividadFisica = Entrada.nextInt();
                
        System.out.println("¿Cuantos ejercicios realiza?");
        int totalEjercicios = Entrada.nextInt();

        for(int j=0 ;j < totalEjercicios; j++){
        System.out.println("Nombre del ejercicio(caminar/correr): ");
        String eje;
        eje = Entrada.next();
        if("caminar".equals(eje)){
            Ejercicio ejercicio = new Caminar("caminar",actividadFisica);
            String intensidad = ejercicio.calcularNivelDeIntensidad();
            System.out.println("La intensidad del ejercicio debe ser: "+intensidad);

            LEjercicios.add(ejercicio);
        }else if("correr".equals(eje)){
            Ejercicio ejercicio = new Correr("correr",actividadFisica);
            String intensidad = ejercicio.calcularNivelDeIntensidad();
            System.out.println("La intensidad del ejercicio debe ser: "+intensidad);
            LEjercicios.add(ejercicio);
        }
        }  
                
        Persona usuarioNew = new Persona(nombre,apellido,rut,email,contrasenia,tipo,genero,peso,altura,edad,actividadFisica,LEjercicios);
                
        personas.add(usuarioNew);
                
        System.out.println("!Usuario registrado!");
    }
    
    public void imprimirDatosUsuarios(){
        
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("Usuario "+(i+1)+":");
            System.out.println("-Nombre: "+personas.get(i).getNombre());
            System.out.println("-Apellido: "+personas.get(i).getApellido());
            System.out.println("-Rut: "+personas.get(i).getRut());
            System.out.println("-Email: "+personas.get(i).getEmail());
            System.out.println("-Contraseña: "+personas.get(i).getContrasenia());
            System.out.println("-Genero: "+personas.get(i).getGenero());
            System.out.println("-Peso: "+personas.get(i).getPeso());
            System.out.println("-Altura: "+personas.get(i).getAltura());
            System.out.println("-Edad: "+personas.get(i).getEdad());
            for (int j = 0; j < personas.get(i).LEjercicios.size(); j++) {
                System.out.println("Lista de ejercicios:");
                System.out.println("("+(j+1)+")Nombre ejercicio: "+personas.get(i).LEjercicios.get(j).getNombre()+" - Horas diarias: "+personas.get(i).LEjercicios.get(j).getHorasAlDia());
            }     
        }
    
    }
    
    public void imprimirEjerciciosUsuario(String rutUsuario){
    
        Persona p = buscarUsuario2(rutUsuario);
        for (int i = 0; i < p.LEjercicios.size(); i++) {
            System.out.println("Ejercicio "+(i+1)+":");
            System.out.println("-Nombre ejercicio: "+p.LEjercicios.get(i).getNombre());
            System.out.println("-Horas al día: "+p.LEjercicios.get(i).getHorasAlDia());
        }
    }
    
    public void actualizarUsuario(String rutUsuario){
        
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getRut().equals(rutUsuario)){
                
                String nombre;
                String apellido;
                String rut;
                String email;
                String contrasenia;   
                String tipo;
                String genero;
                float peso;
                float altura;
                int edad;
                int actividadFisica;
                
                System.out.println("¡Para actualizar sus datos ingreselos nuevamente!");
                System.out.println("Ingrese su nombre: ");
                nombre = Entrada.next();

                System.out.println("Ingrese su apellido: ");
                apellido = Entrada.next();

                System.out.println("Ingrese su rut (ej:20.390.405-1): ");
                rut = Entrada.next();

                System.out.println("Ingrese su email: ");
                email = Entrada.next();

                System.out.println("Ingrese su contraseña: ");
                contrasenia = Entrada.next();

                tipo = "usuario";

                System.out.println("Ingrese su genero: ");
                genero = Entrada.next();

                System.out.println("Ingrese su peso en kilos: ");
                peso = Entrada.nextFloat();

                System.out.println("Ingrese su altura en cm: ");
                altura = Entrada.nextFloat();

                System.out.println("Ingrese su edad: ");
                edad = Entrada.nextInt();

                System.out.println("Ingrese su actividad fisica en horas diarias: ");
                actividadFisica = Entrada.nextInt();

                System.out.println("¿Cuantos ejercicios realiza?");
                int totalEjercicios = Entrada.nextInt();
                
                for(int j=0 ;j < totalEjercicios; j++){
                    System.out.println("Nombre del ejercicio(caminar/correr): ");
                    String eje;
                    eje = Entrada.next();
                    if("caminar".equals(eje)){
                        Ejercicio ejercicio = new Caminar("caminar",actividadFisica);
                        LEjercicios.add(ejercicio);
                    }else if("correr".equals(eje)){
                        Ejercicio ejercicio = new Correr("caminar",actividadFisica);
                        LEjercicios.add(ejercicio);
                    }
                    
                } 
                
                Persona usuarioActualizado = new Persona(nombre,apellido,rut,email,contrasenia,tipo,genero,peso,altura,edad,actividadFisica,LEjercicios);
                
                personas.set(i, usuarioActualizado);

                System.out.println("!Usuario actualizado!");
                break;
            }
        }
    }
    
    public void eliminarUsuario(String rutUsuario){
    
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getRut().equals(rutUsuario)){
                personas.remove(i);
            }
        }
    }
    
    public boolean buscarUsuario(String rutUsuario){
    
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getRut().equals(rutUsuario)){
                return true;
            }
        }
        return false;
    }
    
    public Persona buscarUsuario2(String rutUsuario){
    
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getRut().equals(rutUsuario)){
                return personas.get(i);
            }
        }
        return null;
    }
    
    public boolean esAdmin(String rut, String password){
    
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getRut().equals(rut) && personas.get(i).getContrasenia().equals(password)){
                if(personas.get(i).getTipo().equalsIgnoreCase("admin")){
                    return true;
                }
            }
        }
        return false;
    }
    
    public void reporteTxtUsuarios(){
        ArchivosTxt txt = new ArchivosTxt();
        txt.crearArchivo("ListaUsuarios.txt");
        
        for(int i=0; i<personas.size(); i++){
            txt.anexarArchivo("ListaUsuarios.txt", "--------------(Usuario N°"+(i+1)+")--------------");
            txt.anexarArchivo("ListaUsuarios.txt", "--(Nombre: " + personas.get(i).getNombre()+ ")--");
            txt.anexarArchivo("ListaUsuarios.txt", "--(Apellido: " + personas.get(i).getApellido()+ ")--");
            txt.anexarArchivo("ListaUsuarios.txt", "--(Rut: " + personas.get(i).getRut()+ ")--");
            txt.anexarArchivo("ListaUsuarios.txt", "--(Emai: " + personas.get(i).getEmail()+ ")--");
            txt.anexarArchivo("ListaUsuarios.txt", "--(Contraseña: " + personas.get(i).getContrasenia()+ ")--");
            txt.anexarArchivo("ListaUsuarios.txt", "--(Genero: " + personas.get(i).getGenero()+ ")--");
            txt.anexarArchivo("ListaUsuarios.txt", "--(Peso: " + personas.get(i).getPeso()+ ")--");
            txt.anexarArchivo("ListaUsuarios.txt", "--(Altura: " + personas.get(i).getAltura()+ ")--");
            txt.anexarArchivo("ListaUsuarios.txt", "--(Edad: " + personas.get(i).getEdad()+ "9--");
            txt.anexarArchivo("ListaUsuarios.txt", "-----------Lista de ejercicios-----------");
            for(int j=0; j<personas.get(i).LEjercicios.size(); j++){
                txt.anexarArchivo("ListaUsuarios.txt","--(Ejercicio: "+personas.get(i).LEjercicios.get(j).getNombre()+")--");
                txt.anexarArchivo("ListaUsuarios.txt","--(Horas: "+personas.get(i).LEjercicios.get(j).getHorasAlDia()+")--");
            }  
            txt.anexarArchivo("ListaUsuarios.txt", "-----------------------------------------");
            txt.anexarArchivo("ListaUsuarios.txt", " ");
        }
        System.out.println("¡Reporte de usuarios creado exitosamente!");
    }
     
}
