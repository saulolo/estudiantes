package minticCicloJavaEstudiantes.controlador;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @author: Saulolo */
public class Controlador {
    
    /*
    EL CONTROLADOR: Es el que hace todo el trabajo y tiene que grabarlo, el que\
    graba en la base de datos, el que va a subir, el que va a bajar, el que voltea.
    Y esta condicionado por la logica o el diseño que viene demarcada en el Modelo.
    El que ejecuta.
    */

    public static int capturarOpcion() {
        int opcion = 0;
        while (opcion < 1 || opcion > 6) { //Controlamos que el número este dentro del rango
            System.out.println("Opción: \n");
            try {                          //Controlamos que el usuario si ingrese un número
                opcion = lector.input.nextInt();
            } catch (InputMismatchException exception) {
                opcion = lector.input.nextInt();
            }
        }
        return opcion;
    }
    
    public static String ingresar(){
        return " ";
    }
    
    public static String buscar(){
        return " ";
    }
    
    public static String modificar(){
        return " ";
    }
    
    public static String eliminar(){
        return " ";
    }
}

class lector {

    static Scanner input = new Scanner(System.in);
}

