package minticCicloJavaEstudiantes.modelo;

import minticCicloJavaEstudiantes.controlador.Controlador;
import minticCicloJavaEstudiantes.vista.Vista;

import java.util.ArrayList;

/* @author: Saulolo */
public class Modelo {//Creación de una clase

    /*
    EL MODELO: El que le dice a mi código, el paso a paso de lo que hay que hacer.
     */
    //Paso 1: crear modelos.
    public static ArrayList<String> nombres = new ArrayList<String>();
    public static ArrayList<String> apellidos = new ArrayList<String>();
    public static ArrayList<String> nacimiento = new ArrayList<String>();
    public static ArrayList<String> correo = new ArrayList<String>();
    public static ArrayList<Long> celular = new ArrayList<String>();
    public static ArrayList<String> programa = new ArrayList<String>();

    public static void main(String[] args) {
        while (true) {

            Vista.imprimirMenu();
            int valor = Controlador.capturarOpcion();
            if (valor == 1) {
                System.out.println("Ingresar estudiante: ");
                Controlador.ingresar();
            } else if (valor == 2) {
                System.out.println("Buscar estudiante: ");
                Controlador.buscar();
            } else if (valor == 3) {
                System.out.println("Modificar estudiante: ");
                Controlador.modificar();
            } else if (valor == 4) {
                System.out.println("Eliminar estudiante: ");
                Controlador.eliminar();
            } else if (valor == 5) {
                System.out.println("Ver lista de  estudiante: ");
                Vista.verDirectorio();
            } else if (valor == 6) {
                System.out.println("Hasta pronto");
                System.exit(0);
            }
        }
    }
}
