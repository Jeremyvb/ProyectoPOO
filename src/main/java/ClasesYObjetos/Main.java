package ClasesYObjetos;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    
    static Scanner Entrada = new Scanner(System.in);   
    public static Persona usuarios = new Persona();
    public static Dieta dieta = new Dieta();
    public static Alimento alimentos = new Alimento();

    public static void main(String[] args) throws ParseException {
       
        int option;
        Menu menu = new Menu();
        
        System.out.println("Hola");
        
        Persona admin = new Persona("Jeremy","Villalobos","20.371.230-8","jeremy.villalobos.b@gmail.com","123","admin");
        usuarios.personas.add(admin);
               
        do {
            menu.menuPrincipal();
            System.out.println("Ingrese una opcion: ");
            option = Entrada.nextInt();
            if(option == 1){
                String rut;
                String password;
                System.out.println("Ingrese su rut: ");
                rut = Entrada.next();
                System.out.println("Ingrese contraseña: ");
                password = Entrada.next();
                
                if(usuarios.esAdmin(rut, password)){
                    
                    System.out.println("sesion iniciada como admin!");
                    menu.menuAdmin();
                    System.out.println("Ingrese una opcion: ");
                    int opt = Entrada.nextInt();
                    
                    while (opt != 0) {                        
                        switch(opt){
                            case 1:
                                 //Crear usuario
                                usuarios.insertarDatosPersona();
                            break;

                            case 2:
                                //Imprimir usuarios
                                usuarios.imprimirDatosUsuarios();
                            break;

                            case 3:
                                //Actualizar usuario
                                String rutAActualizar;
                                System.out.println("Ingrese el rut del usuario a actualizar:");
                                rutAActualizar = Entrada.next();
                                usuarios.actualizarUsuario(rutAActualizar);
                            break;

                            case 4:
                                //Eliminar usuario
                                String rutAEliminar;
                                System.out.println("Ingrese el rut del usuario a eliminar:");
                                rutAEliminar = Entrada.next();
                                usuarios.eliminarUsuario(rutAEliminar);
                            break;

                            case 5:
                                //Imprimir usuarios
                                dieta.imprimirDatosDieta();
                            break;

                            case 6:
                                //Insertar alimento
                                alimentos.InsertarDatos();
                            break;

                            case 7:
                                //Eliminar alimento
                                String nombreA;
                                System.out.println("Ingrese el nombre del alimento a eliminar:");
                                nombreA = Entrada.next();
                                alimentos.eliminarAlimento(nombreA);
                            break;

                            case 8:
                                //Reporte txt usuarios
                                usuarios.reporteTxtUsuarios();
                            break;

                            case 9:
                                //Reporte txt usuarios
                                dieta.reporteTxtDietas();
                            break;
                        }
                        menu.menuAdmin();
                        System.out.println("Ingrese una opción: ");
                        opt = Entrada.nextInt();
                    }
                }else if(usuarios.esAdmin(rut, password) == false && usuarios.buscarUsuario(rut)){
                    
                    menu.MenuUsuario();
                    System.out.println("Ingrese una opción: ");
                    int op = Entrada.nextInt();
                    Persona p = new Persona();
                    p = usuarios.buscarUsuario2(rut);
                    
                    while (op != 0) {                        
                        switch(op){
                            case 1:
                                //Crear dieta
                                dieta.InsertarDatosDieta(p);
                            break;

                            case 2:
                                //Ver lista alimentos
                                dieta.imprimirAlimentos();
                            break;

                            case 3:
                                //Imprimir ejercicios del usuario
                                String rutU;
                                System.out.println("Ingrese su rut:");
                                rutU = Entrada.next();
                                usuarios.imprimirEjerciciosUsuario(rutU);
                            break;

                            case 4:
                                //Actualizar datos usuario
                                String rutAActualizar;
                                System.out.println("Ingrese su rut para actualizar datos:");
                                rutAActualizar = Entrada.next();
                                usuarios.actualizarUsuario(rutAActualizar);
                            break;
                        }
                        menu.MenuUsuario();
                        System.out.println("Ingrese una opción: ");
                        op = Entrada.nextInt();
                    }
                }else{
                    System.out.println("¡No existe el usuario en el sistema!");
                }
                
            }
            else if(option == 2)
            {
                usuarios.insertarDatosPersona();
                
            }else if(option == 3){
                break;
            }
            
        } while (option != 3);  
    }
}
    
