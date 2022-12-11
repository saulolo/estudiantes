package minticCicloJavaEstudiantes.controlador;

import minticCicloJavaEstudiantes.modelo.Modelo;
import java.util.InputMismatchException;
import java.util.Scanner;
import minticCicloJavaEstudiantes.vista.Vista;

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

    public static void ingresar() {
        //Guardamos los nombres en el array Nombres creado en la clase modelo.
        System.out.println("Ingrese por favor los nombre(s): \n");
        lector.input.nextLine();
        String Nombres = lector.input.nextLine();
        Modelo.nombres.add(Nombres);

        //Guardamos los apellidos en el array apellidos creado en la clase modelo
        System.out.println("Ingrese por favor los apellido(s): \n");
        String Apellidos = lector.input.nextLine();
        Modelo.apellidos.add(Apellidos);

        //Guardamos la fecha de nacimiento en el array fechaNacimiento creado en la clase modelo
        System.out.println("Ingrese por favor su fecha de nacimiento: \n");
        String Nacimiento = lector.input.nextLine();
        Modelo.nacimiento.add(Nacimiento);

        //Guardamos el correo electrónico en el array correo creado en la clase modelo
        System.out.println("Ingrese por favor su correo electronico: \n");
        String Correo = lector.input.nextLine();
        Modelo.correo.add(Correo);

        //Guardamos el número celular (de tipo long)en el array celular creado en la clase modelo
        //pero verificamos que no haya error en guardar.
        Long Celular;
        System.out.println("Ingrese por favor su número celular (Si no tiene ingrese el número 0): \n");
        //Se controla con un try-catch para que el usuario no ingrese texto.
        try {
            Celular = lector.input.nextLong();
        } catch (InputMismatchException exception) {
            Celular = (long) 0; //Tengo que hacer un casteo a Long porque 0 no es un long.
        }
        Modelo.celular.add(Celular);

        //Guardamos el programa académico en el programa creado en la clase modelo
        System.out.println("Ingrese por favor su programa académico: \n");
        String Programa = lector.input.nextLine();
        Modelo.programa.add(Programa);

        System.out.println("Usuario Registrado Correctamente \n");
    }

    public static void buscar() {
        System.out.println("Ingrese por favor el correo: ");
        lector.input.nextLine();//Trampita para que java no salte
        String Correo = lector.input.nextLine();
        int indice = Modelo.correo.indexOf(Correo);
        if (indice != -1) { //Si indexOf regresa un -1, quiere decir que no encontró el objeto.
            Vista.mostrar(indice);
        } else {
            System.out.println("Estudiante no registrasdo.");
        }
    }

    public static void modificar() {
        System.out.println("Ingrese por favor el correo: ");
        lector.input.nextLine();
        String Correo = lector.input.nextLine();
        int indice = Modelo.correo.indexOf(Correo);
        if (indice != -1) { //lo encontre
            System.out.println("Por favor ingrese los nombres correctamente");
            //String Nombre = lector.input.nextLine(); Modificamos el nombre relacionado con ese indice.
            Modelo.nombres.set(indice, lector.input.nextLine());//la pongo asi o conmo en la linea anterior
            System.out.println("Por favor ingrese los apellidos correctamente");
            String Apellido = lector.input.nextLine();
            Modelo.apellidos.set(indice, Apellido); //Modificamos el apellido relacionado con ese indice.
            System.out.println("Por favor ingrese la fecha de nacimiento correctamente (DD-MM-AAAA: ");
            String Nacimiento = lector.input.nextLine();
            Modelo.nacimiento.set(indice, Nacimiento); //Modificamos la fecha de nacimiento relacionado con ese indice.
            System.out.println("Por favor ingrese los apellidos correctamente");
            Long Celular = lector.input.nextLong();
            Modelo.celular.set(indice, Celular); //Modificamos el número celular relacionado con ese indice.
            System.out.println("Por favor ingrese el programa correctamente");
            String Programa = lector.input.nextLine();
            Modelo.programa.set(indice, Programa); //Modificamos el programa académico relacionado con ese indice.
            System.out.println("\n Estudiante modificado correctamente. \n");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }


    public static void eliminar() {
    }
}

class lector {

    static Scanner input = new Scanner(System.in);
}
