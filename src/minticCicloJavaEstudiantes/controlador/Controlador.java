package minticCicloJavaEstudiantes.controlador;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @author: Saulolo */

public class Controlador {
    
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
}

class lector{
    static Scanner input = new Scanner(System.in);
}
